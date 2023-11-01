import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.awt.SystemColor.text;

public class Solution {
    public static void main(String[] args){
        String str = "";
        String[] arr = new String[]{};
        try {
            FileInputStream inStr = new FileInputStream("C:\\Users\\User\\Desktop\\stream.txt");
            int i = -1;
            while ((i = inStr.read()) != -1){
                str +=((char)i);
                arr = str.split(" ");
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        for (int j = 0; j < arr.length; j += 3) {
            String name = arr[j];
            if (j + 2 < arr.length && name.equals("Triangle")) {
                Double sideA = Double.parseDouble(arr[j + 1]);
                Double sideB = Double.parseDouble(arr[j + 2]);
                System.out.println(name + " " + 0.5 * sideA * sideB);
            }else if (j + 2 < arr.length) {
                Double sideA = Double.parseDouble(arr[j + 1]);
                Double sideB = Double.parseDouble(arr[j + 2]);
                System.out.println(name + " " + sideA * sideB);
            }else if (name.equals("Circle")){
                Double radius = Double.parseDouble(arr[j+1]);
                System.out.println(name + " " + radius * Math.PI);
            }
                else {
                System.out.println("Недостаточно данных для фигуры: " + name);
            }
        }
    }
}
