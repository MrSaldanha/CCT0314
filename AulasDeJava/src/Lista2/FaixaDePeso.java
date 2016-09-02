
package Lista2;

import javax.swing.JOptionPane;

public class FaixaDePeso {
    
    public static void main(String[] args) {
        double altura, peso, imc;
        
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: "));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: "));
        
        imc = obtemIMC(altura, peso);
        comparaIMC(imc);
    }
    
    public static double obtemIMC(double altura, double peso){
        double imc = peso / (altura*altura);
        return imc;
    }
        
    public static void comparaIMC(double imc){
        if (imc<=18.5){
            JOptionPane.showMessageDialog(null,"Você está abaixo do peso normal.");
        }
        else if (imc<=25){
            JOptionPane.showMessageDialog(null,"O seu peso está na faixa de normalidade.");
        }
        else if (imc<=30){
            JOptionPane.showMessageDialog(null,"Você está acima do seu peso normal.");
        }
        else {
            JOptionPane.showMessageDialog(null,"Você precisa perder uns quilinhos.");
        }
    }
}