/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenparcialcom450;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */

//Cervantes Torres Atzel Alan - CICO   

public class ValidadorContrasenaTest {
    
    @Test
    public void contrasenaValidaRetornaTrue() {
        boolean resultado = ValidadorContrasena.esSegura("Password1");
        assertTrue(resultado);
    }
    
    @Test
    public void sinMayusculaRetornaFalse() {
        boolean resultado = ValidadorContrasena.esSegura("password1");
        assertFalse(resultado);
    }
    
    @Test
    public void sinNumeroRetornaFalse() {
        boolean resultado = ValidadorContrasena.esSegura("Password");
        assertFalse(resultado);
    }
    
    @Test
    public void contrasenaMuyCortaRetornaFalse() {
        boolean resultado = ValidadorContrasena.esSegura("Pas1");
        assertFalse(resultado);
    }
    
    @Test
    public void cadenaVaciaRetornaFalse() {
        boolean resultado = ValidadorContrasena.esSegura("");
        assertFalse(resultado);
    }
}