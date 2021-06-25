package Carrinho;

public class Carrinho {
	private int     qtdMaxima;
	private int     quantidade = 0;
	private int     inseridos = 0;
	private int     removidos = 0;
	private double	precoUnitario;
	
	public Carrinho (int qtdMaxima, double precoUnitario) {
		this.qtdMaxima = qtdMaxima;
		this.precoUnitario = precoUnitario;
	}
	public void printCarrinho() {
		System.out.println("  - Qtd. máxima de itens no carrinho = " + qtdMaxima);
		System.out.printf ("  - Preço unitário de cada item      = R$ %.2f\n", precoUnitario);
	}

	public void inserir	() {
		assert	(quantidade < qtdMaxima ): String.format("Inclusão: carrinho cheio, já com %d itens.\n", quantidade); //PRE CONDICAO
		quantidade++;
		inseridos++;
		assert (quantidade == inseridos - removidos ); // INVARIANTE
	}
	public void remover()
	{
		assert quantidade > 0 : "Remoção: carrinho vazio, não é possível retirar mais itens."; // PRE CONDICAO
		quantidade--;
		removidos++;
		assert quantidade == inseridos - removidos : "quantidade != inseridos - removidos"; // INVARIANTE
	}
	public int getQuantidade ()	{
		return quantidade;
	}
	public double totalizar (double precoMaximo) {
		double precoTotal = precoUnitario * quantidade;
		assert (precoTotal <= precoMaximo ) : String.format("Valor insuficiente: R$%.2f para gastar foi ultrapassado\n", precoMaximo); // POS CONDICAO
		return precoTotal;
	}
}