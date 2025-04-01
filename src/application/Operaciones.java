package application;

public class Operaciones {

	private int n1,n2;

	public Operaciones(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public int getN1() {
		return n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}
	
	public int restar() {
		return n1-n2;
	}
	
	public int multiplicar() {
		return n1*n2;
	}
	
	public int dividir() {
		return n1/n2;
	}
	
	public int sumar() {
		return n1+n2;
	}
	
	
	
}
