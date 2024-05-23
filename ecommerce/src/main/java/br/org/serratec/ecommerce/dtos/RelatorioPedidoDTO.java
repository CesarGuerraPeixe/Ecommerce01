package br.org.serratec.ecommerce.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class RelatorioPedidoDto {

	private Integer idPedido;
    private LocalDate dataPedido;
    private BigDecimal valorTotal;
    public boolean status;
    private List<ItemRelatorioDto> itens;
	
    
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
	public List<ItemRelatorioDto> getItens() {
		return itens;
	}
	public void setItens(List<ItemRelatorioDto> itens) {
		this.itens = itens;
	}
	
	
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "RelatorioPedidoDTO [idPedido=" + idPedido + ", dataPedido=" + dataPedido + ", valorTotal=" + valorTotal
				+ ", itens=" + itens + "]";
	}
	
	
    
}
