package Exercicio_03;

public class Fatura {

	private String numero;
	private String descricao;
	private int quantidadeVendida;
	private double preco;

	public Fatura(String numero, String descricao, int quantidadeVendida, double preco) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidadeVendida = quantidadeVendida;
		this.preco = preco;
	
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setQuantidadeVendida(int quantidadeVendida) {
		this.quantidadeVendida = quantidadeVendida;
	}
	
	public int getQuantidadeVendida() {
		return quantidadeVendida;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		if(preco < 0) {
			return 0.0;
		}
		return preco;
	}
	
	public double getTotalFatura() {
		
		double valorProduto = getPreco();
		int quantidade = getQuantidadeVendida();
		double totalFatura = valorProduto * quantidade;
		
		if(totalFatura < 0) {
		 totalFatura = 0.0;	
		}
	
		System.out.println("Total da fatura: " + totalFatura);
		return totalFatura;

	}
}
