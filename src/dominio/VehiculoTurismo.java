package dominio;

public class VehiculoTurismo {
    private String marca;
    private String modelo;
    private double precio;
    private int plazas;

    public VehiculoTurismo(String marca, String modelo, double precio, int plazas) {
        // this.   hace referencia a las variables privadas (this == objeto de clase VehiculoTurismo)
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.plazas = plazas;
    }

    // Devuelve el precio calculado para que otras clases lo puedan usar "al vuelo",
    // es decir, sin guardarlo en una variable (no ocupamos memoria)
    public double calcularPrecio() {
        if (this.plazas <= 5) {
            return this.precio;
        }
        else {
            return this.precio + ((this.plazas - 5) * 0.1 * this.precio);
        }
    }

    @Override
    public String toString() {
        return "Es un " + this.marca + " " + this. modelo + ", con valor " + this.calcularPrecio();
    }
}
