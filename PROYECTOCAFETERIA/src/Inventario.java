public class Inventario {
    // Atributos privados
    private int idIngreso_Stock;
    private String descripcProduct;
    private int idCateg_Product;

    // Atributos públicos
    public int idLocal;
    public String responsab_Invent;
    public int IdProducto;
    public int idProveed_Product;

    // Constructor
    public Inventario(int idIngreso_Stock, int idLocal, String responsab_Invent, int IdProducto, String descripcProduct, int idCateg_Product, int idProveed_Product) {
        this.idIngreso_Stock = idIngreso_Stock;
        this.idLocal = idLocal;
        this.responsab_Invent = responsab_Invent;
        this.IdProducto = IdProducto;
        this.descripcProduct = descripcProduct;
        this.idCateg_Product = idCateg_Product;
        this.idProveed_Product = idProveed_Product;
    }

    // Métodos públicos
    public void crearOrdenStock() {
        // Lógica para crear una orden de stock
        System.out.println("Crear orden de stock");
    }

    public void editarOrdenStock() {
        // Lógica para editar una orden de stock
        System.out.println("Editar orden de stock");
    }

    public void eliminarOrdenStock() {
        // Lógica para eliminar una orden de stock
        System.out.println("Eliminar orden de stock");
    }

    public void stockActProduct() {
        // Lógica para actualizar el stock de un producto
        System.out.println("Actualizar stock del producto");
    }

    // Getters y Setters para los atributos privados
    public int getIdIngreso_Stock() {
        return idIngreso_Stock;
    }

    public void setIdIngreso_Stock(int idIngreso_Stock) {
        this.idIngreso_Stock = idIngreso_Stock;
    }

    public String getDescripcProduct() {
        return descripcProduct;
    }

    public void setDescripcProduct(String descripcProduct) {
        this.descripcProduct = descripcProduct;
    }

    public int getIdCateg_Product() {
        return idCateg_Product;
    }

    public void setIdCateg_Product(int idCateg_Product) {
        this.idCateg_Product = idCateg_Product;
    }
}

