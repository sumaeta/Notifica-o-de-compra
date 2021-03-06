package confirma.notificacao;

import confirma.domain.Cliente;
import confirma.noitificacao.Notificador;

public class NotificadorEmail implements Notificador{

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s atraves do email %s: %s\n", 
				cliente.getNome(),
				cliente.getEmail(),
				mensagem);
	}
}
