package com.example.demo;

import java.util.Scanner;

import org.springframework.stereotype.Component;
@Component
public class Returning {
	private String S;
	
public String returnvalues(String s2) {
	int vowels=0,specialchar=0, consonants=0, digits=0;
	String S= s2;
	for(int i=0;i<S.length();i++)
	{
		char ch =S.charAt(i);
		if((ch>='a'&& ch<='z')||(ch>='A'&&ch<='Z'))
		{
			ch=Character.toLowerCase(ch);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels++;
			}
			else
				consonants++;
		}
		else if(ch>='0'&&ch<='9')
		{
			digits++;
		}
		else
			specialchar++;
	}
	return ("vowels:"+ vowels + " specialcharacters:" + specialchar);
}
}
