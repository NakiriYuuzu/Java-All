package Useful;

import java.net.ServerSocket;
import java.net.Socket;


public class SocketServer extends java.lang.Thread {
    private boolean OutServer = false;
    private ServerSocket server;
    private final int ServerPort = 8765;// 要監控的port

    public SocketServer() {
        try {
            server = new ServerSocket(ServerPort);
        } catch (java.io.IOException e) {
            System.out.println("Socket unable to start !");
            System.out.println("IOException :" + e);
        }
    }

    public void run() {
        Socket socket;
        java.io.BufferedInputStream in;
        System.out.println("Server is Start running!");
        while (!OutServer) {
            socket = null;
            try {
                synchronized (server) {
                    socket = server.accept();
                }
                System.out.println("Get Connection : InetAddress = "
                        + socket.getInetAddress());
                // TimeOut時間
                socket.setSoTimeout(15000);
                in = new java.io.BufferedInputStream(socket.getInputStream());
                byte[] b = new byte[1024];
                String data = "";
                int length;
                while ((length = in.read(b)) > 0)// <=0的話就是結束了
                {
                    data += new String(b, 0, length);
                }
                System.out.println("get value:" + data);
                in.close();
                in = null;
                socket.close();
            } catch (java.io.IOException e) {
                System.out.println("Socket connection problem !");
                System.out.println("IOException :" + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        (new SocketServer()).start();
    }
}
