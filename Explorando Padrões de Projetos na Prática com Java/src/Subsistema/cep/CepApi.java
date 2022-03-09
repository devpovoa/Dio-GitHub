package Subsistema.cep;

public class CepApi {

	private static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getInstancia() {
		return instancia;
	}

	public String recuperCidade(String cep) {
		return "Itaboraí";
	}

	public String recuperarEstado(String cep) {
		return "RJ";
	}
}
