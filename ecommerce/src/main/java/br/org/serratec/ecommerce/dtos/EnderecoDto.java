package br.org.serratec.ecommerce.dtos;

public class EnderecoDto {
	
	 private String cep;
	    private String numero;
	    private String complemento;

	    // Getters e setters
	    public String getCep() {
	        return cep;
	    }

	    public void setCep(String cep) {
	        this.cep = cep;
	    }

	    public String getNumero() {
	        return numero;
	    }

	    public void setNumero(String numero) {
	        this.numero = numero;
	    }

	    public String getComplemento() {
	        return complemento;
	    }

	    public void setComplemento(String complemento) {
	        this.complemento = complemento;
	    }

}
