package Exercicio4;

import Util.Util;

public class Palindromo {
	
	Util util = new Util();

	public void buscarMaiorPalindromo() {
		
		int qtdDigitos, multiplicando, multiplicador, produto, maiorPalindromo = 0;
		System.out.println("Informe a Quantidade digitos:\n");
		qtdDigitos = util.lerDados();
		qtdDigitos = (int) Math.pow(10,qtdDigitos); 
		
		for(multiplicando = 0; multiplicando<qtdDigitos; multiplicando++) {
			for(multiplicador = 0; multiplicador<qtdDigitos; multiplicador++) {
				produto = multiplicando * multiplicador;
				if(verificaPalindromo(produto)) {
					if(produto > maiorPalindromo) {
						maiorPalindromo = produto;
					}
				}
			}
		}
		
		System.out.println("Maior Palíndromo é: " + maiorPalindromo + "\n");
	}
	
	public boolean verificaPalindromo(int produto) {
		int produtoInvertido;
		produtoInvertido = inverterNumero(produto);
		if(produto == produtoInvertido) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int inverterNumero(int produto) {
		
		int numeroInvertido = 0;
		while(produto != 0) {
			numeroInvertido *= 10;
			numeroInvertido += (produto%10);
			produto /= 10;
		}
	
		return numeroInvertido;
	}
}