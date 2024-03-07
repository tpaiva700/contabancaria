package conta.model;

public class ContaCorrente extends Conta {
	
	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		//Método Super
		super(numero, agencia, tipo, titular, saldo);
		
		this.limite = limite;
	}

	//Métodos de Acesso 
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	//Métodos específicos
	
	@Override
	//Sobreescrita do método visualizar - reutilizando o método da Class principal Conta e melhorando ele para aparecer o que eu quero, no caso limite;
	public void visualizar(){
		//Palavra reservada super
		super.visualizar();                       	
		System.out.println("Limite de Crédito: " + this.limite);
	}
	
	//Sacar
	@Override
	public boolean sacar(float valor) {
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	
}
