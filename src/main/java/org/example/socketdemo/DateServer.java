package org.example.socketdemo;

import javax.sound.sampled.Port;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateServer {

    private static final int PORT = 9090;

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Waiting for client .....");
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client has connected .....");

        PrintWriter outputToClient = new PrintWriter(clientSocket.getOutputStream(), true);
        outputToClient.println("Today is: " + LocalDateTime.now().toString());

        System.out.println("Date is sent to client .....");
        System.out.println("Closing down server ...");

        clientSocket.close();
        serverSocket.close();
    }
}
