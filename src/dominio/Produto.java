package dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Produto implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer codProduto;
	private String nomeProduto;
	private BigDecimal preco; 
	
	private List<Item> itens;
	private List<PromocaoProduto> promocaoProdutos;
	
	public Produto(){
		this.itens = new ArrayList<Item>();
		this.promocaoProdutos = new ArrayList<PromocaoProduto>();
		
	}

	public Produto(Integer codProduto, String nomeProduto, BigDecimal preco) {
		super();
		this.codProduto = codProduto;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.itens = new ArrayList<Item>();
		this.promocaoProdutos = new ArrayList<PromocaoProduto>();
	}

	public Integer getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public List<PromocaoProduto> getPromocaoProdutos() {
		return promocaoProdutos;
	}

	public void setPromocaoProdutos(List<PromocaoProduto> promocaoProdutos) {
		this.promocaoProdutos = promocaoProdutos;
	}
	
	public void addItem(Item x){
		this.itens.add(x);
	}
		
	public void removeItem(Item x){
		this.itens.remove(x);
	}
	
	public void addPromocaoProduto(PromocaoProduto x){
		this.promocaoProdutos.add(x);
	}
		
	public void removePromocaoProduto(PromocaoProduto x){
		this.promocaoProdutos.remove(x);
	}

	@Override
	public String toString() {
		return "Produto [codProduto=" + codProduto + ", nomeProduto="
				+ nomeProduto + ", preco=" + preco + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codProduto == null) ? 0 : codProduto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codProduto == null) {
			if (other.codProduto != null)
				return false;
		} else if (!codProduto.equals(other.codProduto))
			return false;
		return true;
	}
	
	//METODO PRECO COM DESCONTO - CALCULA O DESCONTO DO PRODUTO 
	
	public BigDecimal precoComDesconto(){
		BigDecimal prodComDesconto = new BigDecimal ("0.00");
		
		for(int i=0; i < promocaoProdutos.size(); i++){
			prodComDesconto = promocaoProdutos.get(i).getDesconto().subtract(preco);
		}
		return prodComDesconto;
	}
}