package aplicacao;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dominio.Atendente;
import dominio.Cliente;
import dominio.Endereco;
import dominio.Item;
import dominio.Pedido;
import dominio.Produto;
import dominio.Promocao;
import dominio.PromocaoProduto;
import dominio.Regiao;

public class Principal {
	
	public static void main(String[] args) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Cliente c1= new Cliente(1,"João da Silva","92347869", null);
		Cliente c2= new Cliente(2, "George Mendes", "88002211", null);
		
		Endereco e1= new Endereco(1,"Rua do Caju", 23,"centro", null,c1);
		Endereco e2= new Endereco(2,"Rua Jardins", 237,"Martins", null,c2);
		
		c1.addEndereco(e1);
		c2.addEndereco(e2);
		
		Atendente a1= new Atendente(1,"Maria");
		Atendente a2= new Atendente(2,"Jose das Couves");
		
		Regiao r1= new Regiao(1,"Sul",new BigDecimal("3.00"));
		Regiao r2= new Regiao(2,"Norte",new BigDecimal("5.00"));
		
		Pedido p1 = new Pedido(1,sdf.parse("02/09/2015"),"Sem cebola",c1,a1, r1);				
		Pedido p2 = new Pedido(2,sdf.parse("05/09/2015"),"Nenhuma",c2,a2,r2);
		c1.addPedido(p1);
		c2.addPedido(p2);
		r1.addPedido(p1);
		r2.addPedido(p2);
		
		Produto prod1 = new Produto(1, "Pizza de calabresa", new BigDecimal("31.90"));
		Produto prod2 = new Produto(2, "Coca-Cola", new BigDecimal("6.00"));
		Produto prod3 = new Produto(3, "Pizza A Moda", new BigDecimal("45.90"));
		Produto prod4 = new Produto(4, "Pizza de quibe", new BigDecimal("39.60"));	
		
		Item i1 = new Item(1, 2, new BigDecimal("21.90"), p1, prod1);
		Item i2 = new Item(2, 1, new BigDecimal("6.00"), p1, prod2);
		Item i3 = new Item(3, 1, new BigDecimal("40.90"), p2, prod3);
		Item i4 = new Item(4, 5, new BigDecimal("32.60"), p2, prod4);
		
		prod1.addItem(i1);
		prod2.addItem(i2);
		prod3.addItem(i3);
		prod4.addItem(i4);
		
		p1.addItem(i1);
		p1.addItem(i2);
		p2.addItem(i3);
		p2.addItem(i4);
		
		Promocao prom1 = new Promocao(1, "Terça Insana",sdf.parse("12/08/2015"),sdf.parse("13/11/2015"));
	    Promocao prom2 = new Promocao(2, "De casa é a melhor", sdf.parse("01/09/2015"), sdf.parse("01/10/2015"));
		
	    PromocaoProduto promP1 = new PromocaoProduto(1, new BigDecimal("10.00"), prod1, prom1);
	   	PromocaoProduto promP3 = new PromocaoProduto(2, new BigDecimal("5.00"), prod3, prom2);
	   	PromocaoProduto promP4 = new PromocaoProduto(3, new BigDecimal("7.00"), prod4, prom1);
		
		prom1.addPromocaoProduto(promP1);
		prom1.addPromocaoProduto(promP4);
		prom2.addPromocaoProduto(promP3);
		
		/*
		// TESTE 1: VALOR TOTAL DE UM PEDIDO	
		System.out.println("Valor Total do pedido: " +p1+":");
		System.out.println(p1.valorTotal());
		
		Date dataInicial = sdf.parse("01/09/2015");
		Date dataFinal = sdf.parse("05/09/2015");
		
		// TESTE 2: LISTA DE PEDIDOS REALIZADOS EM UM DADO INTERVALO DE DATAS
		System.out.println("Pedidos realizados na" +r1+ "entre: "+sdf.format(dataInicial)+" e "+sdf.format(dataFinal)+": ");
		System.out.println(r1.pedidosPorPeriodo(dataInicial, dataFinal));
				
		// TESTE 3: TOTAL DE DESCONTO CONCEDIDO EM UM DADO INTERVALO DE DATAS
		//System.out.println("Desconto concedido entre: "+sdf.format(dataInicial)+" e "+sdf.format(dataFinal)+": ");
		//System.out.println(prom2.descontoPorPeriodo(dataInicial, dataFinal));
		
		// TESTE 4: TOTAL DE VENDAS DE UM ATENDENTE EM UM DADO INTERVALO DE DATAS
		System.out.println("O valor total de vendas do "+a1+" no período de "+sdf.format(dataInicial)+" a "+sdf.format(dataFinal)+" é: ");
		System.out.println(a1.vendasPorPeriodo(sdf.parse("01/09/2015"), sdf.parse("07/09/2015")));
		*/
		
		// TESTE 5: TOTAL DE UM DETERMINADO PRODUTO COM DESCONTO
		System.out.println("O valor total do produto " + prod1 + "com desconto é: ");
		
	}

}
