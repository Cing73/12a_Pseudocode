package com.cc.java;


import java.time.LocalDate;

public class App {
    
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2000, 11, 1);
        System.out.println(berechneAlter(today,birthday ));
     
    }


    public static int berechneAlter(LocalDate datum, LocalDate geburtsdatum)
    {
   
    int alter = datum.getYear() - geburtsdatum.getYear();
    
    if (datum.getMonthValue() < geburtsdatum.getMonthValue())
    {
        alter--;
    }
    else
    {
        if (datum.getMonthValue() == geburtsdatum.getMonthValue())
        {
            if (datum.getDayOfMonth() < geburtsdatum.getDayOfMonth())
            {
                alter--;
            }
        }
    }
    return alter;
}


}

