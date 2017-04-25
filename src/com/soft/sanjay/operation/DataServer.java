package com.soft.sanjay.operation;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * A TCP server that runs on port 9090.  When a client connects, it
 * sends the client the current date and time, then closes the
 * connection with that client.  Arguably just about the simplest
 * server you can write.
 */
public abstract class DataServer {

    private int mPort;
    Object obj;
    public DataServer(int iPort) {
        mPort=iPort;

    }
    public DataServer(int iPort, Object obj) {
        mPort=iPort;
        this.obj=obj;
    }

    /**
     * Runs the server.
     */
    public void startComponent() throws IOException {
        ServerSocket listener = new ServerSocket(mPort);
        try {
            while (true) {
                Socket socket = listener.accept();
                System.out.println("Client Connected: "+ socket.getInetAddress());
                try {
                    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    out.println(implementation(obj));

                } finally {
                    socket.close();
                }
            }
        }
        finally {
            listener.close();
        }
    }
    public abstract Object implementation(Object... args) throws IOException;
}