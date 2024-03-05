package conta.model;

public class Conta {
	//Atributos
	private int numero, agencia, tipo;
	private String titular;
	private float saldo; 
	
	//Método construtor - auxilia na criação de um objeto da Classe
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		
		//this(esta)- define o que é parametro e o que é atributo 
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	//Método de Acesso (GET - pegar, buscar / SET - atualizar)
	//Get está retornando o Atributo Número
	public int getNumero() {
		return this.numero;
	}
	
	//Set 
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	//Métodos / Ações 
	
	//Método Sacar 
	public boolean sacar(float valor) {
		if(this.getSaldo() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	//Método depositar 
	public void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	//Método Visualizar 
	public void visualizar() {
		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "Conta Corrente";
			break;
		case 2:
			tipo = "Conta Poupança";
			break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("***********************************************************");
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);
		
	}
	
	
	
	
}
