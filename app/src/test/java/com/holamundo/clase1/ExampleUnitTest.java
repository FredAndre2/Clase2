package com.holamundo.clase1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void sumar(){
        double a=4,b= 6,c;
        c = 11;
        assertEquals(c,Metodos.suma(a,b),0);

    }
    @Test
    public void resta(){
        double a=6,b= 2,c;
        c = 4;
        assertEquals(c,Metodos.resta(a,b),0);

    }
}