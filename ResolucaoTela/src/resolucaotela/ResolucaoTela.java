package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Prof. Charles
 */
public class ResolucaoTela {

    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.print("Sua tela está em resolução " + d.width);
        System.out.println(" x " + d.height);
    }
    
}
