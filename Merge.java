

package com.Hasan;

import java.io.*;

public class Main {

    public static void main(String[] args)  throws IOException{
       merge();
    }

    public static void merge()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the arrays: ");   //طلب ادخال حجم الاري
        int l = Integer.parseInt(br.readLine()); // قرائة الحجم
        int x[] = new int[l]; // initialize first array
        int y[] = new int[l]; // initialize second array
        int z[] = new int[l*2]; // initialize final array
        System.out.println("Enter the Elements for the first array"); // طلب ادخال العناصر
        for (int i = 0; i < l; i++) { // بدء اللوب للأدخال العناصر
            x[i]= Integer.parseInt(br.readLine()); // تحويلها الى ارقام 
        }
        System.out.println("Enter the Elements for the second array");
        for (int i = 0; i < l; i++) {
            y[i] = Integer.parseInt(br.readLine());
        }
        int j = 0, k=0;

        for(int i =0; i <z.length; i++)
        {
            if(i%2 == 0)
                z[i] = x[j++];
            else
                z[i] = y[k++];
        }
        // طباعة بعد الدمج
        for (int i =0; i<z.length; i++)
            System.out.print(z[i]+" ");
        System.out.println();


    }
}


