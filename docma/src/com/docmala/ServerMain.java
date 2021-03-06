package com.docmala;

import com.docmala.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;

public class ServerMain {
    public static void main(String[] args) throws IOException {
        Server server = new Server(new InetSocketAddress(47294));
        server.setReuseAddr(true);
        server.start();
        System.out.println("Docma server started on port: " + server.getPort());

        try(BufferedReader sysin = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                String in = sysin.readLine();
                if (in.equals("exit")) {
                    break;
                }
            }
        }
    }
}