package dominio;

import java.io.Serializable;

public class Endereco implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer codEndereco;
	private String rua;
	private Integer numero;
	private String bairro;
	private String complemento;
	
	private Cliente cliente;
	
	public Endereco(){
	
	}

	public Endereco(Integer codEndereco, String rua, Integer numero,
			String bairro, String complemento, Cliente cliente) {
		super();
		this.codEndereco = codEndereco;
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cliente = cliente;
	}

	public Integer getCodEndereco() {
		return codEndereco;
	}

	public void setCodEndereco(Integer codEndereco) {
		this.codEndereco = codEndereco;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Endereco [codEndereco=" + codEndereco + ", rua=" + rua
				+ ", numero=" + numero + ", bairro=" + bairro
				+ ", complemento=" + complemento + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codEndereco == null) ? 0 : codEndereco.hashCode());
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
		Endereco other = (Endereco) obj;
		if (codEndereco == null) {
			if (other.codEndereco != null)
				return false;
		} else if (!codEndereco.equals(other.codEndereco))
			return false;
		return true;
	}
	
	

}
