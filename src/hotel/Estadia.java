package hotel;


public class Estadia {
	private Animal animal;
	private double valor;
	private int dias;

	public Estadia(String nome, String tipo, int idade, int dias, double valor){

		this.animal = new Animal(nome, tipo, idade);
		this.dias = dias;
		this.valor = valor;
	}

	public void setNome(String novoNome) {

		animal.setNome(novoNome);
	}

	public String getNome() {

		return animal.getNome();
	}

	public void setTipo(String novoTipo) {

		animal.setTipo(novoTipo);
	}

	public String getTipo() {

		return animal.getTipo();
	}

	public void setIdade(int novaIdade) {

		animal.setIdade(novaIdade);
	}

	public int getIdade() {

		return animal.getIdade();
	}

	public void setDias(int novaQntdDias) {

		this.dias = novaQntdDias;
	}

	public int getDias() {

		return this.dias;
	}

	public void setValor(double novoValor) {

		this.valor = novoValor;
	}

	public double getValor() {

		return this.valor;
	}

	@Override
	public String toString() {
		return getNome() + ", " + getTipo() + ", " + getDias() + " dias com o preco de R$ " + getValor();
	}




}
