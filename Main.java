

package com.Hasan;

import java.io.*;

public class Main {

    public static void main(String[] args)  throws IOException{
       merge();
    }

    public static void merge()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the arrays: ");
        int l = Integer.parseInt(br.readLine());
        int x[] = new int[l];
        int y[] = new int[l];
        int z[] = new int[l*2];
        System.out.println("Enter the Elements for the first array");
        for (int i = 0; i < l; i++) {
            x[i]= Integer.parseInt(br.readLine());
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
        for (int i =0; i<z.length; i++)
            System.out.print(z[i]+" ");
        System.out.println();


    }
}


