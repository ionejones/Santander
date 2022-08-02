package dio.Santander;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SantanderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SantanderApplication.class, args);
		
		Banco banco1 = new Banco();
		banco1.setNome("Santander");
		
		Conta contaCorrente = new ContaCorrente();
		contaCorrente.depositar(22000.00);	
		
		Cliente cliente = new Cliente();
		cliente.setCpf("12344455577");
		cliente.setNome("Maria Amelia Moura");
		contaCorrente.setCli(cliente);
		banco1.setConta(contaCorrente);
		
		
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.depositar(50000.00);
		contaPoupanca.setCli(cliente);
		
		contaCorrente.transferir(500.00, contaPoupanca);
		
		Conta contaCorrente1 = new ContaCorrente( );
		Cliente cliente1 = new Cliente();
		cliente1.setCpf("12344455577");
		cliente1.setNome("Maria Amelia Moura");
		contaCorrente1.setCli(cliente1);
		banco1.setConta(contaCorrente1);
		
		
		Conta contaCorrente2 = new ContaCorrente( );
		Cliente cliente2 = new Cliente();
		cliente2.setCpf("55555555555");
		cliente2.setNome("João Ubaldo Ribeiro");
		contaCorrente2.setCli(cliente2);
		banco1.setConta(contaCorrente2);
		
		Conta contaCorrente3 = new ContaCorrente();
		Cliente cliente3 = new Cliente();
		cliente3.setCpf("77777777777");
		cliente3.setNome( "Jorge Amado");
		contaCorrente3.setCli(cliente3);
		banco1.setConta(contaCorrente3);
		
		
		 ArrayList<Cliente> listaCli = banco1.listarClientes();
		 
		System.out.println("********************   Clientes do banco "+banco1.getNome());
		for (int i=1; i < listaCli.size() ; i++) {
		   System.out.println(listaCli.get(i).getNome() );
	    }
		System.out.println(" ");


		
		contaCorrente.imprimirDadosConta();		
		contaPoupanca.imprimirDadosConta();
		

	}

}
