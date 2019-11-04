package com.capgemini.cap5lab1;

public class Cap5_Lab1 {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.cargo = "Analista,";
		f1.nome = "Paschoal,";
		f1.sobrenome = "Henrique,";
		f1.salario = 10.000;

		System.out.println(f1.cargo);
		System.out.println(f1.nome);
		System.out.println(f1.sobrenome);
		System.out.println(f1.salario);
	}

}
