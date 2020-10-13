package classes;

public class ClienteOracleImpl implements ClienteDAO{

	
	@Override
	public String nomeCliente(String nome) {
		return nome;
	}

	@Override
	public boolean cadastrarCliente(String nome, String apelido) {
		System.out.println("Cliente cadastrado com sucesso := " + nome + " Apelido:= " + apelido);
		return true;
	}

	@Override
	public boolean excluirCliente(String nome) {
		System.out.println("Cliente excluído com sucesso := " + nome);
		return true;
	}

	@Override
	public Boolean excluirCliente(String nome, String apelido) {
		System.out.println("Cliente excluído com sucesso := " + nome + " Apelido:= " + apelido);
		return true;
	}

	public void metodoCustomizadoOracle() {
		System.out.println(1);
	}
}
