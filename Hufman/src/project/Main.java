package project;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        String read , input = "";
        int choose;
        Scanner cin = new Scanner(System.in);

        Compression c = new Compression();
        Decompression d = new Decompression();
        Tree t = new Tree();

        File file = new File("C:\\Users\\user\\Desktop\\file.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\file2.txt"));

        while ((read = br.readLine()) != null){input += read;}

        System.out.println("1- Compression");
        System.out.println("2- Decompression");
        choose = cin.nextInt();
        if(choose == 1)
        {
            String result = c.encode(input);
            System.out.println("Compression code : " + result);
            writer.write(result);
            writer.close();
        }
        else
        {
            String result = d.decode(input);
            System.out.println("Decompression code : " + result);
            writer.write(result);
            writer.close();
        }
    }
}
