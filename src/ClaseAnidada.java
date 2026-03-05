
// Inicio clase anidada
public class ClaseAnidada {
    /**
	 * 
	 */
	private final VentanaDepart ClaseAnidada;

	/**
	 * @param ventanaDepart
	 */
	ClaseAnidada(VentanaDepart ventanaDepart) {
		ClaseAnidada = ventanaDepart;
	}

	void entrada() {
        System.out.println("Método de entrada. ");
    }

    String salida(int d) {
        System.out.println("Salida. ");
        return ("Salida el " + d);
    }
}
// fin clase anidada