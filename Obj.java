public class Obj{
    private String nombre;
    private double peso;
    private double precioPorunidad;
    private char categoria;
    
    public Obj() {
    }

    public Obj(String nombre, double peso, double precioPorunidad, char categoria) {
        this.nombre = nombre;
        this.peso = peso;
        this.precioPorunidad = precioPorunidad;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getprecioPorunidad() {
        return precioPorunidad;
    }

    public void setprecioPorunidad(double precio) {
        this.precioPorunidad = precio;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    
}