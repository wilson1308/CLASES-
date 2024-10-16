package javapplication;

public class Guitarra {

    private String marca;
    private String modelo;
    private int cuerdas;
    private String madera;
    private String tipo; // nuevo atributo
    private double precio; // nuevo atributo

    public Guitarra() {
    }

    // Getters y Setters
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

    public int getCuerdas() {
        return cuerdas;
    }

    public void setCuerdas(int cuerdas) {
        this.cuerdas = cuerdas;
    }

    public String getMadera() {
        return madera;
    }

    public void setMadera(String madera) {
        this.madera = madera;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Métodos adicionales
    public void tocar() {
        System.out.println("Tocando la guitarra " + modelo + ".");
    }

    public void afinar() {
        System.out.println("Afinando la guitarra " + modelo + ".");
    }

    public void mostrarDetalles() {
        System.out.println("Detalles de la guitarra: " + toString());
    }

    public void cambiarCuerdas() {
        System.out.println("Cambiando cuerdas de la guitarra " + modelo + ".");
    }

    public void calcularValorResidual() {
        // Método simplificado
        double valorResidual = precio * 0.5; // Asumiendo una depreciación del 50%
        System.out.println("Valor residual de la guitarra " + modelo + ": $" + valorResidual);
    }

    @Override
    public String toString() {
        return "Guitarra{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cuerdas=" + cuerdas +
                ", madera='" + madera + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }
}

