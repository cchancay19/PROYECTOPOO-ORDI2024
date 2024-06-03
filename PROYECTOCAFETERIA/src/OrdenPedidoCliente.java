import java.util.Date;

public class OrdenPedidoCliente {
    // Atributos privados
    private int idOrdenPedido;
    private double precioOrdenPed;
    private String metodoPago;
    private int idEmpleado_Atencion;
    private String itemProduct_Orden;
    private String especificacionPed;
    private String estadoOrden;

    // Atributos públicos
    public Date fechaPedido;

    // Constructor
    public OrdenPedidoCliente(int idOrdenPedido, Date fechaPedido, double precioOrdenPed, String metodoPago, int idEmpleado_Atencion, String itemProduct_Orden, String especificacionPed, String estadoOrden) {
        this.idOrdenPedido = idOrdenPedido;
        this.fechaPedido = fechaPedido;
        this.precioOrdenPed = precioOrdenPed;
        this.metodoPago = metodoPago;
        this.idEmpleado_Atencion = idEmpleado_Atencion;
        this.itemProduct_Orden = itemProduct_Orden;
        this.especificacionPed = especificacionPed;
        this.estadoOrden = estadoOrden;
    }

    // Métodos públicos
    public void agregarOrden() {
        // Lógica para agregar una orden
        this.idOrdenPedido=idOrdenPedido;
        this.itemProduct_Orden=itemProduct_Orden;
        this.especificacionPed=especificacionPed;
        System.out.println("Agregar orden: "+idOrdenPedido +": "+ itemProduct_Orden+" "+especificacionPed);
    }

    public void eliminarOrden() {
        // Lógica para eliminar una orden
        System.out.println("Eliminar orden");
    }

    public void seleccionarMetPago() {
        // Lógica para seleccionar el método de pago
        this.metodoPago=metodoPago;
        System.out.println("Su método de pago es: "+metodoPago);
    }

    public void realizarPago() {
        // Lógica para realizar el pago
        this.precioOrdenPed=precioOrdenPed;
        System.out.println("Su valor a cancelar es "+precioOrdenPed);
    }

    // Getters y Setters para los atributos privados
    public int getIdOrdenPedido() {
        return idOrdenPedido;
    }

    public void setIdOrdenPedido(int idOrdenPedido) {
        this.idOrdenPedido = idOrdenPedido;
    }

    public double getPrecioOrdenPed() {
        return precioOrdenPed;
    }

    public void setPrecioOrdenPed(double precioOrdenPed) {
        this.precioOrdenPed = precioOrdenPed;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public int getIdEmpleado_Atencion() {
        return idEmpleado_Atencion;
    }

    public void setIdEmpleado_Atencion(int idEmpleado_Atencion) {
        this.idEmpleado_Atencion = idEmpleado_Atencion;
    }

    public String getItemProduct_Orden() {
        return itemProduct_Orden;
    }

    public void setItemProduct_Orden(String itemProduct_Orden) {
        this.itemProduct_Orden = itemProduct_Orden;
    }

    public String getEspecificacionPed() {
        return especificacionPed;
    }

    public void setEspecificacionPed(String especificacionPed) {
        this.especificacionPed = especificacionPed;
    }

    public String getEstadoOrden() {
        return estadoOrden;
    }

    public void setEstadoOrden(String estadoOrden) {
        this.estadoOrden = estadoOrden;
    }
}