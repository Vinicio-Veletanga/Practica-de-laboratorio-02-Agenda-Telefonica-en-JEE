/**
 * 
 */
package ec.edu.ups.modelo;

import java.io.Serializable;

/**
 * @author ADMINX
 *
 */
public class Telefono implements Serializable{

	private static final long serialVersionUID = 1L;
	private int codigo;
	private String numero;
	private String tipo;
	private String operadora;
	private String cedula;
	
	public Telefono() {
		
	}
	

	public Telefono(int codigo, String numero, String tipo, String operadora,String cedula) {
		this.setCodigo(codigo);
		this.setNumero(numero);
		this.setTipo(tipo);
		this.setOperadora(operadora);
		this.setCedula(cedula);
	}

	

	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	
	
	
}
