package br.org.serratec.ecommerce.Dtos;

import java.math.BigDecimal;

public class ItemRelatorioDTO {

	private String codigoProduto;
    private String nomeProduto;
    private BigDecimal precoVenda;
    private Integer quantidade;
    private BigDecimal valorBruto;
    private BigDecimal percentualDesconto;
    private BigDecimal valorLiquido;
	
    
    public String getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public BigDecimal getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(BigDecimal precoVenda) {
		this.precoVenda = precoVenda;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValorBruto() {
		return valorBruto;
	}
	public void setValorBruto(BigDecimal valorBruto) {
		this.valorBruto = valorBruto;
	}
	public BigDecimal getPercentualDesconto() {
		return percentualDesconto;
	}
	public void setPercentualDesconto(BigDecimal percentualDesconto) {
		this.percentualDesconto = percentualDesconto;
	}
	public BigDecimal getValorLiquido() {
		return valorLiquido;
	}
	public void setValorLiquido(BigDecimal valorLiquido) {
		this.valorLiquido = valorLiquido;
	}
	@Override
	public String toString() {
		return "ItemRelatorioDTO [codigoProduto=" + codigoProduto + ", nomeProduto=" + nomeProduto + ", precoVenda="
				+ precoVenda + ", quantidade=" + quantidade + ", valorBruto=" + valorBruto + ", percentualDesconto="
				+ percentualDesconto + ", valorLiquido=" + valorLiquido + "]";
	}

    // getters e setters
    
    
	
	
}
