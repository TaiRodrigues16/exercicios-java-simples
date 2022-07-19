//2. Faça um programa que leia um vetor de 10 elementos e obter um novo vetor cujos componentes são fatoriais dos respectivos elementos do vetor lido. 


package lista;

import java.util.Scanner;

public class exercicio2 {
	
	 public static void main(String[] args) {
		 
		Scanner teclado = new Scanner(System.in);

		int pvetor[];
		int i;
		pvetor = new int[10];
		int j;

		int fatorial[];
		fatorial = new int[10];

		System.out.println("digite 10 numeros :");

		for(i=0; i < 3 ; i++){
			pvetor [i] = teclado.nextInt();
			System.out.println(pvetor[i]);
		}	
		int f;
		 
		for(i=0; i < 3 ; i++){
			f = pvetor[i];

			while (pvetor[i] > 1){ 
		 		f = f *(pvetor[i]-1); 
				pvetor[i]--; 
		   	} 

			fatorial[i] = f;

		}
		 
		for(i=0; i < 3 ; i++){
			System.out.println(fatorial[i]);
		}	
				
	 }	 
}
