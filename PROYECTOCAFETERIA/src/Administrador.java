import java.awt.font.TextHitInfo;
import java.util.Date;

public class Administrador {

    //Atributos
    private int idAdmin;
    private String user;
    private String password;
    private String nombre;
    private String apellido;
    public int id_Ingres_Inventario;
    private double pago_SueldoEmpleados;
    public int idLocal_PVenta;

    //Constructor
    public Administrador (int idAdminC, String userC, String passwordC, String nombreC, String apellidoC, int id_Ingres_InventarioC,
                     double pago_SueldoEmpleadosC, int idLocal_PVentaC){
        this.idAdmin=idAdminC;
        this.user=userC;
        this.password=passwordC;
        this.nombre=nombreC;
        this.apellido=apellidoC;
        this.id_Ingres_Inventario=id_Ingres_InventarioC;
        this.pago_SueldoEmpleados=pago_SueldoEmpleadosC;
        this.idLocal_PVenta=idLocal_PVentaC;


    }

    //Métodos de la clase Empleado
    public void iniciarSesion(){
        this.user = user;
        System.out.println("Bienvenido" + user + " ingreso exitoso al Sistema");
    }

    public void reseteoPassword(){
        this.password = password;
        System.out.println("Su clave de acceso ha sido cambiada con éxito!");
    }

    public void ingresoProductos(){
        this.id_Ingres_Inventario = id_Ingres_Inventario;
        System.out.println("La Orden se ingreso al Sistema de manera exitosa...");
    }

    public void pagosSueldos(){
        this.pago_SueldoEmpleados = pago_SueldoEmpleados;
        System.out.println("Se realizo el pago a empleados de la Cafetería!");
    }

//Métodos GETTER and SETTER


    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public int getId_Ingres_Inventario() {
        return id_Ingres_Inventario;
    }

    public void setId_Ingres_Inventario(int id_Ingres_Inventario) {
        this.id_Ingres_Inventario = id_Ingres_Inventario;
    }

    public double getPago_SueldoEmpleados() {
        return pago_SueldoEmpleados;
    }

    public void setPago_SueldoEmpleados(double pago_SueldoEmpleados) {
        this.pago_SueldoEmpleados = pago_SueldoEmpleados;
    }

    public int getIdLocal_PVenta() {
        return idLocal_PVenta;
    }

    public void setIdLocal_PVenta(int idLocal_PVenta) {
        this.idLocal_PVenta = idLocal_PVenta;
    }
}
