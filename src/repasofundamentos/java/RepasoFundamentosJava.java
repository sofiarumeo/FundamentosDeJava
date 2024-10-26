/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasofundamentos.java;

import java.util.Scanner;

/**
 *
 * @author sofia
 */
public class RepasoFundamentosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Cadena de caracteres
        String name;
        
        // Enteros
        int num;
        
        // Flotantes - Reales
        double real;
        
        // ASIGNAR VALORES A LAS VARIABLES
        name = "Sofia";
        num = 19;
        real = 12.5;
        
        // MOSTRAR EN TERMINAL . sout+tabulador.
        System.out.println("Mi nombre es: " + name);
        System.out.println("Mi edad es " + num);
        System.out.println("y cobro " + real + "Dolaruchos");
        
        
        // OPERACIONES ARITMETICOS +, -, *, /, %(resto
        int numa = 17;
        int numb  = 3;
        int nume = 14;
    
        int suma = numa + numb;
    
        System.out.println("%%%%%%");
        //System.out.println(numc % numb);
     
        //System.out.println(numa - numc);
        System.out.println(numa + " + " + numb + " = " + suma);
        
        //OPERADORES LOGICOS
        // AND - OR - NOT
    
        //OPERADORES RELACIONALES
        // < > == != ===
    
        System.out.println("RELACIONALES");
        int numUnoRel = 2;
        int numDosRel = 2;
        int numTresRel = 8;
        int numCuatroRel = 15;
        
        System.out.println(numUnoRel == numDosRel || numCuatroRel==numTresRel);
        
        //OPERADORES DE INCREMENTO Y DECREMENTO
        // VAR++ VAR--
        System.out.println("OPERADORES DE INCREMENTO Y DECREMENTO");
        int numIncDec = 0;
        numIncDec++;
        numIncDec++;
        numIncDec++;
        numIncDec--;
        System.out.println(numIncDec);
        
        // ENTRADA DE DATOS
        // clasescanner - ingresa datos
        
        Scanner leer = new Scanner(System.in);
        //Nombre
        //System.out.println("Ingrese su nombre: ");
        //String nombre = leer.nextLine();
        
        
        //Edad
        
        //System.out.println("Ingrese su edad ");
        //int edadScanner = leer.nextInt();
        
        
        //Email
        //System.out.println("Ingrese su email: ");
        //String email = leer.nextLine();
        
        //System.out.printf("Mi edad es %d, y me llamo %s ", y mi correo es %s ", edadScanner, nombre, emailito);
        
        //CONDICIONALES
        // SON CONDICIONES SI PASA X = ALGO SI NO = OTRA COSA
        // IF, IF ELSE, ELSE
        int numx = 1;
        if (numx > 1) {
            System.out.println("Es verdad");
        } else {
            System.out.println("Es mentira");
        }
        
        //BUCLES
        // FOR 
        // for(inicializacion; Condicion, Actualizacion)
        
        for(int i = 1; i <= 10; ++i){
            System.out.println("Numero: " + i);
        }
        
        // WHILE
        // while(condicion)
        
        int j =1;
        while (j <= 10) {
            System.out.println("WHILE Numero: " + j);
            j++;
        }
        
            
         
            
            
            
     
        
    }
           
} 
