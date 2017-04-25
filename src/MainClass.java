/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.soft.sanjay.operation.DataServer;
import java.io.IOException;
public class MainClass {
    public static void main(String[] args) throws IOException{
        DataServer ds = new Test(5555,"Sanjay");
        ds.startComponent();

    }
}
