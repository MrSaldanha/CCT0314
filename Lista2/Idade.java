
package Lista2;

import javax.swing.JOptionPane;

public class Idade {
    
    public static void main(String[] args) {
        int idade,i ;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
        
        i = analisaIdade(idade);
        
    }
    
    public static int analisaIdade(int idade) {
        if (idade >= 21)
            JOptionPane.showMessageDialog(null,"Você já é maior de idade!");
        else JOptionPane.showMessageDialog(null,"Você é menor de idade!");
        
        /*
        Para utilizar o operador condicional:
        JOptionPane.showMessageDialog(null,idade >= 21 ? "Você já é maior de idade!" : "Você é menor de idade!");
        */
        
        return idade;      
    }
    
}
