
package lezione1;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

public class Main {

   
    public static void main(String[] args) {
        
        System.out.println("BASISSIME DI PROGRAMMAZIONE JAVA");
        
            String f= JOptionPane.showInputDialog("inserisci un testo");
        
            System.out.println(f);
            JOptionPane.showMessageDialog(null, f);
       
    }
    
}
