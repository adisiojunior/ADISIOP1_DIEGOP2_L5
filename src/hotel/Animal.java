package hotel;

public class Animal {
	private String nome;
	private String tipo;
	private String idade;
	
	public Animal(String nome, String tipo, String idade){
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Animal){
			Animal papagaio = (Animal) obj;
			if(papagaio.getNome().equalsIgnoreCase(this.getNome()) && papagaio.getTipo().equalsIgnoreCase(getTipo()))
			return true;
			}
		return false;
	}
	
	
}
