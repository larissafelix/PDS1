package dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Item implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer codItem;
	private Integer qtd;
	private BigDecimal preco;
	
	private Pedido pedido;
	private Produto produto;
	
	
	public Item(){
		
	}

	public Item(Integer codItem, Integer qtd, BigDecimal preco, Pedido pedido, Produto produto) {
		super();
		this.codItem = codItem;
		this.qtd = qtd;
		this.preco = preco;
		this.pedido = pedido;
		this.produto = produto;
	}


	public Integer getCodItem() {
		return codItem;
	}

	public void setCodItem(Integer codItem) {
		this.codItem = codItem;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Item [codItem=" + codItem + ", qtd=" + qtd + ", preco=" + preco + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codItem == null) ? 0 : codItem.hashCode());
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
		Item other = (Item) obj;
		if (codItem == null) {
			if (other.codItem != null)
				return false;
		} else if (!codItem.equals(other.codItem))
			return false;
		return true;
	}
	
	// METODO SUBTOTAL ITEM - MULTIPLICANDO BIGDECIMAL COM INTEIRO
	public BigDecimal subTotal() { 
		BigDecimal totalProd = new BigDecimal("0.00");
		totalProd = produto.getPreco().multiply(BigDecimal.valueOf(this.getQtd().longValue()));
		
		return totalProd;
	}	
	
}
