package Nasa;

public class Robotica extends NaveEspacial {
    public String getTipoPropulsion() {
        return tipoPropulsion;
    }

    public void setTipoPropulsion(String tipoPropulsion) {
        this.tipoPropulsion = tipoPropulsion;
    }

    public String getLineaCombustible() {
        return lineaCombustible;
    }

    public void setLineaCombustible(String lineaCombustible) {
        this.lineaCombustible = lineaCombustible;
    }

    public String getTipoCatalizador() {
        return tipoCatalizador;
    }

    public void setTipoCatalizador(String tipoCatalizador) {
        this.tipoCatalizador = tipoCatalizador;
    }

    private String tipoPropulsion;
    private String lineaCombustible;
    private String tipoCatalizador;




    @Override
    public void Lanzar() {

    }

    @Override
    public void Aterrizar() {

    }

    public Robotica(String tipoPropulsion, String lineaCombustible, String tipoCatalizador, String nombre, float peso, float combustible, float potencia) {
        super(nombre, peso, combustible, potencia, "Robotica");
        this.lineaCombustible = lineaCombustible;
        this.tipoCatalizador = tipoCatalizador;
        this.tipoPropulsion = tipoPropulsion;


    }




    public Robotica() {
        super("Robotica");

    }
}
