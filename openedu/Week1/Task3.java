package Week1;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            int l = Integer.parseInt(reader.readLine());
            String[] input = reader.readLine().split(" ");
            reader.close();

            int[] output2 = new int[l];
            output2[0] = 1;
            for (short j = 1; j < l; j++) {
                int key = Integer.parseInt(input[j]);
                int i = j - 1;
                while(i >= 0 && Integer.parseInt(input[i]) > key){
                    input[i+1] = input[i];
                    i--;
                }
                output2[j] = i+2;
                input[i+1] = key + "";
            }

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            for(int i: output2){
                writer.write(i + " ");
            }
            writer.write("\n");
            for (String s :
                    input) {
                writer.write(s + " ");
            }

            writer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }


}
