package com.lambton;

public class StringHandling
{
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3=s1;
        String s4=new String("hello");
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
    }
    }

