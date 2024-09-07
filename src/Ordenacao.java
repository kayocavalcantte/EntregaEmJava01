
import java.util.Arrays;
import java.util.Scanner;

public class Ordenacao {
    int[] vetor;
    int n, i = 0;
    int aux;
    public void Ordenar() {
        System.out.println("quantos numeros teram seu vetor?");
        Scanner v = new Scanner(System.in);
        n = v.nextInt();
        vetor = new int[n];

        while(i < n){
            System.out.println("digite o " + i + "°" + " valor: ");
            Scanner prompt = new Scanner(System.in);

            vetor[i] = prompt.nextInt();

            i++;
        }

        System.out.println("O vetor original: " + Arrays.toString(vetor));

        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j < vetor.length; j++){
                if(vetor[i] < vetor[j]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        System.out.println("O vetor organizado em ordem crescente: " + Arrays.toString(vetor));
    }
}