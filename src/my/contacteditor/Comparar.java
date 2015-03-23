/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.contacteditor;

/**
 *
 * @author testes
 */
public class Comparar {

    public static String realizarComparacao(int tamanhoVetor, int tipoOrdenacao, boolean[] vetorMetodos) {

        int vOriginal[] = Util.geraVetor(tamanhoVetor);
        int vetor1[] = new int[vOriginal.length];
        double itemp;
        String msgFinal;
        StringBuilder concatStr = new StringBuilder();
        concatStr.append("Vetor com ").append(tamanhoVetor).append(" posições\n");
        //msgFinal = "Vetor com " + tamanhoVetor + " posições\n";

        if (tipoOrdenacao == 0) {
            //msgFinal += "Tipo de Ordenação : Crescente\n";
            concatStr.append("Tipo de Ordenação : Crescente\n");
            if (vetorMetodos[0]) {
                Util.copiaVetor(vOriginal, vetor1);
                itemp = System.currentTimeMillis();
                OrdenarPor.bolhaCres(vetor1);
                itemp = System.currentTimeMillis() - itemp;
                //msgFinal += String.valueOf(itemp) + " milis por Bolha\n";
               concatStr.append(itemp).append(" milis por Bolha\n");
            }

            if (vetorMetodos[1]) {
                Util.copiaVetor(vOriginal, vetor1);
                itemp = System.currentTimeMillis();
                OrdenarPor.selecaoCres(vetor1);
                itemp = System.currentTimeMillis() - itemp;
                //msgFinal += String.valueOf(itemp) + " milis por Seleção\n";
                concatStr.append(itemp).append(" milis por Seleção\n");
            }

            if (vetorMetodos[2]) {
                Util.copiaVetor(vOriginal, vetor1);
                itemp = System.currentTimeMillis();
                OrdenarPor.insercaoCres(vetor1);
                itemp = System.currentTimeMillis() - itemp;
                //msgFinal += String.valueOf(itemp) + " milis por Inserção\n";
                concatStr.append(itemp).append(" milis por Inserção\n");
            }

            if (vetorMetodos[3]) {
                Util.copiaVetor(vOriginal, vetor1);
                itemp = System.currentTimeMillis();
                OrdenarPor.shellsortCres(vetor1);
                itemp = System.currentTimeMillis() - itemp;
               // msgFinal += String.valueOf(itemp)+ " milis por ShellSort\n";
                concatStr.append(itemp).append(" milis por ShellSort\n");
            }
            if (vetorMetodos[4]) {
                Util.copiaVetor(vOriginal, vetor1);
                itemp = System.currentTimeMillis();
                OrdenarPor.heapsortCres(vetor1);
                itemp = System.currentTimeMillis() - itemp;
                //msgFinal += String.valueOf(itemp) + " milis por HeapSort\n";
                concatStr.append(itemp).append(" milis por HeapSort\n");
            }
            //return msgFinal;
            return concatStr.toString();
        } else {

           // msgFinal += "Tipo de Ordenação : Decrescente\n";
           concatStr.append("Tipo de Ordenação : Decrescente\n");

            if (vetorMetodos[0]) {
                Util.copiaVetor(vOriginal, vetor1);
                itemp = System.currentTimeMillis();
                OrdenarPor.bolhaDecr(vetor1);
                itemp = System.currentTimeMillis() - itemp;
                //msgFinal += String.valueOf(itemp) + " milis por Bolha\n";
                concatStr.append(itemp).append(" milis por Bolha\n");
            }

            if (vetorMetodos[1]) {
                Util.copiaVetor(vOriginal, vetor1);
                itemp = System.currentTimeMillis();
                OrdenarPor.selecaoDecr(vetor1);
                itemp = System.currentTimeMillis() - itemp;
               // msgFinal += String.valueOf(itemp) + " milis por Seleção\n";
                concatStr.append(itemp).append(" milis por Seleção\n");
            }

            if (vetorMetodos[2]) {
                Util.copiaVetor(vOriginal, vetor1);
                itemp = System.currentTimeMillis();
                OrdenarPor.insercaoDecr(vetor1);
                itemp = System.currentTimeMillis() - itemp;
                //msgFinal += String.valueOf(itemp) + " milis por Inserção\n";
                concatStr.append(itemp).append(" milis por Inserção\n");
            }

            if (vetorMetodos[3]) {
                Util.copiaVetor(vOriginal, vetor1);
                itemp = System.currentTimeMillis();
                OrdenarPor.shellsortDecr(vetor1);
                itemp = System.currentTimeMillis() - itemp;
                //msgFinal += String.valueOf(itemp)+ " milis por ShellSort\n";
                concatStr.append(itemp).append(" milis por ShellSort\n");
            }
            if (vetorMetodos[4]) {
                Util.copiaVetor(vOriginal, vetor1);
                itemp = System.currentTimeMillis();
                OrdenarPor.heapsortCres(vetor1);
                itemp = System.currentTimeMillis() - itemp;
                //msgFinal += String.valueOf(itemp) + " milis por HeapSort\n";
                concatStr.append(itemp).append(" milis por HeapSort\n");
                
            }
            return concatStr.toString();
        }

    }

}
