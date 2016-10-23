/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm1;

import java.util.Scanner;

public class wayTooLongWords {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = inputInt();
        output(luckyDivision(n) || containsLucky(n) ? "YES" : "NO");
    }
    
    public static String[] input(int numLines){
        String[] input = new String[numLines];
        for (int i = 0; i < numLines; i++)
            input[i] = scanner.nextLine();
        return input;
    }
    
    public static int inputInt(){
        int n = scanner.nextInt();
        scanner.nextLine();
        return n;
    }
    
    public static void output(String... out){
        for (String o : out) System.out.println(o);  
    }
    
    public static boolean luckyDivision(int n){
        return luckyDivision(n, 4) || luckyDivision(n, 7);
    }
    
    public static boolean luckyDivision(int n, int d){
        if (d>n) return false;
        return n%d==0 || (luckyDivision(n,d*10+4) || luckyDivision(n,d*10+7));
    }
    
    public static boolean containsLucky(int n){
        String nString = n + "";
        for (int i = 0; i < nString.length(); i++)
            if (!(nString.charAt(i) == '4' || nString.charAt(i) == '7'))
                return false;
        return true;
    }
    
    public static String[] wayTooLongWords(int n, String... words){
        String[] outputArray = new String[words.length];
        for (int i = 0; i < words.length; i++){
            if (words[i].length() <= 10) outputArray[i] = words[i];
            else{
                String newWord = words[i].substring(0, 1);
                newWord = newWord.concat((words[i].length() - 2) + "");
                newWord = newWord.concat(words[i].substring(words[i].length() - 1));
                outputArray[i] = newWord;
            }
        }
        return outputArray;
    }
}
