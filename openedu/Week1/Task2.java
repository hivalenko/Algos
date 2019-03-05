package Week1;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            String[] input = reader.readLine().split(" ");
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
            long b = Integer.parseInt(input[1]);
            writer.write( Integer.parseInt(input[0]) + b*b + "");
            writer.close();
            reader.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }


}
