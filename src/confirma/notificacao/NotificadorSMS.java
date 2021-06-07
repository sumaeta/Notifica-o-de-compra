package confirma.notificacao;

import confirma.domain.Cliente;
import confirma.noitificacao.Notificador;

public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s atraves do SMS %s: %s\n", 
				cliente.getNome(),
				cliente.getTelefone(),
				mensagem);
	}
		
}
