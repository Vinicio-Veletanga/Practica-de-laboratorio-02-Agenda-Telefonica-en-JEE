/**
 * 
 */
package ec.edu.ups.modelo;

import java.io.Serializable;

/**
 * @author ADMINX
 *
 */
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	private String cedula;
	private String nombre;
	private String apellido;
	private String correo;
	private String contra; 
	
	
	public Usuario() {
		
	}

	
	
	public Usuario(String cedula, String nombre,String apellido, String correo, String contra ) {
		this.setCedula(cedula);
		this.setNombre(nombre);
		this.setApellido(apellido); 
		this.setCorreo(correo);
		this.setContra(contra); 
	}

 


	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}
	
	
	
	
	
	
}
