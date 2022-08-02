package dio.Santander;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Banco {
	private String nome;
	
	//  novo:
	private ArrayList<Conta> contas;

	    public Banco() {
	        contas = new ArrayList<Conta>();
	    }
	    
	    public void setConta(Conta conta) {
	        contas.add(conta);
	    }

	
	    public ArrayList<Cliente> listarClientes(){
	        ArrayList<Cliente> clientes = new ArrayList();
	        for(Conta conta : contas){
	        
	            clientes.add(conta.getCli());
	        }
	        return clientes;
	    }

}
