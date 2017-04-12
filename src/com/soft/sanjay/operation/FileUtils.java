package com.soft.sanjay.operation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by user on 09-04-2017.
 */
public class FileUtils {

    private String sFileName;
    public FileUtils(String sFilePath){
        super();
        sFileName=sFilePath;
    }
    public boolean changeFileContent(int lineNo, String sLinesToBeInserted) throws IOException{
        FileWriter fw = null;
        BufferedWriter bw=null;
        try{
            File a = new File(sFileName);
            a.createNewFile();
            fw = new FileWriter(a);
            bw = new BufferedWriter(fw);
            bw.write(sLinesToBeInserted);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        finally {
            if(bw!=null)
                bw.close();
            if(fw!=null)
                fw.close();
        }

    }

} //sexy code
