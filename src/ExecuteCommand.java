/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sanjay
 */
public class ExecuteCommand extends OSDetector{
    public static List<String> runCommand(String sCommand) throws IOException{
        List<String> lOutput = new ArrayList<>();
        String sbuildCommand="";
        try{
            if(getOS().equalsIgnoreCase("Windows")){
                sbuildCommand="cmd.exe /c ";
            }
            sbuildCommand=sbuildCommand+sCommand;
            Process proc = Runtime.getRuntime().exec(sbuildCommand);
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            while((in.readLine()) != null){
                lOutput.add(in.readLine());
                System.out.println("Output:- "+in.readLine());
            }
        }catch(Exception e){
            System.out.println("Exception caught in : "+e.getMessage());
        }
        return lOutput;
    }

}
//sexy code