/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author MMAesawy
 */
public class ACMSubmit {
    
    
    public static void main(String[] args) {
       Integer[] parameters = inputIntArray(" ");
       Integer[][] subjects = new Integer[parameters[0]][];
       for (int i = 0;i<parameters[0];i++)
           subjects[i] = inputIntArray(" ");
       quickSort(new ArrayList<>(Arrays.asList(subjects))).toArray(subjects);
       
       int sum = 0;
       for (Integer[] subject : subjects) sum += subject[0];
       int gradesNeeded = parameters[2] * parameters[0] - sum;
       int essays = 0;
       main:
       for (Integer[] subject : subjects){
           while (subject[0] < parameters[1]){
               essays += subject[1];
               subject[0]++;
               gradesNeeded--;
               if (gradesNeeded == 0){
                   break main;
               }
           }
       }
       output(essays + "");
                   
    }
    
    public static ArrayList<Integer[]> quickSort(ArrayList<Integer[]> a){
        if (a.size() <= 1) return a;
        int pivotIndex = a.size()/2;
        ArrayList<Integer[]> lesserArray = new ArrayList<>();
        ArrayList<Integer[]> greaterArray = new ArrayList<>();

        
        for (int i = 0; i < a.size(); i++){
            if (i == pivotIndex) continue;
            if (a.get(i)[1] <= a.get(pivotIndex)[1])
                lesserArray.add(a.get(i));
            else
               greaterArray.add(a.get(i));
        }
        ArrayList<Integer[]> sorted = new ArrayList<>();
        sorted.addAll(quickSort(lesserArray));
        sorted.add(a.get(pivotIndex));
        sorted.addAll(quickSort(greaterArray));
        return sorted;
    }

    public static Integer[] inputIntArray(String delimiter){
        String[] in = input(1)[0].split(delimiter);
        Integer[] inInt = new Integer[in.length];
        for (int i=0;i<in.length;i++)
            inInt[i] = Integer.parseInt(in[i]);
        return inInt;
    }
    
    public static int inputInt(){
        int n = scanner.nextInt();
        scanner.nextLine();
        return n;
    }
    
    public static String[] input(int numLines){
        String[] input = new String[numLines];
        for (int i = 0; i < numLines; i++)
            input[i] = scanner.nextLine();
        return input;
    }
      
    public static void output(String... out){
        for (String o : out) System.out.println(o);  
    }
    static Scanner scanner = new Scanner(System.in);
}
