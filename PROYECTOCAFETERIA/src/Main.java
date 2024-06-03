import java.util.Date;

public class Main {
    public static void main(String[] args) {

        OrdenPedidoCliente pedido = new OrdenPedidoCliente(001, new Date(),3.50,"efectivo",
                010,"capuchino","Con azucar morena, sin crema","ENTREGADA") ;
        pedido.agregarOrden();
        pedido.seleccionarMetPago();
        pedido.realizarPago();



    }



}