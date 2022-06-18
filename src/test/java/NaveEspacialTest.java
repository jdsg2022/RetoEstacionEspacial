import Nasa.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NaveEspacialTest {


    @Test
    public void CrearNaveRobotica(){

        String nombreNave = "Nave1";
        float pesoNave = 20.0f;
        float potenciaNave = 500.0f;
        float combustibleNave = 100.0f;
        String tipoPropulsion="Nitrogeno";

        Robotica nuevaNaveEspacialRobotica = new Robotica();
        System.out.println("TEST Robotica");
        nuevaNaveEspacialRobotica.setNombre(Validaciones.leerString("Ingrese nombre"));
        nuevaNaveEspacialRobotica.setPeso(Validaciones.leerEntero("Ingrese el peso de la nave"));
        nuevaNaveEspacialRobotica.setPotencia(Validaciones.leerEntero("Ingrese la potencia de la nave"));
        nuevaNaveEspacialRobotica.setCombustible(Validaciones.leerFloat("Ingrese el combustible de la nave"));
        nuevaNaveEspacialRobotica.setTipoPropulsion(Validaciones.leerString("Ingrese el tipo de propulsion"));

        assertEquals(nombreNave, nuevaNaveEspacialRobotica.getNombre());
        assertEquals(pesoNave, nuevaNaveEspacialRobotica.getPeso());
        assertEquals(potenciaNave, nuevaNaveEspacialRobotica.getPotencia());
        assertEquals(combustibleNave, nuevaNaveEspacialRobotica.getCombustible());
        assertEquals(tipoPropulsion, nuevaNaveEspacialRobotica.getTipoPropulsion());

    }

    @Test
    public void CrearNaveLanzadora(){
        System.out.println("TEST Lanzadadora");
        String nombreNave = "Nave2";
        float pesoNave = 30;
        float potenciaNave = 700;
        float combustibleNave = 150;
        float cantidadTripulantes = 50;
        float nroMotores = 5;

        Lanzadora nuevaNaveEspacialLanzadora = new Lanzadora();

        nuevaNaveEspacialLanzadora.setNombre(Validaciones.leerString("Ingrese nombre"));
        nuevaNaveEspacialLanzadora.setPeso(Validaciones.leerEntero("Ingrese el peso de la nave"));
        nuevaNaveEspacialLanzadora.setPotencia(Validaciones.leerEntero("Ingrese la potencia de la nave"));
        nuevaNaveEspacialLanzadora.setCombustible(Validaciones.leerEntero("Ingrese el tipo de combustible"));
        nuevaNaveEspacialLanzadora.setCantidadTripulantes(Validaciones.leerEntero("Ingrese la cantidad de tripulantes de la nave"));
        nuevaNaveEspacialLanzadora.setNroMotores(Validaciones.leerEntero("Ingrese la cantidad de motores"));

        assertEquals(nombreNave, nuevaNaveEspacialLanzadora.getNombre());
        assertEquals(pesoNave, nuevaNaveEspacialLanzadora.getPeso());
        assertEquals(potenciaNave, nuevaNaveEspacialLanzadora.getPotencia());
        assertEquals(combustibleNave, nuevaNaveEspacialLanzadora.getCombustible());
        assertEquals(cantidadTripulantes, nuevaNaveEspacialLanzadora.getCantidadTripulantes());
        assertEquals(nroMotores, nuevaNaveEspacialLanzadora.getNroMotores());

    }

    @Test
    public void CrearNaveTripulada(){
        System.out.println("TEST tripulada");
        String nombreNave = "Nave3";
        float pesoNave = 40;
        float potenciaNave = 750;
        float combustibleNave = 200;
        String tipoCoheteQuimico = "Con Iones";

        Tripulada nuevaNaveEspacialTripulada = new Tripulada();

        nuevaNaveEspacialTripulada.setNombre(Validaciones.leerString("Ingrese nombre"));
        nuevaNaveEspacialTripulada.setPeso(Validaciones.leerEntero("Ingrese el peso de la nave"));
        nuevaNaveEspacialTripulada.setPotencia((Validaciones.leerEntero("Ingrese la potencia de la nave")));
        nuevaNaveEspacialTripulada.setCombustible((Validaciones.leerEntero("Ingrese el tipo de combustible")));
        nuevaNaveEspacialTripulada.setTipoCoheteQuimico(Validaciones.leerString("Ingrese el tipo de cohete quimico"));

        assertEquals(nombreNave, nuevaNaveEspacialTripulada.getNombre());
        assertEquals(pesoNave, nuevaNaveEspacialTripulada.getPeso());
        assertEquals(potenciaNave, nuevaNaveEspacialTripulada.getPotencia());
        assertEquals(combustibleNave, nuevaNaveEspacialTripulada.getCombustible());
        assertEquals(tipoCoheteQuimico, nuevaNaveEspacialTripulada.getTipoCoheteQuimico());

    }

}
