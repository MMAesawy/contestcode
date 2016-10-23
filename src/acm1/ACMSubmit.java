/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MMAesawy
 */
public class ACMSubmit {
    
    
    public static void main(String[] args) {
       inputInt();
       String[] squadHeightsString = input(1)[0].split(" ");
       int maxIndex = squadHeightsString.length - 1;
       int minIndex = 0;
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       for (int i=0; i<squadHeightsString.length; i++){
           int height = Integer.parseInt(squadHeightsString[i]);
           if (height > max){
               max = height;
               maxIndex = i;
           }
           if (height <= min && i >= minIndex){
               min = height;
               minIndex = i;
           }
       }
       
       output(timeForSwitch(maxIndex, minIndex, squadHeightsString.length) + "");
    }
    
    public static int timeForSwitch(int maxIndex, int minIndex, int squadSize){
        int time = maxIndex + squadSize - 1 - minIndex;
        if (maxIndex > minIndex) time--;
        return time;
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
