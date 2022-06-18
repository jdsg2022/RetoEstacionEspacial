package Nasa;

abstract public class NaveEspacial {

    private String nombre;
    private float peso;
    private float combustible;
    private float potencia;

    private String tipoNave;


     public String getTipoNave() {
         return tipoNave;
     }


    public void setTipoNave(String tipoNave) {
        this.tipoNave = tipoNave;
    }

     public String getNombre() {
         return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public float getPeso() {
         return peso;
     }

     public void setPeso(float peso) {
         this.peso = peso;
     }

     public float getCombustible() {
         return combustible;
     }

     public void setCombustible(float combustible) {
         this.combustible = combustible;
     }

     public float getPotencia() {
         return potencia;
     }

     public void setPotencia(float potencia) {
         this.potencia = potencia;
     }

     abstract public void Lanzar();
     abstract public void Aterrizar();

     public NaveEspacial(String nombre, float peso, float combustible, float potencia,String tipoNave) {
         this.nombre = nombre;
         this.peso = peso;
         this.combustible = combustible;
         this.potencia = potencia;
         this.tipoNave=tipoNave;
     }

     public NaveEspacial(String tipoNave) {
        this.tipoNave=tipoNave;
     }
 }
