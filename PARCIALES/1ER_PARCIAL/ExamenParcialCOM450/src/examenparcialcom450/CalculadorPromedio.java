/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenparcialcom450;

import java.util.List;
/**
 *
 * @author USUARIO
 */

public class CalculadorPromedio {
    
    public static double calcularPromedio(List<Double> numeros) {
        if (numeros == null || numeros.size() == 0) {
            return 0.0;
        }
        
        double total = 0;
        for (int i = 0; i < numeros.size(); i++) {
            total = total + numeros.get(i);
        }
        
        return total / numeros.size();
    }
}