package org.example.socketdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

    private static final String SERVER_IP = "127.0.0.1";
    private static final int PORT = 9090;

    public static void main(String[] args) throws IOException {

        Socket clientSocket = new Socket(SERVER_IP, PORT);
        BufferedReader inputFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String messageFromServer = inputFromServer.readLine();
        System.out.println("From server: " + messageFromServer);
        clientSocket.close();
    }
}
