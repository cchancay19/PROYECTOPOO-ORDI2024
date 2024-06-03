public class PedidoLocalPVenta {

        // Atributos privados
        private int idPedidoLocal;
        private int id_Proveedor;
        private String rucProveedor;
        private String nombreProveedor;
        private String emailProveedor;
        private int telefonoProveedor;

        // Atributos públicos
        public int idLocal_Pedido;
        public int idTransportistaAsig;

        // Constructor
        public PedidoLocalPVenta(int idPedidoLocal, int idLocal_Pedido, int idTransportistaAsig, int id_Proveedor, String rucProveedor, String nombreProveedor, String emailProveedor, int telefonoProveedor) {
            this.idPedidoLocal = idPedidoLocal;
            this.idLocal_Pedido = idLocal_Pedido;
            this.idTransportistaAsig = idTransportistaAsig;
            this.id_Proveedor = id_Proveedor;
            this.rucProveedor = rucProveedor;
            this.nombreProveedor = nombreProveedor;
            this.emailProveedor = emailProveedor;
            this.telefonoProveedor = telefonoProveedor;
        }

        // Métodos públicos
        public void ingresarNumOrden() {
            // Lógica para ingresar el número de orden
            System.out.println("Ingresar número de orden");
        }

        public void editarOrden() {
            // Lógica para editar la orden
            System.out.println("Editar orden");
        }

        public void obtenerOrdenIngres() {
            // Lógica para obtener la orden ingresada
            System.out.println("Obtener orden ingresada");
        }

        public void estadoOrden() {
            // Lógica para obtener el estado de la orden
            System.out.println("Estado de la orden");
        }

        // Getters y Setters para los atributos privados
        public int getIdPedidoLocal() {
            return idPedidoLocal;
        }

        public void setIdPedidoLocal(int idPedidoLocal) {
            this.idPedidoLocal = idPedidoLocal;
        }

        public int getId_Proveedor() {
            return id_Proveedor;
        }

        public void setId_Proveedor(int id_Proveedor) {
            this.id_Proveedor = id_Proveedor;
        }

        public String getRucProveedor() {
            return rucProveedor;
        }

        public void setRucProveedor(String rucProveedor) {
            this.rucProveedor = rucProveedor;
        }

        public String getNombreProveedor() {
            return nombreProveedor;
        }

        public void setNombreProveedor(String nombreProveedor) {
            this.nombreProveedor = nombreProveedor;
        }

        public String getEmailProveedor() {
            return emailProveedor;
        }

        public void setEmailProveedor(String emailProveedor) {
            this.emailProveedor = emailProveedor;
        }

        public int getTelefonoProveedor() {
            return telefonoProveedor;
        }

        public void setTelefonoProveedor(int telefonoProveedor) {
            this.telefonoProveedor = telefonoProveedor;
        }
}
