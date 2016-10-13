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
public class IO {
    
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
