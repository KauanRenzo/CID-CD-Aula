
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;


public class Calculadora {
    static int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma operação: \n 1- Soma \n 2- Subtração \n 3- Multiplicação \n 4- Divisão"));
    static double num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número:"));
    static double num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número:"));
    
    
    public static void main(String[] args) {
        
    }
        
        public double soma (double num1, double num2){
            double resultado = num1+num2;
            return resultado;
        
    }
        public double subtração (double num1, double num2){
            double resultado = num1-num2;
            return resultado;
            
}
        public double multiplicação (double num1, double num2){
            double resultado = num1*num2;
            return resultado;
}
        public double divisão (  double num1,  double num2){
            double resultado = num1/num2;
            return resultado;
}
}

    
