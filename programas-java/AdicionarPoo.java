package com.mycompany.adicionar.poo;
import javax.swing.JOptionPane;

public class AdicionarPoo {

    public static void main(String[] args) {
        String firstNumber;
        String secondNumber;
        int num1;
        int num2;
        int sum;
        
        firstNumber = JOptionPane.showInputDialog("Enter first number:");
        secondNumber = JOptionPane.showInputDialog("Enter second number:");
        num1=Integer.parseInt(firstNumber);
        num2=Integer.parseInt(secondNumber);
        
        sum = num1+num2;
        
        JOptionPane.showMessageDialog(null,"The sum is "+sum,"Results", JOptionPane.PLAIN_MESSAGE);

        }
    }