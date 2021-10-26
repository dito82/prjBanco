package util;

public class ContaBancaria {
	private int numConta;
	private String nomeCliente;
	private double saldo;

	public ContaBancaria(int numConta, String nomeCliente) {
		this.numConta = numConta;
		this.nomeCliente = nomeCliente;
	}

	public ContaBancaria(int numConta, String nomeCliente, double depositoInicial) {
		this.numConta = numConta;
		this.nomeCliente = nomeCliente;
		deposito(depositoInicial);
	}

	public int getNumConta() {
		return numConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double quantia) {
		saldo += quantia;
	}
	
	public void saque(double quantia) {
		saldo -= quantia + 5.00;
	}
	
	public String toString() {
		return "Conta: " 
				+ numConta 
				+ " - Cliente: " 
				+ nomeCliente 
				+ " - Saldo: " 
				+ String.format("%.2f", saldo);		
	}

}
