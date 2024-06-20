/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
         /* codigo para pedir que ingrese un numero*/
        int empleados;
        
        empleados = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite la cantidad de empleados:"));
      
         /*lo utilizo para ir incrementando*/
       for (int i = 0; i < empleados; i++) {
       }    
        int i = 0;
       double salarioIndividual = Double.parseDouble(JOptionPane.showInputDialog(null, 
               "Digite el salario de cada empleado:"+(i+1+":")));
       
       double totalPagar = 0;
       /*lo utilizo para sacar el seguro de enfermedades y invalidez del salario del empelado*/
       double sem = salarioIndividual * 0.0925;
       double ivm = salarioIndividual*  0.0508;
       
       /* hago la operacion para sacar el resultado final*/
       totalPagar = sem* ivm;
       JOptionPane.showMessageDialog(null, " la empresa debe pagar un total de " + totalPagar );
       
        }
               
    
        
        
    }
    

