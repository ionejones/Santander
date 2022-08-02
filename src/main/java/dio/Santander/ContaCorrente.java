package dio.Santander;

public class ContaCorrente extends Conta {


	public void imprimirDadosConta () {
		System.out.println("Extrato da Conta-corrente");
		super.imprimeDadosComuns();
	}

}
