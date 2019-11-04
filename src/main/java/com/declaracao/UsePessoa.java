package com.declaracao;

public class UsePessoa {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new
				Pessoa();
		Carro c1 = new Carro();
				
		c1.ano = 1995;
		c1.chassi = "abc 123";
		c1.placa = "phd1980";
		
		p1.nome = "Henrique";
		p1.idade = 38;
		p1.carro = c1;
		
		System.out.println(p1);
		
	}
}
