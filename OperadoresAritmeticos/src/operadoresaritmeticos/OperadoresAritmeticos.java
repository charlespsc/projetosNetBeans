/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author charles
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* int n1 = 3;
        int n2 = 5;
        float media = (n1 + n2)/2;
        
        System.out.println("A média é igual a " + media);
        */
       
        int numero = 5;
        //numero++;
        //System.out.println(numero);
        
        //int valor = 5 + numero++; // Pós incremento
        //System.out.println(valor);
        //System.out.println(numero);
        
        int valor = 5 + ++numero; // Pré incremento
        System.out.println(valor);
        
    }
    
}
