package kawanpeter.com.github.agenda.classes;

import java.util.ArrayList;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	
	// pode ter varios contatos
	
	private ArrayList<Contato> contatos = new ArrayList<>();
	
	public Pessoa(String nome) {
		setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public ArrayList<Contato> getContatos() {
		return contatos;
	}
	//adiciona uma lista de contatos
	public void setContatos(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}
	//adiciona um único contato
	public void setContato(Contato contato) {
		this.contatos.add(contato);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Nome: " + getNome() + "\n");
		sb.append("Sobrenome: " + getSobrenome() + "\n");
		
		contatos.forEach(contato -> sb.append(contato));
//		for (int i = 0; i < contatos.size(); i++) {
//			sb.append(contatos.get(i).toString());
//		}
		
		return sb.toString();
	}
		
}
