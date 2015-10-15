package dominio;

import java.io.Serializable;
import java.math.BigDecimal;

public class RetiradaEntrega implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer codEntrega;
	private String regiao;
	private BigDecimal valor;
	
	private Pedido pedido;
	
	public RetiradaEntrega(){
		
	}

	public RetiradaEntrega(Integer codEntrega, String regiao, BigDecimal valor) {
		super();
		this.codEntrega = codEntrega;
		this.regiao = regiao;
		this.valor = valor;
		this.pedido = pedido;
	}

	public Integer getCodEntrega() {
		return codEntrega;
	}

	public void setCodEntrega(Integer codEntrega) {
		this.codEntrega = codEntrega;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "RetiradaEntrega [codEntrega=" + codEntrega + ", regiao="
				+ regiao + ", valor=" + valor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codEntrega == null) ? 0 : codEntrega.hashCode());
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
		RetiradaEntrega other = (RetiradaEntrega) obj;
		if (codEntrega == null) {
			if (other.codEntrega != null)
				return false;
		} else if (!codEntrega.equals(other.codEntrega))
			return false;
		return true;
	}
	
	//METODO PEDIDOS POR REGIAO - RETORNA QUANTOS PEDIDOS FORAM FEITOS PARA UMA DETERMINADA REGIAO
	/*public Integer pedidosPorRegiao(){
		int cont = 0;
		if(this.getPedido().getRegiao{
			
			
		}
	}*/
	
	
}
