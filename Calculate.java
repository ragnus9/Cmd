package com.Kalkulator;

public class Calculate
{
    private int liczba1;
    private int liczba2;


    public int Dodaj()
    {
        return  getLiczba1() + getLiczba2();
    }

    public int getLiczba1()
    {
        return liczba1;
    }

    public void setLiczba1(int liczba1) {
        this.liczba1 = liczba1;
    }

    public int getLiczba2() {
        return liczba2;
    }

    public void setLiczba2(int liczba2) {
        this.liczba2 = liczba2;
    }
}
