package com.example.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class UpdateFullName {
	
public String updatedname(String T)
{
	String Q=null;
	String special="!@#$%&*";
	 char ch[]=T.toCharArray();
	 int l=special.length();
	 Random rand =new Random();
     for (int i = 0; i < ch.length; i++)
     {
            if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            {
             ch[i]=special.charAt(rand.nextInt(l)); 
            }   
     }
     Q = new String(ch);
		return Q;
}
}
