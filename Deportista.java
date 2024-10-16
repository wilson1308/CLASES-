public class Deportista {
    private int estatura, masa, vo2Max, hrMax, alturaSalto;

    public void setEstatura(int est) {
        this.estatura = est;
    }

    public void setPeso(int p) {
        this.masa = p;
    }

    public void setVo2Max(int v) {
        this.vo2Max = v;
    }

    public void setHrMax(int h) {
        this.hrMax = h;
    }

    public void setAlturaSalto(int a) {
        this.alturaSalto = a;
    }

    public int getEstatura() {
        return estatura;
    }

    public int getPeso() {
        return masa;
    }

    public int getVo2Max() {
        return vo2Max;
    }

    public int getHrMax() {
        return hrMax;
    }

    public int getAlturaSalto() {
        return alturaSalto;
    }

    public double calcularPeso(double masa){
        return masa * 9.81;
    }

    public double calcImc(double p, double e) {
        return p / Math.pow(e,2);
    }

    public int calcFcMax(int ed){
        return 220 - ed;
    }

    public int calcAnoNacimiento(int aNacimiento){
        return 2024 - aNacimiento;
    }

    public double calcPesoIdeal(){
        return 80;
    }

}
