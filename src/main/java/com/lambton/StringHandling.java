package com.lambton;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Date;

public class StringHandling
{
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();                          //Today's date
        LocalDate birthday = LocalDate.of(1993, 05, 9);  //Birth date

        Period p = Period.between(birthday, today);

        System.out.println(p.getDays());
        System.out.println(p.getMonths());
        System.out.println(p.getYears());



        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));


        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));

        String pattern="###,###,##.00";
        DecimalFormat format=new DecimalFormat();
        format.applyPattern((pattern));

        int value=12345678;
        String output=format.format(value);
        System.out.println(value + " " + pattern + " " + output);

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

       /* for(int i=0;i<c.length; i++)
        {
            System.out.println(c[i]);
        }
        for(int i=c.length-1;i>=0; i--)
        {
            r[cnt++]=c[i];
            // System.out.println(c[i]);
        }*/
        String revstr = new String();
        String[] words = s5.split(" ");
        for(int i = 0; i < words.length; i++)
        {
            //System.out.println(c[i]);

            if(i % 2 != 0)
            {
                String rev = new StringBuffer(words[i]).reverse().toString();
                revstr = revstr + rev;
            }
            else
                {
                    revstr = revstr + words[i];
                }
            revstr = revstr + " ";

        }
       System.out.println("Reverse String: " + revstr);


    }
    }

