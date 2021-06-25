public class Banco {
	// M�todo sacar DELEGA o tratamento de exce��o gen�rica  
       // (ContaCorrenteException), pois n�o far� o seu tratamento
	private static void sacar (ContaCorrente c, double valor) throws   
       ContaCorrenteException {
		c.retirar(valor);
	}

	public static void main(String[] args) {
		ContaCorrente cta = new ContaCorrente(1000);

		try {
			sacar(cta,200);
		} catch (ContaCorrenteException e) {
			System.out.println("Erro: " + e.getMessage());
		}finally { 
			System.out.println("Saldo Conta: R$ " + cta.getSaldo()); 
		}

		try { 
			cta.retirar(2000); 
		} catch (ContaCorrenteException e) {
			System.out.println(e.getMessage()); 
		}finally { System.out.println("Saldo Conta: R$ " +
				cta.getSaldo()); 
		}
	}
}