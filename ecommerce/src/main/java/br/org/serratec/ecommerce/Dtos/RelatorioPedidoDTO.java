package br.org.serratec.ecommerce.Dtos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RelatorioPedidoDTO {

	private Integer idPedido;
    private LocalDate dataPedido;
    private BigDecimal valorTotal;
    private List<ItemRelatorioDTO> itens;
	
    
    public Integer getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}
	public LocalDate getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public List<ItemRelatorioDTO> getItens() {
		return itens;
	}
	public void setItens(List<ItemRelatorioDTO> itens) {
		this.itens = itens;
	}
	
	@Override
	public String toString() {
		return "RelatorioPedidoDTO [idPedido=" + idPedido + ", dataPedido=" + dataPedido + ", valorTotal=" + valorTotal
				+ ", itens=" + itens + "]";
	}
	
	
    
}
