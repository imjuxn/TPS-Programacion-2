/**
 *
 * @author Nilus
 */

public class PayPal implements PagoConDescuento {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado con PayPal: $" + monto);
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.95; // 5% de descuento
    }
}
