package kawanpeter.com.github.agenda.testes;

import kawanpeter.com.github.agenda.classes.Contato;
import kawanpeter.com.github.agenda.classes.Empresa;
import kawanpeter.com.github.agenda.classes.Endereco;
import kawanpeter.com.github.agenda.classes.Pessoa;

public class TesteClasses {

	public static void main(String[] args) {
		
		//criar os valores
		Pessoa pessoa = new Pessoa ("Joao");
		pessoa.setSobrenome("Batista");
		
		Endereco endereco1 = new Endereco();
		endereco1.setRua("Rua Teste");
		endereco1.setCep("12345-00");
		endereco1.setCidade("Curitiba");
		endereco1.setEstado("PR");
		
		Contato contato1 = new Contato();
		contato1.setEndereco(endereco1);
		
		pessoa.setContato(contato1);
		
		Contato contato2= new Contato();
		contato2.setTelefoneCelular("4299887766");
		contato2.setEmail("contato2@teste.com");
		contato2.setDescricao("Segunda contato criado");
		
		Empresa empresa = new Empresa();
		empresa.setNome("unicesumar");
		
		contato2.setEmpresa(empresa);
		
		pessoa.setContato(contato2);
		
		//finalizou a criação dos valores para teste
		
		//recuperar essas informações
				System.out.println(pessoa);		
		
	}

}
