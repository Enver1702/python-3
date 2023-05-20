package ru.geekbrains;

import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.util.Arrays;

public class WebServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(port 8088) ) {
            Socket socket = serverSocket.accept();
            System.out.println("New client connected:");
            new InputStreamReader(socket.getInputStream(),)
        } catch (IDException e) {
            e.printStackTrace();
        }
    }
}
