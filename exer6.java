/*6. Fa�a um algoritmo que recebendo um vetor e calcula a 
frequ�ncia de cada elemento encontrado dentro do vetor. 
Tamanho ser� informado pelo usu�rio. */



package lista;

import java.util.Scanner;

public class exer6 {
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		
		int vet[];
		vet = new int [100];
		int qtd,cont ;
		
		System.out.println("quantas posi��es vc deseja em seu vetor");
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
