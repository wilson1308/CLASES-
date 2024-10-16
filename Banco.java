public class Banco{
    public static void main(String[] args){
        bancogs hola= new bancogs();
        hola.setDinero(214000);
        hola.setMoneda("Pesos colombianos");
        hola.setInteres(12);
        hola.setUsuarios(250);
        hola.setEscliente(true);

        System.out.println(hola.puedecomprarDGS0(true));
    }
}