/*
 * Programa Revisão De Java Básico
 * Autor: Marcos Gabriel De Oliveira Favaretto
 * Aula de D.S. 30/07/2019
 */
package Soma;

import javax.swing.JOptionPane;

/**
 *
 * @author ETEC ALUNO
 */
public class Soma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor1;
        int valor2;
        int total;
        String nome;
        nome = JOptionPane.showInputDialog("Digite o seu nome:");
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        total = valor1 + valor2;
        JOptionPane.showMessageDialog(null,"O seu nome é: " + nome + "\n" + "E o seu resultado é: " + total,"Resultado: ",JOptionPane.OK_OPTION);
    }
    
}
