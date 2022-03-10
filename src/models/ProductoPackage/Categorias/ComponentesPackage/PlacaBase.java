package models.ProductoPackage.Categorias.ComponentesPackage;

public class PlacaBase extends Componente{
    protected String socket;
    protected String factorForma;
    protected String chipset;
    protected String memoriaSoportada;
    protected String maximaRAM;
    protected int conectoresUSB;
    protected int puertosM2;

    public PlacaBase(float precio, String descripcion, String marca, String socket, String factorForma, String chipset, String memoriaSoportada, String maximaRAM, int conectoresUSB, int puertosM2) {
        super(precio, descripcion, marca);
        this.socket = socket;
        this.factorForma = factorForma;
        this.chipset = chipset;
        this.memoriaSoportada = memoriaSoportada;
        this.maximaRAM = maximaRAM;
        this.conectoresUSB = conectoresUSB;
        this.puertosM2 = puertosM2;
    }

    public String getSocket() {return socket;}

    public String getFactorForma() {return factorForma;}

    public String getChipset() {return chipset;}

    public String getMemoriaSoportada() {return memoriaSoportada;}

    public String getMaximaRAM() {return maximaRAM;}

    public int getConectoresUSB() {return conectoresUSB;}

    public int getPuertosM2() {return puertosM2;}


    public void setSocket(String socket) {
        this.socket = socket;
    }

    public void setFactorForma(String factorForma) {
        this.factorForma = factorForma;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public void setMemoriaSoportada(String memoriaSoportada) {
        this.memoriaSoportada = memoriaSoportada;
    }

    public void setMaximaRAM(String maximaRAM) {
        this.maximaRAM = maximaRAM;
    }

    public void setConectoresUSB(int conectoresUSB) {
        this.conectoresUSB = conectoresUSB;
    }

    public void setPuertosM2(int puertosM2) {
        this.puertosM2 = puertosM2;
    }

    @Override
    public String toString() {
        return "PlacaBase{" +
                "socket='" + socket + '\'' +
                ", factorForma='" + factorForma + '\'' +
                ", chipset='" + chipset + '\'' +
                ", memoriaSoportada='" + memoriaSoportada + '\'' +
                ", maximaRAM='" + maximaRAM + '\'' +
                ", conectoresUSB=" + conectoresUSB +
                ", puertosM2=" + puertosM2 +
                '}';
    }
}
