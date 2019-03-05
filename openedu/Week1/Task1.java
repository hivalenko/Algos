package Week1;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("home/ekov/IdeaProjects/Algos/src/input.txt")));
            String[] input = reader.readLine().split(" ");
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("home/ekov/IdeaProjects/Algos/src/output.txt")));
            writer.write( Integer.parseInt(input[0]) + Integer.parseInt(input[1]) + "");
            writer.close();
            reader.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }


}
