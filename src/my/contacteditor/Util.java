/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.contacteditor;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author testes
 */
public class Util {

    public static int pergunteInt(String msg) {
        do {
            String aux = JOptionPane.showInputDialog(msg);
            try {
                int numero = Integer.parseInt(aux);
                return (numero);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digite um valor Valido !!");
            }

        } while (true);
    }

    public static boolean validaIntervalo(int min, int valor, int max) {
        return valor >= min && max >= valor;
    }

    public static boolean validaMetodosSelecionados(boolean[] v) {
        if (!v[0]) {
            if (!v[1]) {
                if (!v[2]) {
                    if (!v[3]) {
                        if (!v[4]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void mostre(String shooooooooooooow) {
        JOptionPane.showMessageDialog(null, shooooooooooooow);

    }

    public static void console(String msg) {
        System.out.println(msg);
    }

    public static String vetorString(int[] vetor) {
        String texto = "[";
        for (int u = 0; u < vetor.length; u++) {
            if (u != vetor.length - 1) {
                texto += Integer.toString(vetor[u]) + ",";
            } else {
                texto += Integer.toString(vetor[u]);
            }

        }
        texto += "]";
        return texto;
    }

    public static void copiaVetor(int[] original, int[] copia) {
        System.arraycopy(original, 0, copia, 0, original.length);
    }

    public static int[] geraVetor(int tam) {
        int[] vet = new int[tam];
        Random ran = new Random();
        int h = 0;
        while (h < vet.length) {
            vet[h] = ran.nextInt();

            h++;
        }
        return vet;
    }

}
