package desafio_files;

public class Produto {
	private String nome;
	private Double precoUnitario;
	private Integer quantidade;
	
	public Produto() {
	}
		
	public Produto(String nome, Double precoUnitario, Integer quantidade) {
		super();
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco_unitario() {
		return precoUnitario;
	}
	public void setPreco_unitario(Double preco_unitario) {
		this.precoUnitario = preco_unitario;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public double total() {
		return this.quantidade * this.precoUnitario;
	}
	
}
