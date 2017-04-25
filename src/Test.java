import com.soft.sanjay.operation.DataServer;

import java.io.IOException;

/**
 * Created by user on 24-04-2017.
 */
public class Test extends DataServer {
    String str;

    public Test(int iPort) {
        super(iPort);

    }

    public Test(int iPort,Object obj) {
        super(iPort,obj);
    }

    @Override
    public Object implementation(Object... args) throws IOException {
        if(args.toString().equals("SANJAY"))
            System.out.println("This is Sanjay");
        else
            System.out.println("This is not Sanjay");

        return ExecuteCommand.runCommand("ipconfig").toString();
    }
}
