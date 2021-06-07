package confirma.noitificacao;

import confirma.domain.Cliente;
import confirma.domain.Produto;

public class EmissaoNotaFiscal {

	private Notificador notificador;
	
	public void emitir(Cliente cliente, Produto produto) {
		// TODO emite a nota fiscal aqui...

		notificador.notificar(cliente, "Nota fiscal " + produto.getNome() + "Disponível");
		
	}
}
