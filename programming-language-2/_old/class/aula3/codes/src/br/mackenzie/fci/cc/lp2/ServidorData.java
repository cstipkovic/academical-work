package br.mackenzie.fci.cc.lp2;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServidorData {

    public static void main(String args[]) throws IOException {

        ServerSocket servidor = new ServerSocket(8888);
        System.out.println("Esperando conexão");
        Socket conexao = servidor.accept();
        System.out.println("Conexao estabelecida");
        OutputStream os = conexao.getOutputStream();
        PrintWriter writer = new PrintWriter(os);
        writer.println("Bem vindo ao servidor data e hora!");
        writer.println("A data e hora do servidor é " + new Date());
        writer.close();
        conexao.close();
        System.out.println("Fim do programa!");
    }
}
