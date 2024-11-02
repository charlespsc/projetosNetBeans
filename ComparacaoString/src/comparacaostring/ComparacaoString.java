/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author charles
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Charles";
        String nome2 = "Charles";
        String nome3 = new String("Charles");
        String result;
        result = (nome1.equals(nome3))?"Igual":"Diferente"; //.equals verifica o conteúdo do obj
        System.out.println(result);
    }
    
}
