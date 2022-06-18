package Nasa;

import Nasa.Persistencia.NaveDAO;
import Utilidades.Conexion;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GestinarNaves {
    private int sw = 0;
    private int opcMenuPrincipal;
    private int opcMenuCrearNave;
    private int swMenuCrearNave;
    Conexion con = new Conexion();

    private List<NaveEspacial> inventarioNavesEspaciales = new ArrayList();
    private List<NaveEspacial> navesNuevas = new ArrayList();

    public void GestionDeNaves() {

//
        while (sw == 0) {

            opcMenuPrincipal = Validaciones.leerEnteroConRango("Welcome! digita por favor una opcion: \n" +
                    "1. Crear una nave \n" +
                    "2. Buscar Nave \n" +
                    "3. Salir", 3);
            if (opcMenuPrincipal == 1) {
                swMenuCrearNave = 0;
                while (swMenuCrearNave == 0) {

                    opcMenuCrearNave = Validaciones.leerEnteroConRango("Digita una opcion segun la nave: \n " +
                            "1. Lanzadora\n" +
                            "2. Robotica\n" +
                            "3. Tripulante", 3);
                    if (opcMenuCrearNave == 1) {//Nave Lanzadora
                        Lanzadora objLanzadora = LLenarDatosLanzadora();
                        inventarioNavesEspaciales.add(objLanzadora);
                        navesNuevas.add(objLanzadora);
                        objLanzadora = null;
                        swMenuCrearNave = 1;
                    } else if (opcMenuCrearNave == 2) {//Nave Robotica
                        Robotica objRobotica = LLenarDatosRobotica();
                        inventarioNavesEspaciales.add(objRobotica);
                        navesNuevas.add(objRobotica);
                        objRobotica = null;
                        swMenuCrearNave = 1;
                    } else if (opcMenuCrearNave == 3) {// Nave Tripulada
                        Tripulada objTripulada=LLenarDatosLTripulante();
                        inventarioNavesEspaciales.add(objTripulada);
                        navesNuevas.add(objTripulada);
                        objTripulada=null;

                        swMenuCrearNave = 1;
                    } else {
                        System.out.println("ingrese porfavor un numero del 1 al 3");
                    }

                }
            } else if (opcMenuPrincipal == 2) {
                MenuFiltrar(inventarioNavesEspaciales);

            } else if (opcMenuPrincipal == 3) {
                guardarNavesEspaciales();
                sw = 1;
            } else {
                System.out.println("ingrese porfavor un numero del 1 al 3");
            }


        }
    }

    public void guardarNavesEspaciales() {
        NaveDAO objNaveDAO = new NaveDAO();

        if (navesNuevas.size()>0) {
            if (objNaveDAO.guardarNave(con.getCon(), navesNuevas)) {
                JOptionPane.showMessageDialog(null, "Naves guardadas correctamente");

            }
        }
    }

    public void cargarNaves() {
        NaveDAO objpodPodio = new NaveDAO();
        inventarioNavesEspaciales = objpodPodio.cargarNaves(con.getCon());

    }


    public Lanzadora LLenarDatosLanzadora() {
        Lanzadora objLanzadora = new Lanzadora();
        objLanzadora.setCantidadTripulantes(Validaciones.leerEntero("Ingrese la cantidad de tripulantes"));
        objLanzadora.setNroMotores(Validaciones.leerEntero("Ingrese la cantidad de motores"));
        objLanzadora.setNombre(Validaciones.leerString("ingrese porfavor el nombre"));
        objLanzadora.setPeso(Validaciones.leerFloat("ingrese el peso"));
        objLanzadora.setPotencia(Validaciones.leerFloat("Ingrese la potencia"));
        objLanzadora.setCombustible(Validaciones.leerFloat("Ingrese la cantidad de combustible en galones"));
        objLanzadora.setTipoCarga(Validaciones.leerString("ingrese el tipo de carga"));

        return objLanzadora;
    }

    public Tripulada LLenarDatosLTripulante() {
        Tripulada objTripulada = new Tripulada();

        objTripulada.setTipoMotor(Validaciones.leerString("Ingrese el tipo de motor"));
        objTripulada.setTipoCoheteQuimico(Validaciones.leerString("Ingrese el tipo de cohete quimico"));
        objTripulada.setNombre(Validaciones.leerString("ingrese porfavor el nombre"));
        objTripulada.setPeso(Validaciones.leerFloat("ingrese el peso"));
        objTripulada.setPotencia(Validaciones.leerFloat("Ingrese la potencia"));
        objTripulada.setCombustible(Validaciones.leerFloat("Ingrese la cantidad de combustible en galones"));
        return objTripulada;
    }

    public Robotica LLenarDatosRobotica() {
        Robotica objRobotica = new Robotica();
        objRobotica.setTipoPropulsion(Validaciones.leerString("Ingrese el tipo de propulsion"));
        objRobotica.setLineaCombustible(Validaciones.leerString("Ingrese la linea de combustible"));
        objRobotica.setTipoCatalizador(Validaciones.leerString("Ingrese el tipo de catalizador"));
        objRobotica.setNombre(Validaciones.leerString("ingrese porfavor el nombre"));
        objRobotica.setPeso(Validaciones.leerFloat("ingrese el peso"));
        objRobotica.setPotencia(Validaciones.leerFloat("Ingrese la potencia"));
        objRobotica.setCombustible(Validaciones.leerFloat("Ingrese la cantidad de combustible en galones"));

        return objRobotica;
    }

    public void MenuFiltrar(List<NaveEspacial> inventarioNavesEspaciales) {
        int menuFiltrar = 0, opcMenuFiltrar;
        String tipoNaveBuscar = "", nombreNave, coincidenciaNombre;
        float peso, potenciaNave;
        while (menuFiltrar == 0) {
            opcMenuFiltrar = Validaciones.leerEnteroConRango("Digita por favor una opcion por la de deseas buscar: \n" +
                    "1. Buscar por tipo de nave \n" +
                    "2. Buscar por nombre de la nave\n" +
                    "3. Buscar por peso de la nave\n" +
                    "4. Buscar por concidencia del nombre de la nave\n" +
                    "5. Buscar por potencia mayor al numero ingresado\n" +
                    "6. Salir", 6);
            switch (opcMenuFiltrar) {
                case 1:
                    tipoNaveBuscar = Validaciones.leerEnteroRCadena("Ingrese el tipo de la nave que desea buscar:\n" +
                            "1.Lanzadora\n" +
                            "2.Robotica\n" +
                            "3.Tripulada\n", 3);
                    inventarioNavesEspaciales
                            .stream()
                            .filter(NavesUtilidades.filtroTipo(tipoNaveBuscar))
                            .map(NaveEspacial -> NaveEspacial.getTipoNave())
                            .forEach(System.out::println);


                    break;
                case 2:
                    nombreNave = Validaciones.leerString("ingrese el nombre de la nave");
                    inventarioNavesEspaciales
                            .stream()
                            .filter(NavesUtilidades.filtroNombre(nombreNave))
                            .map(NaveEspacial -> NaveEspacial.getNombre())
                            .forEach(System.out::println);
                    break;
                case 3:
                    peso = Validaciones.leerFloat("Ingrese el peso de la nave");
                    inventarioNavesEspaciales
                            .stream()
                            .filter(NavesUtilidades.filtroPeso(peso))
                            .map(NaveEspacial -> NaveEspacial.getPeso())
                            .forEach(System.out::println);
                    break;

                case 4:
                    coincidenciaNombre = Validaciones.leerString("ingrese la coincidencia del nombre de la nave");
                    inventarioNavesEspaciales
                            .stream()
                            .filter(NavesUtilidades.filtroCoincidenciaNombre(coincidenciaNombre))
                            .map(NaveEspacial -> NaveEspacial.getNombre())
                            .forEach(System.out::println);
                    break;
                case 5:
                    potenciaNave = Validaciones.leerFloat("ingrese la pontecia de la nave");
                    inventarioNavesEspaciales
                            .stream()
                            .filter(NavesUtilidades.filtroPotencias(potenciaNave))
                            .map(NaveEspacial -> NaveEspacial.getPotencia())
                            .forEach(System.out::println);

                    break;
                case 6:
                    menuFiltrar = 1;
                    break;
            }

        }
    }

    public List<NaveEspacial> getInventarioNavesEspaciales() {
        return inventarioNavesEspaciales;
    }

    public void setInventarioNavesEspaciales(List<NaveEspacial> inventarioNavesEspaciales) {
        this.inventarioNavesEspaciales = inventarioNavesEspaciales;
    }
}
