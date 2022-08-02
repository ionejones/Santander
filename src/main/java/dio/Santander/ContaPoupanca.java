package dio.Santander;

public class ContaPoupanca extends Conta {
	public void imprimirDadosConta () {
		System.out.println("Extrato da Conta-poupança");
		super.imprimeDadosComuns();
	}

}
