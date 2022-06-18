package Nasa;

public class Lanzadora extends NaveEspacial{
    private String tipoCarga;
    private int cantidadTripulantes;
    private int nroMotores;

    @Override
    public void Lanzar() {

    }

    @Override
    public void Aterrizar() {

    }

    public Lanzadora(String tipoCarga, int cantidadTripulantes, int nroMotores,String nombre, float peso, float combustible, float potencia) {
        super(nombre,peso,combustible,potencia,"Lanzadora");
        this.tipoCarga = tipoCarga;
        this.cantidadTripulantes = cantidadTripulantes;
        this.nroMotores = nroMotores;

    }



    public Lanzadora() {
        super("Lanzadora");

    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public int getCantidadTripulantes() {
        return cantidadTripulantes;
    }

    public void setCantidadTripulantes(int cantidadTripulantes) {
        this.cantidadTripulantes = cantidadTripulantes;
    }

    public int getNroMotores() {
        return nroMotores;
    }

    public void setNroMotores(int nroMotores) {
        this.nroMotores = nroMotores;
    }
}
