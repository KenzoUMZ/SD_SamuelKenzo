package br.inatel.labs.labjpa.dto;

import java.math.BigDecimal;



public class TotalCompradoPorFonecedorDTO {

	private String fornecedorRazaoSocial;
	private BigDecimal totalComprado;
	
	
	public TotalCompradoPorFonecedorDTO(String fornecedorRazaoSocial, BigDecimal totalComprado) {
		super();
		this.fornecedorRazaoSocial = fornecedorRazaoSocial;
		this.totalComprado = totalComprado;
	}


	public String getFornecedorRazaoSocial() {
		return fornecedorRazaoSocial;
	}


	public BigDecimal getTotalComprado() {
		return totalComprado;
	}
	
	
	
}
