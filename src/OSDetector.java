/**
 * Created by user on 09-04-2017.
 */
public class OSDetector {
    private final static String OS = System.getProperty("os.name");
    private static String s_OSType;
    public OSDetector(){
        super();
        s_OSType=OS.toLowerCase();
    }
    public static String getOS(){
        if(OS.indexOf("Win")>=0){
            s_OSType="Windows";
            return s_OSType;
        }
        else if(OS.indexOf("nix")>=0){
            s_OSType="Unix";
            return s_OSType;
        }
        else{
            s_OSType="Mac";
            return s_OSType;
        }
    }
}
//Done
