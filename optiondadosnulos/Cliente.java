package optiondadosnulos;

public class Cliente {

	private String nome; //nome = null não gela o erro na Exception 

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
