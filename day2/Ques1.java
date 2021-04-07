package day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Ques1 {
	    public static List<String> findAndReplacePattern(String[] words, String pattern) {
	        ArrayList<String> matchWords=new ArrayList<String>();
	        for (String word:words) {
	            if (matchPattern(word, pattern))
	                matchWords.add(word);
	        }
	        return matchWords;
	    }
	    public static boolean matchPattern(String word,String pattern) {
	        if (word.length()!=pattern.length())
	        {
	            return false;
	        }
	        
	        HashMap<Character,Character> m1 = new HashMap<Character,Character>();
	        HashMap<Character,Character> m2 = new HashMap<Character,Character>();
	        int length = word.length();
	        
	        for (int i = 0; i < length; i++) {
	            char c1 = word.charAt(i), c2 = pattern.charAt(i);
	            if (m1.containsKey(c1)) 
	            {
	                if (m1.get(c1) != c2)
	                {
	                    return false;
	                }
	            } 
	            else
	            {
	                m1.put(c1,c2);
	            }
	            
	            if (m2.containsKey(c2)) 
	            {
	                if (m2.get(c2) != c1)
	                {
	                    return false;
	                }
	            }
	            else
	            {
	                m2.put(c2, c1);
	            }
	        }
	        return true;
	    
	    }
	    public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the number of words:");
			int n=scan.nextInt();
			System.out.println("Enter a pattern:");
			String pattern=scan.next();
			
			String str[]=new String[n];
			System.out.println("Enter "+n+" words to an array:");
			for(int i=0;i<n;i++)
			{
				str[i]=scan.next();
			}
			
			System.out.println("\n"+findAndReplacePattern(str,pattern));
			scan.close();
	    }

}

