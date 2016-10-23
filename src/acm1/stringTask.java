/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acm1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author MMAesawy
 */
public class stringTask {
    
    public static void main(String[] args) {
        output(stringTask(input(1)[0]));
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
    
    public static String[] input(int numLines){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[numLines];
        try{
            for (int i = 0; i < numLines; i++){
                input[i] = reader.readLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            return input;
        }
        
    }
    
    public static String[] input(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> input = new ArrayList<>();
        try{
            while (true){
                String i = reader.readLine();
                if (i.isEmpty()) break;
                else input.add(i);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            return input.toArray(new String[0]);
        }
        
    }
    
    public static void output(String... out){
        for (String o : out) System.out.println(o);  
    }
}
