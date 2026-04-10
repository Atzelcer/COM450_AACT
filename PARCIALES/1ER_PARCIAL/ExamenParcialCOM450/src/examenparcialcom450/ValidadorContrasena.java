/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenparcialcom450;

/**
 *
 * @author USUARIO
 */

//Cervantes Torres Atzel Alan - CICO   

public class ValidadorContrasena {
    
    public static boolean esSegura(String pass) {
        if (pass == null || pass.length() < 8) {
            return false;
        }
        
        boolean hayMayuscula = false;
        boolean hayNumero = false;
        
        for (int i = 0; i < pass.length(); i++) {
            char letra = pass.charAt(i);
            if (Character.isUpperCase(letra)) {
                hayMayuscula = true;
            }
            if (Character.isDigit(letra)) {
                hayNumero = true;
            }
        }
        
        return hayMayuscula && hayNumero;
    }
}