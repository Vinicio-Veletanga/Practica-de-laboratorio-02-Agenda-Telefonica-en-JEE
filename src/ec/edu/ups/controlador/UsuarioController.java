/**
 * 
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Usuario;

/**
 * @author ADMINX
 *
 */
public class UsuarioController implements UsuarioInterface{
	

	@Override
	public void crearCuenta() {
		
	}
	@Override
	public void actualizar(Usuario usuario) {
		
	}
	@Override
	public Boolean eliminarCuenta(String cedula) {
		Boolean valor = true;
		return valor;
		
	}
	@Override
	public Usuario buscarCuenta(String cedula) {
		Usuario usu= new Usuario();
		return usu;
	}
	
}
