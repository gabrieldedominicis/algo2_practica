package algo2_practica.practica6;

public abstract class bien {
	protected Titular titular;
	protected float valorMercado;
	protected float valorFiscal;
	protected int codigo;
	protected static int proximocodigo = 0;
	
	
	public Bien() {
		codigo = proximocodigo;
		proximocodigo++;
	}
	
	public Bien(Titular titular) {
		this();
		this.titular = titular;
	}
	
	public void setValorMercado(float valor) throws ValroMercadoInvalidoException {
			if (valor < 0 )
			{
				throw new ValorMercadoInvalidoException;
			}
			valorMercado = valor;
	}
	
	public void setValorFiscal(float valor) throws ValorFiscalInvalidoException {
		if (valor < 0 )
		{
			throw new ValorFiscalInvalidoException;
		}
		valorMercado = valor;
	}
	
	@Override
	public void transferir(Titular nuevoTItular) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public float calcularImpuesto() {
		return alicuota*valorFiscal;
	}
	
	public void transferir(Titular nuevoTitular) throws TransferenciaInvalidaException{
		if(Titular.equals(nuevoTitular)) {
			throw new TransferenciaInvalidaException;
		}
		titular = nuevoTitular;
		try {
			empresa.notificartransferencia(titular, codigo);
		} catch (EmailNotSentException e) {
			System.out.PrintIn("Email no enviado");
		}
	}
	
	@Override
	public void setAlicuota(float prima) throws AlicuotaInvalidaException {
		if (alicuota <= 0) {
			throws new AlicuotaInvalidaException();
		}
		
		this.alicuota = alicuota;
		
	}
	
	@Override
	public void setPrima(float prima) throws PrimaInvalidaException{
		// TODO Auto-generated method stub
		if(prima < 0 || prima > valorMercado) {
			throw new PrimaInvalidaException;
		}
		
		this.prima = prima;
		
	}
	@Override
	public float getPrima() {
		// TODO Auto-generated method stub
		return prima;
	}
	
	@Override
	public float getAlicuota() {
		// TODO Auto-generated method stub
		return alicuota;
	}
	

}