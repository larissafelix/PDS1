package dominio;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Promocao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer codPromocao;
	private String nomePromocao;
	private Date dataInicio;
	private Date dataFim;

	private List<PromocaoProduto> promocaoProdutos;
	
	public Promocao(){
		this.promocaoProdutos = new ArrayList<PromocaoProduto>();		
	}

	public Promocao(Integer codPromocao, String nomePromocao, Date dataInicio,
			Date dataFim) {
		super();
		this.codPromocao = codPromocao;
		this.nomePromocao = nomePromocao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.promocaoProdutos = new ArrayList<PromocaoProduto>();	
	}


	public Integer getCodPromocao() {
		return codPromocao;
	}

	public void setCodPromocao(Integer codPromocao) {
		this.codPromocao = codPromocao;
	}

	public String getNomePromocao() {
		return nomePromocao;
	}

	public void setNomePromocao(String nomePromocao) {
		this.nomePromocao = nomePromocao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public List<PromocaoProduto> getPromocaoProdutos() {
		return promocaoProdutos;
	}

	public void setPromocaoProdutos(List<PromocaoProduto> promocaoProdutos) {
		this.promocaoProdutos = promocaoProdutos;
	}

	public void addPromocaoProduto(PromocaoProduto x){
		this.promocaoProdutos.add(x);
	}
		
	public void removePromocaoProduto(PromocaoProduto x){
		this.promocaoProdutos.remove(x);
	}

	@Override
	public String toString() {
		return "Promocao [codPromocao=" + codPromocao + ", nomePromocao="
				+ nomePromocao + ", dataInicio=" + dataInicio + ", dataFim="
				+ dataFim + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codPromocao == null) ? 0 : codPromocao.hashCode());
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
		Promocao other = (Promocao) obj;
		if (codPromocao == null) {
			if (other.codPromocao != null)
				return false;
		} else if (!codPromocao.equals(other.codPromocao))
			return false;
		return true;
	}
	
	//ESTE METODO NAO SERA USADO, MAS SERVIRA DE EXEMPLO PARA O PROXIMO DESTA CAMADA
	//METODO DESCONTO POR PERIODO - SOMA TODOS OS DESCONTOS CONCEDIDOS EM DETERMINADO PERIODO E RETORNA A PORCENTAGEM
	/*public double descontoPorPeriodo(Date dataInicial, Date dataFinal){
		double totalDesconto = 0;
		for(int i=0; i<promocaoProdutos.size(); i++){
			totalDesconto = totalDesconto + promocaoProdutos.get(i).getDesconto();
			}
		return (double) totalDesconto * 100.0;
	}*/

}
