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
       
        /*int numero = 5;
        numero++;
        System.out.println(numero);
        
        int valor = 5 + numero++; // Pós incremento
        System.out.println(valor);
        System.out.println(numero);
        
        int valor = 5 + ++numero; // Pré incremento
        System.out.println(valor);  
        */
        
        //int x = 4;
        //x += 2; // x = x + 2
        //System.out.println(x);
        
        // Classe Math
        /*
        PI -> Constante Pi -> Math.PI = 3.1415...
        POW -> Exponenciação -> Math.pow(5,2) = 25
        sqrt -> Raiz Quadrada -> Math.sqrt(25) = 5
        cbrt -> Raiz Cúbica -> Math.cbrt(27) = 3
        */
        // Arredondamentos
        /*
        abs     - valor absoluto                - Math.abs(-10)     = 10
        floor   - arredonda para baixo          - Math.floor(3.9)   = 3
        ceil    - arredonda para cima           - Math.ceil(4.2)    = 5
        round   - arredonda aritmeticamente     - Math.round(5.6)   = 6
        */
        /*
        float v = 8.5f;
        int ar = (int) Math.round(v);
        System.out.println(ar);
        */
        
        // Gerador de Números
        double aleatori = Math.random();
        int num = (int) (1 + aleatori * (10 - 1));
        System.out.println(num);
        
        
        
        
    }
    
}
