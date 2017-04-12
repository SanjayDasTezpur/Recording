/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.soft.sanjay.operation.FileUtils;

import java.io.IOException;
import java.util.List;

public class MainClass {
    public static void main(String[] args) throws IOException{
        String sBuildLine="";
        List<String> runCommand = ExecuteCommand.runCommand("ipconfig");
        for(int i=0; i<runCommand.size(); i++) {
            System.out.println("Line "+i+":- "+ runCommand.get(i));
            sBuildLine=sBuildLine+"\n"+runCommand.get(i);
        }
        FileUtils fu = new FileUtils("E:\\Sanjay\\test1.txt");
        System.out.println("Test :-- "+sBuildLine);
        fu.changeFileContent(1,sBuildLine);
    }
}
