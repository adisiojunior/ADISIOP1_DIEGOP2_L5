package hotel;

public class Hotel {

	private Recepcao recepcao;

	public Hotel(){
		this.recepcao = new Recepcao();
	}

	// metodo checkin
	public void checkIn(String nome, String tipo, int idade, int dias, double valor)throws Exception{
		recepcao.checkIn(nome, tipo, idade, dias, valor);
	}

	public void checkOut(String nome){
		recepcao.chekOut(nome);
	}

	// Retorna numero de hospede feito em recepao
	public int getNumDeHospedes(){
		return recepcao.getNumDeHospedes();
	}

	// Retorna o lucro feito em recepao
	public double getLucroTotal(){
		return recepcao.getLucroTotal();
	}


	// Sobrescrevendo hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((recepcao == null) ? 0 : recepcao.hashCode());
		return result;
	}

	// Sobrescrevendo equals
	@Override
	public boolean equals(Object objeto) {
		if(objeto instanceof Hotel){
			Hotel outroHotel = (Hotel) objeto;
			if(outroHotel.recepcao.equals(this.recepcao)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}

	// Sobrescrevendo toString
	@Override
	public String toString(){
		return recepcao.toString();
	}
}


