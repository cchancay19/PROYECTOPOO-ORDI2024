public class Transportista {
    // Atributos privados
    private int idTransportista;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;

    // Atributos públicos
    public int idLocal_EntregaPedido;
    public int idPedido_Entrega;

    // Constructor
    public Transportista(int idTransportista, String nombre, String apellido, String telefono, String correo, int idLocal_EntregaPedido,
                         int idPedido_EntregaC) {
        this.idTransportista = idTransportista;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.idLocal_EntregaPedido = idLocal_EntregaPedido;
        this.idPedido_Entrega=idPedido_EntregaC;
    }

    // Métodos públicos
    public void crearTransportista() {
        // Lógica para crear un transportista
        System.out.println("Crear transportista");
    }

    public void seleccionarTransportista() {
        // Lógica para seleccionar un transportista
        System.out.println("Seleccionar transportista");
    }

    public void eliminarTransportista() {
        // Lógica para eliminar un transportista
        System.out.println("Eliminar transportista");
    }

    public void rutaEntregaPedLocal() {
        // Lógica para la ruta de entrega del pedido local
        System.out.println("Ruta de entrega del pedido local");
    }

    // Getters y Setters para los atributos privados

    public int getIdTransportista() {
        return idTransportista;
    }

    public void setIdTransportista(int idTransportista) {
        this.idTransportista = idTransportista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getIdLocal_EntregaPedido() {
        return idLocal_EntregaPedido;
    }

    public void setIdLocal_EntregaPedido(int idLocal_EntregaPedido) {
        this.idLocal_EntregaPedido = idLocal_EntregaPedido;
    }

    public int getIdPedido_Entrega() {
        return idPedido_Entrega;
    }

    public void setIdPedido_Entrega(int idPedido_Entrega) {
        this.idPedido_Entrega = idPedido_Entrega;
    }
}
