package Week1;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
            int l = Integer.parseInt(reader.readLine());
            String[] input = reader.readLine().split(" ");
            reader.close();
            int r = 1;
            int p = 1;
            int m = 1;
            double[] toSort = new double[l];
            double[] base = new double[l];
            for (int i = 0; i < l; i++) {
                toSort[i] = Double.parseDouble(input[i]);
                base[i] = toSort[i];
            }

            for (int j = 1; j < l; j++) {
                double key = toSort[j];
                int i = j - 1;
                while(i >= 0 && (key - toSort[i])<0.01){
                    toSort[i+1] = toSort[i];
                    i--;
                }
                if(i<0)
                    p = j + 1;
                toSort[i+1] = key;
                if(i == j-1)
                    r = j + 1;
            }
            double f = toSort[(l-1)/2];

            for (int i = 0; i < l; i++) {
                double diff = f-base[i];
                if(diff < 0.01 && -diff < 0.01) {
                    m = i + 1;
                    break;
                }
            }
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));
            writer.write(p + " " + m + " " + r);
            writer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
