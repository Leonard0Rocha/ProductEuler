package Exercicio7;

import Util.Util;

public class Primo {

	public void buscarPrimo() {
		Util util = new Util();
		
		int posicaoNumero, numeroParaVerificar, contPrimo = 0;
		
		System.out.println("Informe a posiçao");
		posicaoNumero = util.lerDados();
		
		for(numeroParaVerificar = 1; contPrimo<posicaoNumero; numeroParaVerificar++) {
			if(verificaPrimo(numeroParaVerificar)) {
				contPrimo++;
			}
		}
		
		numeroParaVerificar--;
		System.out.println("O numero primo na posição " + posicaoNumero + " é : " + numeroParaVerificar);
		
		
	}
	
	private boolean verificaPrimo(int numero) {

		int cont = 0;
		 for (int i=1;i<=numero;i++ ){
			   if(numero%i == 0) {
			   cont=cont+1;
			  }
		 }
		 if(cont == 2) {
			 return true;
		 }
		 return false;
	}
}


