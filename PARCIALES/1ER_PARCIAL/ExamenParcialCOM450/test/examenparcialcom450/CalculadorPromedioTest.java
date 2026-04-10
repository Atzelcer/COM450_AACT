/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenparcialcom450;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author USUARIO
 */

//Cervantes Torres Atzel Alan - CICO   

public class CalculadorPromedioTest {
    
    @Test
    public void promedioDeEnteroPositivos() {
        List<Double> numeros = Arrays.asList(10.0, 20.0, 30.0, 40.0);
        double resultado = CalculadorPromedio.calcularPromedio(numeros);
        assertEquals(25.0, resultado, 0.001);
    }
    
    @Test
    public void promedioDeNumerosNegativos() {
        List<Double> numeros = Arrays.asList(-10.0, -20.0, -30.0);
        double resultado = CalculadorPromedio.calcularPromedio(numeros);
        assertEquals(-20.0, resultado, 0.001);
    }
    
    @Test
    public void promedioDeListaMixta() {
        List<Double> numeros = Arrays.asList(5.0, -5.0, 10.0, -10.0);
        double resultado = CalculadorPromedio.calcularPromedio(numeros);
        assertEquals(0.0, resultado, 0.001);
    }
    
    @Test
    public void promedioDeUnSoloElemento() {
        List<Double> numeros = Collections.singletonList(100.0);
        double resultado = CalculadorPromedio.calcularPromedio(numeros);
        assertEquals(100.0, resultado, 0.001);
    }
    
    @Test
    public void promedioDeListaVaciaEsCero() {
        List<Double> numeros = Collections.emptyList();
        double resultado = CalculadorPromedio.calcularPromedio(numeros);
        assertEquals(0.0, resultado, 0.001);
    }
}