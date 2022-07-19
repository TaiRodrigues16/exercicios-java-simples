/*6. Faça um algoritmo que recebendo um vetor e calcula a 
frequência de cada elemento encontrado dentro do vetor. 
Tamanho será informado pelo usuário. */



package lista;

import java.util.Scanner;

public class exer6 {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		
		int vet[];
		vet = new int [100];
		int qtd,cont ;
		
		System.out.println("quantas posições vc deseja em seu vetor");
		qtd = teclado.nextInt();
		
		System.out.println("Agora digite o seu vetor");
		
		for (int i = 0; i <qtd; i++) {
			
			vet[i] = teclado.nextInt();
		
			
		}
		
	for (int i = 0; i < qtd; i++) {
			cont =0;
			for (int j = 0; j < qtd; j++) {
				
				if(vet[i] == vet[j]){
					
					cont ++;
					
					
				}
				
			}
			System.out.println("o numero "+ vet[i] +" apareceu "+ cont +"vezes" );	
			
		}
		
	
		
		
	}
	
	
	

}
