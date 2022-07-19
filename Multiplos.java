/*Faça um programa que armazena 8 números e imprimi todos os números. Ao final, teremos o total de números múltiplos de seis digitados*/


package lista;

import java.util.Scanner;

public class exer3 {

	public static void main(String[] args){
		
		Scanner teclado = new Scanner (System.in);
		int cont=0;
		int vet[];
		vet = new int [8];
		System.out.println("digite oito numeros");
		for (int i = 0; i < 8; i++) {
			vet[i]= teclado.nextInt();	
		}
		
		for (int i = 0; i < 8; i++) {
			if(vet[i]%2 == 0){
				cont ++;
			}
		}
		
		System.out.println(cont);
		
	}
}
