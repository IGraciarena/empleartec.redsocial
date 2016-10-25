package interfaces;
import com.empleartec.redsocial.redsocial.*;

public interface UserServices {
	
	public void agregarAmigo(Datos datos,Usuario amigo);
	public void eliminarAmigo(Datos datos,Usuario eliminar);
	public void modificarCuenta(Datos datos);
	public void login(Datos datos);
	public void logout(Datos datos);
	public void registrar(Datos datos);
	public void buscarUsuario(Datos datos);
	public void publicar(Datos datos);
	public void eliminar(Datos datos);
	public void seguir(Datos datos);
	public void dejarSeguir(Datos datos);
}
