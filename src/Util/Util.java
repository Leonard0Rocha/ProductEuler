package Util;

import java.util.Scanner;

import Exercicio4.Palindromo;
import Exercicio7.Primo;

public class Util {


	 public int lerDados() {

		Scanner lerEntrada = new Scanner(System.in);
		int dadoDigitado = lerEntrada.nextInt();
		
		return dadoDigitado;
		
	}
	 public void exibirMenu() {
		 System.out.println("Escolha um problema do Product Euler abaixo:");
		 System.out.println(MenuEnum.Palindromo.getNome() + MenuEnum.Primo.getNome() + MenuEnum.Produto.getNome());
			escolhaMenu(lerDados());
	 }
	 
	 public void escolhaMenu(int dadoDigitado) {
		
			switch (dadoDigitado) {
			case 1:
				Palindromo palimedro = new Palindromo();
				palimedro.buscarMaiorPalindromo();
				exibirMenu();
				break;
			case 2:
				Primo primo = new Primo();
				primo.buscarPrimo();
				exibirMenu();
				break;
			case 3:
				System.out.println("DADO DIGITADO FOI 3");

			case 0:
				System.out.println("Sair do Sistema");
				System.exit(0);
			default:

				System.out.println("DADO DIGITADO INVALIDO, DIGITE NOVAMENTE");
				exibirMenu();
			}
		}
}
