package Nasa;

public class Tripulada extends NaveEspacial {
    private String tipoMotor;
    private String tipoCoheteQuimico;



    @Override
    public void Lanzar() {

    }

    @Override
    public void Aterrizar() {

    }

    public Tripulada(String tipoMotor,String tipoCoheteQuimico, String nombre, float peso, float combustible, float potencia) {
        super(nombre, peso, combustible, potencia,"Tripulada");
        this.tipoCoheteQuimico = tipoCoheteQuimico;
        this.tipoMotor = tipoMotor;

    }

    public Tripulada( String tipoMotor, String nombre, float peso, float combustible, float potencia) {
        super(nombre, peso, combustible, potencia,"Tripulada");

        this.tipoMotor = tipoMotor;


    }

    public Tripulada() {
        super("Tripulada");

    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }


    public String getTipoCoheteQuimico() {
        return tipoCoheteQuimico;
    }

    public void setTipoCoheteQuimico(String tipoCoheteQuimico) {
        this.tipoCoheteQuimico = tipoCoheteQuimico;
    }



}
