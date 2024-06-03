import java.util.Date;

public class Empleado {

    //Atributos
    private int idEmpleado;
    private String user;
    private String password;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correo;
    private Date fechaNacimiento;
    private String cargo;
    private String turnoJornada;

    //Constructor
    public Empleado (int idEmpleadoC, String userC, String passwordC, String nombreC, String apellidoC, String direccionC,
                     String telefonoC, String correoC, Date fechNacimC, String cargoC, String turnoJornadaC){
        this.idEmpleado=idEmpleadoC;
        this.user=userC;
        this.password=passwordC;
        this.nombre=nombreC;
        this.apellido=apellidoC;
        this.direccion=direccionC;
        this.telefono=telefonoC;
        this.correo=correoC;
        this.fechaNacimiento=fechNacimC;
        this.cargo=cargoC;
        this.turnoJornada=turnoJornadaC;

    }

    //Métodos de la clase Empleado
    public void iniciarSesion(){
        this.user = user;
        System.out.println("Bienvenido" + user + " ingreso exitoso al Sistema");
    }

    public void registroEntrada(){
        if (this.turnoJornada.equals("Matutino")){
            this.turnoJornada = "INGRESO TURNO 1";
            System.out.println("Se registro su ingreso");
        } else if (this.turnoJornada.equals("Vespertino")) {
            this.turnoJornada = "INGRESO TURNO 2";
            System.out.println("Se registro su ingreso");
        } else{
            System.out.println("ERROR AL REGISTRAR SU INGRESO A SU JORNADA LABORAL");
        }
    }

    public void registroSalida(){
        if (this.turnoJornada.equals("salida1")){
            this.turnoJornada = "SALIDA TURNO 1";
            System.out.println("Se registro la salida de su jornada");
        } else if (this.turnoJornada.equals("salida2")) {
            this.turnoJornada = "INGRESO TURNO 2";
            System.out.println("Se registro la salida de su jornada");
        } else{
            System.out.println("ERROR AL REGISTRAR LA SALIDA DE SU JORNADA LABORAL");
        }
    }

    public void turnoAsignado(){

        if (this.turnoJornada.equals("Matutino")){
            System.out.println("El empleado "+user+" tiene el turno de la mañana");

        }else {
            System.out.println("El empleado "+user+" tiene el turno de la tarde");

        }
}

//Métodos GETTER and SETTER


    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTurnoJornada() {
        return turnoJornada;
    }

    public void setTurnoJornada(String turnoJornada) {
        this.turnoJornada = turnoJornada;
    }
}