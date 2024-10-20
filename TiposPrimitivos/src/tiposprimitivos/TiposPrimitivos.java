/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;
/**
 *
 * @author charles
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        String nome = "Gustavo";
        float nota = 8.5f;
         
        // SAÍDA DE DADOS --------------------------
        //System.out.print("A nota é " + nota);
        //System.out.println("A nota é " + nota);
        
        System.out.printf("A nota de %s é %.2f \n", nome, nota); // Impressão formatada
        
        System.out.format("A nota de %s é %.2f \n", nome, nota); // Impressão formatada
        // ------------------------------------------
        System.out.print("Digite um nome: ");
        String nomeAluno = teclado.nextLine();
        
        System.out.print("Digite uma nota: ");
        float nota2 = teclado.nextFloat();
        
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Nota: " + nota2);
        
        
        // INCOMPATIBILIDADE DE TIPOS (STRING x NUMEROS)
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        String valor2 = "30";
        int idade2 = Integer.parseInt(valor2);
        System.out.println(valor2);
        
    }
    
}
