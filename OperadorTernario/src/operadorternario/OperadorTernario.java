/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author charles
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, r;
        n1 = 14;
        n2 = 18;
        r = (n1>n2)?n1:n2;
        System.out.println(r);
        
        //COMPARAÇÃO DE STRING
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        res = (nome1 == nome3)?"igual":"diferente";
        System.out.println(res);
        
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);    
        
    }
    
}
