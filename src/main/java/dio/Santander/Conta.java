package dio.Santander;
//import lombok.Data;
import lombok.Getter;
//import lombok.Setter;
//import lombok.NonNull;


@Getter
public abstract class  Conta implements IConta {
	protected static final int AGENCIA_PADRAO = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cli;

	private static int SEQUENCIAL = 1;
	
	public Conta() {
		agencia = Conta.AGENCIA_PADRAO;
		numero = SEQUENCIAL++;
		
	}	
		
	@Override
	public void sacar(double valor) {
		this.saldo -= valor; 
	};
    
	@Override
	public void depositar(double valor) {
		this.saldo += valor; 

	};
    
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	};
	
	protected void imprimeDadosComuns() {
		System.out.println(this.cli.getNome());
		System.out.println(String.format("Agencia : %d", this.agencia));
		System.out.println(String.format("Numero da conta : %d", this.numero));
		System.out.println(String.format("Saldo : %.2f", this.saldo));
		System.out.println(" ");
	}


	    public void setCli(Cliente cli) {
	        this.cli = cli;
	    }

}
