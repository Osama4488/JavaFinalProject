/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.project;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javafx.util.Pair;

/**
 *
 * @author hp
 */
public class Stock implements IStockManageable{
    
    public void checkStocks() throws FileNotFoundException
    {
         
        try
        {
            
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\ooadProjectFiles\\Donor.txt"));
//        ArrayList<String> obj = new ArrayList<String>();
//            for (int i = 0; i < obj.size(); i++) {
//                String b = br.readLine();
//                if(b != null)
//                {
//                    
//                }
//                    //a[i] = b;
//            }
//        
        
        
        
        
        
        
        
            ArrayList<String> khairH = new ArrayList<>();
            int i = 0;
            while(true){
                String s = br.readLine();
                if(s == null)
                    break;
            khairH.add(s);
            i++;
            }
            List<Pair<String, Integer>> pairs = new ArrayList<>();
            for (int j = 2; j < khairH.size(); j+=5) {
                Boolean tooth = false;
                for (int k = 0; k < pairs.size(); k++) {
                    if(pairs.get(k).getKey().equals(khairH.get(j)))
                    {
                        int val = pairs.get(k).getValue();
                        pairs.remove(k);
                        pairs.add(k,new Pair<String,Integer>(khairH.get(j),val+1));
                        tooth = true;
                        break;
                    }
                }
                if(!tooth)
                    pairs.add(new Pair<String,Integer>(khairH.get(j),1));
            }
            
            for (int j = 0; j < pairs.size(); j++) {
                System.out.println(String.format("%s %s", pairs.get(j).getKey(), pairs.get(j).getValue()));
            }
            
                
                //u.add(a);
//                if(i == 2)
//                {
//                u.add(a);
//                  
//                   
//                      for (int l = j; l < arr.length; l+=5) {
//                        if(a.equals(arr[l]))
//                    {
//                        counter++;
//                    }
//                        
//                    }
//                        System.out.println("Blood Group" + " " + arr[i] + " " + "Stock " + " " + counter);
//                counter = 0;
//                       
//                }
//                else
//                {
//                    
//                    if(u.contains(a))
//                      continue;
//                
//                else
//                    {
//                      u.add(a);
//                        for (int l = j; l < arr.length; l+=5) {
//                        if(a.equals(arr[l]))
//                    {
//                        counter++;
//                    }
//                        
//                    }
//                        System.out.println("Blood Group" + " " + arr[i] + " " + "Stock " + " " + counter);
//                counter = 0;
//                        
//                        
//                    }
//                }
//                    
                
        }
        catch(IOException ex)
        {
            System.out.println(ex);
        }
    }
}