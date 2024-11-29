/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Cuadrado;
import modelo.FigurasGeometricas;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Cuadrado f1=new Cuadrado();
        f1.setNombre("Cuadrado1");
        f1.setArea(3);
        f1.setPerimetro(3);
        f1.setLado(6.8);
        System.out.println(f1.toString());
        System.out.println(f1.calcularArea());
         System.out.println(f1.calcularPerimetro());
     
        System.out.println(f1.toString());
    }
    
}
