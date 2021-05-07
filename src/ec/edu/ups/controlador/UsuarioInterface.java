package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Usuario;

public interface UsuarioInterface {
	public void crearCuenta();
	public void actualizar(Usuario usuario);
	public Boolean eliminarCuenta(String cedula);
	public Usuario buscarCuenta(String cedula);
}
