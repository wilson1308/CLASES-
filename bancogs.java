public class bancogs{
    int Cantidad_usuarios,Cantidad_dinero,Interes_prestamo;
    String Moneda;
    boolean Es_ciente;

    public String getMoneda(){
        return Moneda;
    }
    public int getUsuarios(){
        return Cantidad_usuarios;
    }
    public int  getDinero(){
        return Cantidad_dinero;
    }
    public int  getInteres(){
        return Interes_prestamo;
    }
    public boolean  getCliente(){
        return Es_ciente;
    }
    
    
    public void setMoneda(String a) {
        this.Moneda = a;
    }
    public void setDinero(int a) {
        this.Cantidad_dinero= a;
    }
    public void setUsuarios(int a) {
        this.Cantidad_usuarios = a;
    }
    public void setInteres(int  a) {
        this.Interes_prestamo = a;
    }
    public void setEscliente(boolean a) {
        this.Es_ciente= a;
    }

    public void quitardinero(int a){
        this.Cantidad_dinero=Cantidad_dinero-a;
    }
    public void añadirdinero(int a){
        this.Cantidad_dinero=Cantidad_dinero+a;
    }
    public void Seretira(boolean  a){
        this.Es_ciente=false;
    }
    public void Sininteres(int a){
        this.Interes_prestamo=0;
    }
    public boolean  puedecomprarDGS0(boolean  a){
        boolean comprar=true;
        if (Cantidad_dinero>=214000) {
            comprar=true;
        }
        else{
            comprar=false;
        };
        return comprar;
    }
}