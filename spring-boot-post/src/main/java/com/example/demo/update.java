package com.example.demo;

public class update {
	public String updat ()
     {
		 User user=new User();
		 
   	  String T=user.getFullName();
   	  String R=null;
   	  char ch[]=T.toCharArray();
         for (int i = 0; i < ch.length; i++)
         {
                if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
                {
                 ch[i]='$'; 
                }   
         }
         for (int i = 0; i < ch.length; i++) {
             R=R+ch[i];
         }
         return R;
     }
}
