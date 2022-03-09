package com.devpovoa.Facade;

import Subsistema.cep.CepApi;
import Subsistema.crm.CrmService;

public class Facade {
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);

		CrmService.gravar(nome, cep, estado, cidade);
	}
}
