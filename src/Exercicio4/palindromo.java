package Exercicio4;

import Util.Util;

public class palindromo {
	
	Util util = new Util();

	public void teste() {
		
		int qtdDigitos, numeroUm, numeroDois, produto, maiorPalindromo = 0;
		System.out.println("Informe a Quantidade digitos:\n");
		qtdDigitos = util.lerDados();
		qtdDigitos = (int) Math.pow(10,qtdDigitos); 
		
		for(numeroUm = 0; numeroUm<qtdDigitos; numeroUm++) {
			for(numeroDois = 0; numeroDois<qtdDigitos; numeroDois++) {
				produto = numeroUm * numeroDois;
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