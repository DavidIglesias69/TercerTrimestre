package Canciones;

public class DispositivoMultimedia {
    protected String marca;
    protected String modelo;
    protected double precio;

    public DispositivoMultimedia(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Formatear precio para mostrar solo dos decimales
    public String toString() {
        return "| Marca: " + marca + "\n| Modelo: " + modelo + "\n| Precio: " + String.format("%.2f", precio) + " €";
    }

    public void mostrarInformacion() {
        System.out.println(this.toString());
    }
}
