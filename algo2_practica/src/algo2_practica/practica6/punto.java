package algo2_practica.practica6;


public class punto {
	protected float x;
	protected float y;

	
public punto() {
		x = 0;
		y = 0;
}


public punto(float a, float b) {
		x = a;
		y = b;
}

public float getx() {
	return x;
}

public float gety() {
	return y;

}

public punto sumar(punto uno, punto dos) {
	/**
	 * @param n1 numero 1 a sumar
	 * @param n2 numero 2 a sumar
	 * @return devuelve la hora resultante de la suma de los parametros
	 */
	
	punto suma = new punto();
	
	suma.x = uno.x + dos.x;
	suma.y = uno.y + dos.y;
	
	return suma;
	
}

public boolean igual (punto uno, punto dos) {
	
	if ((uno.x == dos.x) && (uno.y == dos.y)) {
		return true;
	}
	else {
		return false;
	}
	
}

}