package hotel;

import java.util.ArrayList;

public class Recepcao {

	private ArrayList<Estadia> estadias;

	// Construtora da classe
	// para inicialização do array list 

	public Recepcao() {

		estadias = new ArrayList<Estadia>();

	}

	// Metodo para fazer chekin

	public void checkIn(String nome, String tipo, int idade, int dias, double valor) throws Exception {

		Estadia novaEstadia = new Estadia(nome, tipo, idade, dias, valor);

		this.estadias.add(novaEstadia);

	}

	// Metodo para fazer chekout
	public void chekOut(String nome) {

		for (int i = 0; i < this.estadias.size(); i++) {

			if(estadias.get(i).getNome().equalsIgnoreCase(nome)) {
				estadias.remove(i);
			}
		}
	}

	// Get para saber a quantidade de hospedes

	public int getNumDeHospedes() {

		return this.estadias.size();
	}

	// get para saber o lucro total 

	public double getLucroTotal() {

		double total = 0.0;

		for(int i = 0; i < this.estadias.size(); i++) {

			total += this.estadias.get(i).getValor();
		}

		return total;

	}


	// Sobrescrevendo hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estadias == null) ? 0 : estadias.hashCode());
		return result;
	}

	// Sobrescrevendo o equals
	@Override
	public boolean equals(Object objeto) {

		if(objeto instanceof Recepcao) {

			Recepcao outraRecepcao = (Recepcao) objeto;

			if(outraRecepcao.getNumDeHospedes() == this.getNumDeHospedes() 
					&& outraRecepcao.getLucroTotal() == this.getLucroTotal()) {
				return true;

			}else {

				return false;
			}

		}else {

			return false;
		}

	}

	// Sobrescrevendo o toString
	@Override
	public String toString() {

		String saida = String.format("Estadias:\n");

		for(int i = 0; i < this.estadias.size(); i++){ 

			Estadia estadia = estadias.get(i);

			saida += String.format("%s (%s): %d dias com o preco de R$ %.2f\n", estadia.getNome(),
					estadia.getTipo(), estadia.getDias(), estadia.getValor());
		}

		return saida;
	}

}



