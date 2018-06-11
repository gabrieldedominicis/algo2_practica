package algo2_practica.practica6;
import java.util.List;
import java.util.ArrayList;
public class empresa {

	private String nombre;
	private List<bien> bienes;
	private Empresa instancia= null;
	
	private empresa() {
		nombre = "Empresa unica";
		bienes = new ArrayList<>();
	}
	
	public static Empresa getInstancia() {
		if (instancia == null) {
			instancia = new empresa();
		}
		
		return instancia;
	}
	
	public static void notificartransferencia (Titular titular, int Codigo) throws  {
		///SendMail(tutykar.
		System.out.PrintIn("Se envía un mail a"," + titular.nombre)
	}
	
	public static void main(String[] args) {
		Empresa empresa;
		Empresa empresa2;
		
		empresa = Empresa.getInstancia();
		empresa2 = Empresa.getInstancia();
		System.out.println("Instancia Empresa:" + empresa);
		
	}
	
	public void quitarBien(Bien b) throws BienInexistenteException{
		boolean encontrado = False;
		if(! bienes.remove(b)) {
			throw new BienInexistenteExcpetion();
		}
	}
	
	public void agregarBien (Bien b) throws BienExistenteException{
		for(bien x : bienes) {
			if (x.equals(b)) {
				throw new BienExistenteException;
			}
		}
	}
}
