package kawanpeter.com.github.agenda.classes;

public class Empresa {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Nome empresa: " + getNome() + "\n";
	}
}
