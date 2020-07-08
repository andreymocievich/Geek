package ru.geekbrains.home_work_;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] x;
        x = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 1) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }

    }

    public static void main(String[] args) {
        int[] source = new int[8];
        for (int i = 0, x = 0; i <= 21; i += 3, x++) {
            source[x] = i;
        }
        for (int y = 0; y < source.length; y++) {
                System.out.println(source[y]);
        }

    }
   public static void main(String[] args) {
       int[] array;
       array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
       for (int i = 0; i < array.length; i++) {
           int y = array[i];
           if(y >= 6) {
               System.out.println(array[i]);
           } else {
               System.out.println(array[i] * 2);
           }
       }
    }


   public static void main(String[] args) {
       int [][] array2 = new int[5][5];
       array2[0][0] = 1;
       array2[1][1] = 1;
       array2[2][2] = 1;
       array2[3][3] = 1;
       array2[4][4] = 1;
       for (int i = 0; i < array2.length; i++) {
           for (int j = 0; j < array2[i].length; j++) {
               System.out.print(array2[i][j]);
           }
           System.out.println();
       }

   }
}