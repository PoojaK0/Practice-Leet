/*
1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
   For "abecd", the answer should be "a1b3e-2c1d", as 
   'b'-'a' = 1
   'e'-'b' = 3
   'c'-'e' = -2
   'd'-'c' = 1
   
Input Format
A String

Output Format
A String
*/


import java.io.*;
import java.util.*;

public class Main {
    public static int diff(char a, char b){
        return (int)(a-b);
    }

	public static String solution(String str){
		// write your code here
		StringBuilder sb = new StringBuilder();
		int i=1;
	
		for(char c : str.toCharArray()){
		    sb.append(c);
		    if(i<str.length())
		    sb.append(diff(str.charAt(i++),c));
		}
		

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
