package Carrinho;

public class Comprador {
	private String nome;
	private double valorTotalCarteira;
	private Carrinho carrinho;
	
	public Comprador(String nome, double valorTotalCarteira, int qtdCarrinho, double precoUnitario) {
		this.nome = nome;
		this.valorTotalCarteira = valorTotalCarteira;
		this.carrinho = new Carrinho(qtdCarrinho, precoUnitario);
	}
	public double getValorTotalCarteira() {
		return valorTotalCarteira;
	}
	public void printComprador() {
		System.out.println("Nome comprador(a): " + nome);
		System.out.printf ("Valor para gastar: R$ %.2f\n", 
                                  valorTotalCarteira);
		carrinho.printCarrinho();
		System.out.println("----------------------");
	}
	public static void main(String[] args){
		int totalInclusao = 5;
		int totalRemocao  = 1;
		
		Comprador maria = new Comprador ("Maria", 10.0, 5, 15.0);
		maria.printComprador();
		try {
			for(int i= 0; i< totalInclusao ; i++) // insere 
                                          // "totalInclusao" de itens no carrinho
				maria.carrinho.inserir();
			System.out.println("Itens no carrinho, após inclusão = " +   
                                          maria.carrinho.getQuantidade());
			for(int i= 0; i< totalRemocao  ; i++) // insere  
                                           // "totalRemocao" de itens no carrinho
				maria.carrinho.remover();
			System.out.println("Itens no carrinho, após remoção  = " + 
                        maria.carrinho.getQuantidade());
			System.out.printf ("Valor a pagar: R$ %.2f\n" ,                
                        maria.carrinho.totalizar(maria.getValorTotalCarteira()));
		}catch(AssertionError e) {
			System.out.println("Erro - " + e.getMessage());
		}
	}
}