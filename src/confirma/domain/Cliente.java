package confirma.domain;

public class Cliente {

	private String nome;
	private String email;
	private String telefone;
	private boolean ativo = false;
	
	public Cliente() {
		super();
	}
	
	public Cliente(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}


	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}


	public boolean isAtivo() {
		return ativo;
	}

	public void ativar() {
		this.ativo = true;
	}
	
}
