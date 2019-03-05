package Week1;

import java.io.*;
import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            int l = Integer.parseInt(reader.readLine());
            String[] input = reader.readLine().split(" ");
            reader.close();
            int[] toSort = new int[l];
            for (int i = 0; i < l; i++) {
                toSort[i] = Integer.parseInt(input[i]);
            }
            ArrayList<Integer> list= new ArrayList<Integer>();

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

            int gap = l-1;
            while(gap >= 1){
                int i = 0;
                while(i + gap < l){
                    if(toSort[i] > toSort[i+gap]) {
                        int tmp = toSort[i + gap];
                        toSort[i + gap] = toSort[i];
                        toSort[i] = tmp;
                        writer.write("Swap elements at indices " + (i + 1) + " and " + (i + 1 + gap) + ".\n");
                    }
                    i++;
                }
                gap--;
            }

            writer.write("No more swaps needed.\n");
            for (int i :
                    toSort) {
                writer.write(i + " ");
            }

            writer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}