package classes;
public interface ClienteDAO {
	
	public String nomeCliente(String nome);
	
	boolean cadastrarCliente(String nome, String apelido);

	boolean excluirCliente(String nome);
	
	Boolean excluirCliente(String nome, String apelido);
}
