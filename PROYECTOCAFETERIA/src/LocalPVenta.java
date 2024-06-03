public class LocalPVenta {

    //Atributos
    private int idLocal;
    private String nombre;
    private String direccion;
    private String telefono;
    public int id_Ingres_Inventario;
    public String email_AdmLocal;
    public int idTransportista;
    public String reservaCliente;
    public int idClienteResv;

    //Constructor
    public LocalPVenta (int idLocalC, String nombreC, String direccionC, String telefonoC, int id_Ingres_InventarioC,
                        String email_AdmLocalC, int idTransportistaC, String reservaClienteC, int idClienteResvC){
        this.idLocal=idLocalC;
        this.nombre=nombreC;
        this.direccion=direccionC;
        this.telefono=telefonoC;
        this.id_Ingres_Inventario=id_Ingres_InventarioC;
        this.email_AdmLocal=email_AdmLocalC;
        this.idTransportista=idTransportistaC;
        this.reservaCliente=reservaClienteC;
        this.idClienteResv = idClienteResvC;


    }

    //Métodos de la clase Empleado
    public void crearLocal(){
        this.idLocal = idLocal;
        System.out.println("Creación de un nuevo Local en el Sistema");
    }

    public void eliminarLocal(){
        this.idLocal = idLocal;
        System.out.println("Se ha eliminado el Local...");
    }

    public void generarResvClient(){
        this.reservaCliente = reservaCliente;
        System.out.println("Se ha reservado una mesa para el Cliente"+ idClienteResv);
    }

    public void estadoReservaClient(){

        System.out.println("El estado actual de la reserva del cliente" +idClienteResv+ "es "+reservaCliente);
    }

    //Métodos GETTER and SETTER
    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getEmail_AdmLocal() {
        return email_AdmLocal;
    }

    public void setEmail_AdmLocal(String email_AdmLocal) {
        this.email_AdmLocal = email_AdmLocal;
    }

    public int getId_Ingres_Inventario() {
        return id_Ingres_Inventario;
    }

    public void setId_Ingres_Inventario(int id_Ingres_Inventario) {
        this.id_Ingres_Inventario = id_Ingres_Inventario;
    }

    public int getIdTransportista() {
        return idTransportista;
    }

    public void setIdTransportista(int idTransportista) {
        this.idTransportista = idTransportista;
    }

    public String getReservaCliente() {
        return reservaCliente;
    }

    public void setReservaCliente(String reservaCliente) {
        this.reservaCliente = reservaCliente;
    }

    public int getIdClienteResv() {
        return idClienteResv;
    }

    public void setIdClienteResv(int idClienteResv) {
        this.idClienteResv = idClienteResv;
    }
}
