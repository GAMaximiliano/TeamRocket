/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import metodos.metodosSobrecargados;

public class test {
    public static void main(String[]args){
        int resultado = metodosSobrecargados.sumar(5, 20);
        double resultado1 = metodosSobrecargados.sumar(5L, 20);
        int resultado2 = metodosSobrecargados.triangulo(5, 20);
        double resultado3 = metodosSobrecargados.triangulo(5L, 20);
        int resultado4 = metodosSobrecargados.cuadrado(5, 20);
        double resultado5 = metodosSobrecargados.cuadrado(5L, 20);
        int resultado6 = metodosSobrecargados.circulo(5);
        double resultado7 = metodosSobrecargados.circulo(5L);
        System.out.println("Suma: Resultado int 1 = "+ resultado + " Resultado double = "+ resultado1);
        System.out.println("Triangulo: Resultdoa int = "+ resultado2 + " Resultado double = "+ resultado3);
        System.out.println("Cuadrado: Resultado int = "+ resultado4 + " Resultado double = "+ resultado5);
        System.out.println("Circulo: Resultado int = "+ resultado6 + " Resultado double = "+ resultado7);
    }
}
