package com.lambton;

public class StringHandling
{
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3=s1;
        String s4=new String("hello");
        String s5="Lambton College In Toronto";

       if(s1==s2)
        {
            System.out.println("s1=s1");
                    }
        else
        {
            System.out.println("s1!=s2");
        }
        if(s1==s3)
        {
            System.out.println("s1=s3");
        }
        else
        {
            System.out.println("s1!=s3");
        }
        if(s1==s4)
        {
            System.out.println("s1=s4");
        }
        else
        {
            System.out.println("s1!=s4");
        }
        if(s1.equals(s4))
        {
            System.out.println("s1=s4");
        }
        else
        {
            System.out.println("s1!=s4");
        }
        System.out.println(s1);
        s1.toLowerCase();
        System.out.println(s1);
        s1.toUpperCase();
        System.out.println(s1);
        System.out.println(s1.concat(s5));
        System.out.println(s5.toLowerCase());
        System.out.println(s5.toUpperCase());
        System.out.println(s5.length());
        System.out.println(s5.contains("College"));
        System.out.println(s5.lastIndexOf("Toronto"));
        System.out.println(s5.replace("Toronto","New York"));
        System.out.println(s5.substring(11,20));
        System.out.println(s5.toCharArray());
        System.out.println(s5.concat("265 Yorkland Blvd., North York"));
        char c[]=s5.toCharArray();
        char r[]=new char[c.length];
        int cnt=0;
       /* for(int i=0;i<c.length; i++)
        {
            System.out.println(c[i]);
        }*/
        for(int i=c.length-1;i>=0; i--)
        {
            r[cnt++]=c[i];

            // System.out.println(c[i]);
        }
        String reverseString=new String(r);
        System.out.println(reverseString);
    }
    }

