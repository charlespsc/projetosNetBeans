package idiomasistema;

import java.util.*;

/**
 *
 * @author Prof. Charles
 */
public class IdiomaSistema {

    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.print("Seu sistema está em:  ");
        System.out.println(idioma.getDisplayLanguage());
    }
    
}
