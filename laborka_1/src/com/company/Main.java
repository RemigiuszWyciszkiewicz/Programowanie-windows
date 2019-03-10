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


        Scanner wpisz=new Scanner(System.in);
        Set<Integer> zbiorA=new HashSet<Integer>();
        Set<Integer>zbiorB=new HashSet<Integer>();
        
        System.out.println("Podaj zbior A (5 liczb): ");
        
        for(int i=0;i<5;i++){
            zbiorA.add(wpisz.nextInt());
        }
        System.out.println("Podaj zbior B (5 liczb) ");
        
        for(int j=0;j<5;j++){
            zbiorB.add(wpisz.nextInt());
        }
        
        System.out.println("Podane zbiory to: \n"+zbiorA +"\n"+zbiorB);
        
        Set<Integer>suma=new HashSet<>(zbiorA);
        suma.addAll(zbiorB);

        Set<Integer>common=new HashSet<>(zbiorA);
        common.retainAll(zbiorB);

        Set<Integer> difference=new HashSet<>(zbiorA);
        difference.removeAll(zbiorB);

        Set<Integer>symmetrical_difference=new HashSet<>(zbiorA);
        symmetrical_difference.addAll(zbiorB);
        symmetrical_difference.removeAll(common);

        System.out.println("Suma zbiorów to: "+suma+"\nRoznica zbiorow to: "+ difference+"\nCzesc wspolna zbiorow to: "+common+"\nRoznica symetryczna zbiorow to: "+symmetrical_difference);

    }
}
