package my.contacteditor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author testes
 */
public class OrdenarPor {

    public static void bolhaCres(int[] vet) {
        for (int x = 1; x < vet.length; x++) {
            boolean fez_troca = false;
            for (int i = 0; i < vet.length - x; i++) {
                if (vet[i] > vet[i + 1]) {
                    int aux = vet[i];
                    vet[i] = vet[i + 1];
                    vet[i + 1] = aux;
                    fez_troca = true;
                }
            }
            if (!fez_troca) {
                break;
            }
        }

    }

    public static void selecaoCres(int[] vetor) {
        for (int t = 0; t < vetor.length - 1; t++) {
            int menor = t;
            for (int x = t + 1; x < vetor.length; x++) {
                if (vetor[x] < vetor[menor]) {
                    menor = x;
                }
            }
            if (t != menor) {
                int aux = vetor[t];
                vetor[t] = vetor[menor];
                vetor[menor] = aux;
            }
        }

    }

    public static void insercaoCres(int[] vetor) {

        for (int i = 1; i < vetor.length; i++) {
            int aux = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = aux;
        }

    }

    public static void shellsortCres(int[] vetor) {
        int salto = 0;
        do {
            salto = 3 * salto + 1;
        } while (salto < vetor.length / 2);
        while (salto > 1) {
            salto = salto / 3;
            for (int i = salto; i < vetor.length; i = i + salto) {
                int aux = vetor[i];
                int j = i - salto;
                while (j >= 0 && vetor[j] > aux) {
                    vetor[j + salto] = vetor[j];
                    j = j - salto;
                }
                vetor[j + salto] = aux;
            }
        }
    }

    public static void heapsortCres(int[] vetor) {
        int posOrdenada, i, pai, filho, t;
        posOrdenada = vetor.length;
        i = vetor.length / 2;
        boolean continuarHeap;
        do {
            if (i > 0) {
                i = i - 1;
                t = vetor[i];
            } else {
                posOrdenada = posOrdenada - 1;
                t = vetor[posOrdenada];
                vetor[posOrdenada] = vetor[0];
            }
            pai = i;
            filho = (i * 2) + 1;
            continuarHeap = true;
            while (filho < posOrdenada && continuarHeap) {
                if ((filho + 1) < posOrdenada
                        && (vetor[filho + 1] > vetor[filho])) {
                    filho = filho + 1;
                }

                if (vetor[filho] > t) {
                    vetor[pai] = vetor[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                } else {
                    continuarHeap = false;
                }
            }
            vetor[pai] = t;
        } while (posOrdenada > 1);

    }

    public static void bolhaDecr(int[] vet) {
        for (int x = 1; x < vet.length; x++) {
            boolean fez_troca = false;
            for (int i = 0; i < vet.length - x; i++) {
                if (vet[i] < vet[i + 1]) {
                    int aux = vet[i];
                    vet[i] = vet[i + 1];
                    vet[i + 1] = aux;
                    fez_troca = true;
                }
            }
            if (!fez_troca) {
                break;
            }
        }

    }

    public static void selecaoDecr(int[] vetor) {
        for (int t = 0; t < vetor.length - 1; t++) {
            int menor = t;
            for (int x = t + 1; x < vetor.length; x++) {
                if (vetor[x] > vetor[menor]) {
                    menor = x;
                }
            }
            if (t != menor) {
                int aux = vetor[t];
                vetor[t] = vetor[menor];
                vetor[menor] = aux;
            }
        }

    }

    public static void insercaoDecr(int[] vetor) {

        for (int i = 1; i < vetor.length; i++) {
            int aux = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] < aux) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = aux;
        }

    }

    public static void shellsortDecr(int[] vetor) {
        int salto = 0;
        do {
            salto = 3 * salto + 1;
        } while (salto < vetor.length / 2);
        while (salto > 1) {
            salto = salto / 3;
            for (int i = salto; i < vetor.length-1; i = i + salto) {
                int aux = vetor[i];
                int j = i - salto;
                while (j >= 0 && vetor[j] < aux) {
                    vetor[j + salto] = vetor[j];
                    j = j - salto;
                }
                vetor[j + salto] = aux;
            }
        }
    }

    public static void heapsortDecr(int[] vetor) {
        int posOrdenada, i, pai, filho, t;
        posOrdenada = vetor.length;
        i = vetor.length / 2;
        boolean continuarHeap;
        do {
            if (i > 0) {
                i = i - 1;
                t = vetor[i];
            } else {
                posOrdenada = posOrdenada - 1;
                t = vetor[posOrdenada];
                vetor[posOrdenada] = vetor[0];
            }
            pai = i;
            filho = (i * 2) + 1;
            continuarHeap = true;
            while (filho < posOrdenada && continuarHeap) {
                if ((filho + 1) < posOrdenada
                        && (vetor[filho + 1] < vetor[filho])) {
                    filho = filho + 1;
                }

                if (vetor[filho] < t) {
                    vetor[pai] = vetor[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                } else {
                    continuarHeap = false;
                }
            }
            vetor[pai] = t;
        } while (posOrdenada > 1);

    }

}
