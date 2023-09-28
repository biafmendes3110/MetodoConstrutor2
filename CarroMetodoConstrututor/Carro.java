package CarroMetodoConstrututor;

public class Carro {
	String placa;
	int numChassi;

	public Carro () {
	}
	public Carro(String placa, int numChassi) {
		this.placa=placa;
		this.numChassi=numChassi;

	}

	public String getPlaca() {
		return placa;
	}
	public void setPlaca (String placa) {
		this.placa = placa;
	}
	public int getNumChassi() {
		return numChassi;
	}
	public void setNumChassi(int numChassi) {
		this.numChassi = numChassi;
	}
}
