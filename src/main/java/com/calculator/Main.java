package com.calculator;

import javax.swing.*;

// import static java.lang.Math.sqrt;
public class Main {

        public static void main(String[] args) {
            String a_txt = JOptionPane.showInputDialog("Insira o valor de A: ");
            String b_txt = JOptionPane.showInputDialog("Insira o valor de B: ");
            String c_txt = JOptionPane.showInputDialog("Insira o valor de C: ");
            double a = Integer.parseInt(a_txt);
            double b = Integer.parseInt(b_txt);
            double c = Integer.parseInt(c_txt);

            double delta = b*b - 4*a*c;
            // System.out.println(delta);
           if (delta > 0){
               double raiz1 = (-b + Math.sqrt(delta)) / (2*a);
               double raiz2 = (-b - Math.sqrt(delta)) / (2*a);
               JOptionPane.showMessageDialog(null, "Temos duas raízes reais e diferentes.");
               JOptionPane.showMessageDialog(null, "Considerando x' e x'' temos: ");

               JOptionPane.showMessageDialog(null, "x' = "
                       + String.format("%.3f", raiz1)
                       + " x'' = "+ String.format("%.3f", raiz2));

            } else if (delta == 0){
                double raiz = (-b)/(2*a);
               JOptionPane.showMessageDialog(null,
                       "Temos uma raíz");
               JOptionPane.showMessageDialog(null,
                       "x = " + String.format("%.1f", raiz));
            } else {
               JOptionPane.showMessageDialog(null,
                       "Não temos raízes reais");
            }
        }
    }