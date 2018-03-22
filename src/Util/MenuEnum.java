package Util;

public enum MenuEnum {  
	Palindromo("Digite 1: Problema 4 \n Encontre o maior pal�ndromo feito a partir do produto de dois"
			+ "n�meros de 3 d�gitos. \n\n\n", 1),
    Primo("Digite 2: Problema 7 \n Mostrar um numero primo de uma posi��o desejada \n\n\n", 2),
    Produto("Digite 3: Problema 8 \n Encontrar numeros adjacentes \n\n\n", 3);

    private int posEscolha;
    private String nome;
    
    MenuEnum(String nome, int posEscolha){
        this.nome = nome;
        this.posEscolha = posEscolha;
    }

    public double getPosEscolha(){
        return this.posEscolha;
    }
    
    public String getNome(){
        return this.nome;
    }
}
