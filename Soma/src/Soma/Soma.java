/**
 * Programa: Soma.
 * Autor: Marcos Gabriel De Oliveira Favaretto.
 * Data: 30 de Julho de 2019.
 */
package Soma;

import javax.swing.JOptionPane;

public class Soma {

    public static void main(String[] args) {
        int valor1;
        int valor2;
        int total;
        String nome;
        nome = JOptionPane.showInputDialog("Digite o seu nome:");
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        total = valor1 + valor2;
        JOptionPane.showMessageDialog(null, "O seu nome é: " + nome + "\n" + "E o seu resultado é: " + total, "Resultado: ", JOptionPane.OK_OPTION);
    }
}