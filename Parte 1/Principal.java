/**
 *
 * @author Nilus
 */
public class Principal {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("Fabian");

        // Crear productos
        Producto p1 = new Producto("Mouse", 3500);
        Producto p2 = new Producto("Teclado", 7200);
        Producto p3 = new Producto("Monitor", 45000);

        // Crear pedido y agregar productos
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);

        // Calcular total sin descuento
        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        // Procesar pago con tarjeta de crédito
        PagoConDescuento tarjeta = new TarjetaCredito();
        double totalConDescuento = tarjeta.aplicarDescuento(total);
        tarjeta.procesarPago(totalConDescuento);

        // Cambiar estado del pedido
        pedido.cambiarEstado("En preparación");
    }
}
