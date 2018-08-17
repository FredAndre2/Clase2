package com.holamundo.clase1;

public class Metodos {

    public static double suma(double n1,double n2){
        return n1+n2;
    }
    public static double resta(double n1,double n2){
        return n1-n2;
    }
    public static double multiplicacion(double n1,double n2){
        return n1*n2;
    }
    public static double division(double n1,double n2){
        if (n2==0){
            return 0;
        }
        else{
            return n1/n2;
        }

    }
}
