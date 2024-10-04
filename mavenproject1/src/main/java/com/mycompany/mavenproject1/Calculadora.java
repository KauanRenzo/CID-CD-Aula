
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;


public class Calculadora {
    static int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma operação: \n 1- Soma \n 2- Subtração \n 3- Multiplicação \n 4- Divisão"));
    static double num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número:"));
    static double num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número:"));
    
    
    public static void main(String[] args) {
        if (op == 1){
            soma(num1, num2);
        }else if (op == 2){
            subtracao(num1, num2);
        }else if (op == 3){
            multiplicacao(num1, num2);
        
        }else if (op == 4){
            divisao(num1, num2);
            }
                   
    }
        
        public static double  soma (double num1, double num2){
            double resultado = num1+num2;
            System.out.println("O resultado da soma é: " + resultado);
            return resultado;
        
    }
        public static double subtracao (double num1, double num2){
            double resultado = num1-num2;
            System.out.println("O resultado da subtração é: " + resultado);
            return resultado;
            
}
        public static double multiplicacao (double num1, double num2){
            double resultado = num1*num2;
            System.out.println("O resultado da multiplicação é: " + resultado);
            return resultado;
}
        public static double divisao (  double num1,  double num2){
            double resultado = num1/num2;
            System.out.println("O resultado da divisão é: " + resultado);
            return resultado;
}
}



    
