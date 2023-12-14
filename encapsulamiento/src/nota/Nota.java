package nota;

public class Nota {

	private int valorNota;

	public Nota(int valorNota) {
		setValorNota(valorNota);
	}

	public void setValorNota(int valorNota) {
		if (esNotaValida(valorNota))
			this.valorNota = (valorNota);
	}

	public int getValor() {
		return this.valorNota;
	}

	public boolean aprobado() {
		return this.getValor() >= 4;
	}

	public boolean desaprobado() {
		return !this.aprobado();
	}

	public void recuperar(int nuevoValor) {
		if (esNotaValida(nuevoValor)) {
			if (nuevoValor > this.valorNota)
				this.valorNota = nuevoValor;
		}

	}

	public boolean esNotaValida(int nota) {
		if (nota < 0 || nota > 10)
			throw new Error("La nota ingresadad es invalida!");
		return true;
	}

}
