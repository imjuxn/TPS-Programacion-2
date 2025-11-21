/**
 *
 * @author Nilus
 */
// Clase Cliente
public class Cliente implements Notificable {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void notificarCambioEstado(String estado) {
        System.out.println("Cliente " + nombre + " ha sido notificado del cambio de estado: " + estado);
    }
}
