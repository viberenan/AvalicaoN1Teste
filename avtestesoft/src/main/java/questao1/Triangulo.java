package questao1;

public class Triangulo {

	private int x;
	private int y;
	private int z;

	public Triangulo(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public boolean trianguloValido() {
		if ((x < y + z) && (y < x + z) && (z < x + y)) {
			return true;
		}
		return false;
	}

	public boolean equilatero() {
		if ((x == y && x == z) && this.trianguloValido()) {
			return true;
		}
		return false;
	}

	public boolean isosceles() {
		if (((x == y) || (x == z)) && this.trianguloValido()) {
			return true;
		}
		return false;
	}
	
	public boolean escaleno() {
		if((x!= y && x!= z && y!=z) && this.trianguloValido()) {
			return true;
		}
		return false;
	}

}
