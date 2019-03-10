package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //zad 1
       // countUnique();

        //zad 2
       // countSequence();

        //zad 3
        collections();
    }




    static void countUnique()
    {
        System.out.println("Wpisuj liczby,wpisz dowolny znak niebędący liczba aby przerwać");

        boolean flag=true;
        HashSet hashSet=new HashSet();
        Scanner scanner=new Scanner(System.in);

        do {
            try
            {
                hashSet.add(scanner.nextInt());
            }catch (Exception e)
            {
                flag=false;
            }

        }while (flag);
        System.out.println("wpisałeś "+hashSet.size()+" unikalnych liczb");

    }


    static void countSequence()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("wpisz ciag 0 i 1");
        String ciag=scanner.nextLine();

        char[] chars=ciag.toCharArray();

        boolean flaga_1=false;
        boolean flaga_2=false;
        int licznik=0;

        for(int i=0;i<chars.length;i++)
        {

            if(chars[i]=='0' && flaga_1==true)
            {
                flaga_2=true;
            }
            if(chars[i]=='1' && flaga_2==true)
            {
                licznik++;
                flaga_2=false;

            }else if(chars[i]=='1' ) {
                flaga_1 = true;
            }

        }

        System.out.println(licznik+ " sekwencji");

    }


    static void collections()
    {



        boolean flag=true;
        Scanner scanner=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);

        List<Integer> zbiór_A=new ArrayList<>();
        List<Integer> zbiór_B=new ArrayList<>();
        HashSet<Integer> suma=new HashSet<>();
        List<Integer> roznica=new ArrayList<>();
        List<Integer> czescWspolna=new ArrayList<>();



        System.out.println("zbiór A:");

        do {
            try
            {
                zbiór_A.add(scanner.nextInt());
            }catch (Exception e)
            {
                flag=false;
            }

        }while (flag);

flag=true;

        System.out.println("zbiór B:");

        do {

            try
            {


                zbiór_B.add(scanner2.nextInt());

            }catch (Exception ee)
            {

                flag=false;
            }

        }while (flag);



    for ()


    }
}
