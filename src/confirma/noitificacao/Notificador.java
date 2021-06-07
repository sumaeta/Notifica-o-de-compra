package confirma.noitificacao;

import confirma.domain.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);
}
