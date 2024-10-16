package javapplication;

public class tienda {
    public static void main(String[] args) {
        Guitarra guitarra1 = new Guitarra();
        guitarra1.setMarca("Gibson");
        guitarra1.setModelo("Les Paul");
        guitarra1.setCuerdas(6);
        guitarra1.setMadera("Caoba");
        guitarra1.setTipo("Electrica");
        guitarra1.setPrecio(2499.99);

        Guitarra guitarra2 = new Guitarra();
        guitarra2.setMarca("Fender");
        guitarra2.setModelo("Stratocaster");
        guitarra2.setCuerdas(6);
        guitarra2.setMadera("Aliso");
        guitarra2.setTipo("Electrica");
        guitarra2.setPrecio(1999.99);

        Guitarra guitarra3 = new Guitarra();
        guitarra3.setMarca("Yamaha");
        guitarra3.setModelo("FG800");
        guitarra3.setCuerdas(6);
        guitarra3.setMadera("Pino");
        guitarra3.setTipo("Acustica");
        guitarra3.setPrecio(299.99);

        // Imprimir un atributo de cada objeto
        System.out.println("Guitarra 1 Marca: " + guitarra1.getMarca());
        System.out.println("Guitarra 2 Modelo: " + guitarra2.getModelo());
        System.out.println("Guitarra 3 Tipo: " + guitarra3.getTipo());
    }
}
