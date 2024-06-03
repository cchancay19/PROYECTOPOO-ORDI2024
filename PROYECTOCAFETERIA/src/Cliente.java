import java.util.Date;
import java.util.List;

public class Cliente {

    //Atributos
    private int idCliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correo;
    private Date fechaRegistro;
    private String detalleOrden;

    //Constructor
    public Cliente (int idClienteC, String nombreC, String apellidoC, String direccionC, String telefonoC, String correoC, Date fechRegC, String detalleOrdenC){
        this.idCliente=idClienteC;
        this.nombre=nombreC;
        this.apellido=apellidoC;
        this.direccion=direccionC;
        this.telefono=telefonoC;
        this.correo=correoC;
        this.fechaRegistro=fechRegC;
        this.detalleOrden=detalleOrdenC;

    }

    //Métodos de la clase Cliente
    public void solicitarPedido(){
        this.idCliente = idCliente;
        System.out.println("El pedido para el cliente" + idCliente + " solicitado");
    }

    public void listarProductPedido(){

        System.out.println("Estimado" + nombre+ " este es el detalle de su orden... " + detalleOrden);
    }

    public void actualizarCliente(){

        System.out.println("Actualización de datos del cliente...");
    }

    public void registrarCliente(){

        System.out.println("El cliente" +nombre +apellido+ " se ha registrdo con éxito");
    }


//Métodos GETTER and SETTER
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getDetalleOrden() {
        return detalleOrden;
    }

    public void setDetalleOrden(String detalleOrden) {
        this.detalleOrden = detalleOrden;
    }
}
