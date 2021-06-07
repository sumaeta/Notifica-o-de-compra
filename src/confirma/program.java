package confirma;

import confirma.domain.Cliente;
import confirma.noitificacao.AtivacaoClienteService;
import confirma.noitificacao.Notificador;
import confirma.notificacao.NotificadorSMS;

public class program {

	public static void main(String[] args) {
		Cliente joao = new Cliente("João", "hoao@mak", "97878");
		Cliente ma = new Cliente("ma", "hoa@mak", "161516");
		
		Notificador notificador = new NotificadorSMS();

		
		AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
		ativacaoCliente.ativar(joao);
		ativacaoCliente.ativar(ma);
	}

}
	
