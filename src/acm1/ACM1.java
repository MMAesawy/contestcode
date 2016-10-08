/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author MMAesawy
 */
public class ACM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        try{
            i = Integer.parseInt(reader.readLine());
        }
        catch(IOException d){}

        System.out.println(waterMelon(i) ? "YES" : "NO");
    }
    
    /**
     * Reading: 1 minute
     * Thinking: 3 min
     * Solving: 4 min
     * Testing: 2 min
     * Bug Count: 1
     */
    public static boolean chatRoom(String s){
        String MATCH_STRING = "hello";
        if (s.length() < MATCH_STRING.length()) return false;
        
        int matchStringIndex = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == MATCH_STRING.charAt(matchStringIndex))
                matchStringIndex++;
            if (matchStringIndex == MATCH_STRING.length()) return true;
        }
        return false;
    }
    
    /**
     * Reading: 1.5 minute
     * Thinking: 1.5 min
     * Solving: 0.5 min
     * Testing: 0 min
     * Bug Count: 0
     */
    public static boolean waterMelon(int w){
        return w > 2 && w % 2 == 0;
    }
    
    /**
     * Reading: 2 minute
     * Thinking: 0 min
     * Solving: 7 min
     * Testing: 4 min
     * Bug Count: 0
     */
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
    
    /**
     * Reading: 1 minute
     * Thinking: 1 min
     * Solving: 7.5 min
     * Testing: 1 min
     * Bug Count: 0
     */
    public static String stringTask(String input){
        char[] VOWELS = {'a', 'o', 'e', 'u', 'i', 'y'};
        input = input.toLowerCase().trim();
        String output = "";
        
        mainStringLoop:
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            for (char vowel : VOWELS)
                if (c == vowel) continue mainStringLoop;
            output = output.concat("." + c);
        }
        
        return output;
    }
    
    /**
     * Reading: 1 minute
     * Thinking: 0 min
     * Solving: 1 min
     * Testing: 2.5 min
     * Bug Count: 1
     */
    public static int petyaAndStrings(String i1, String i2){
        if (i1.equalsIgnoreCase(i2)) return 0;
        return i1.compareToIgnoreCase(i2) > 0? 1 : -1;
    }
    
    /**
     * Reading: 1.5 minute
     * Thinking: 2.5 min
     * Solving: 9.5 min
     * Testing: 1 min
     * Bug Count: 0
     */
    public static String helpfulMaths(String s){
        int[] counts = {0,0,0};
        for (char c : s.toCharArray()){
            if (c == '1') counts[0]++;
            else if (c == '2') counts[1]++;
            else if (c == '3') counts[2]++;
        }
        String output = "";
        for (int j = 0; j < counts.length; j++)
            for (int i = 0; i < counts[j]; i++){
                output = output.concat((j + 1) + "+");
            }
        return output.substring(0, output.length() - 1);
    }
}
