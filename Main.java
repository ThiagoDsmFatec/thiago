package br.edu.fatecpg.veiculo;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);

Carro carroAle =  new Carro("ASD123","RENAULT","LOGAN", 1.6);


	

System.out.println("declare o valor do combustivel");
double valorGasolina = scan.nextDouble();

System.out.println("declare a quantidade do combustivel em litros");
double quantidade = scan.nextDouble();

carroAle.setTanque(quantidade);
carroAle.tanque(valorGasolina);
	
	
	}
	}