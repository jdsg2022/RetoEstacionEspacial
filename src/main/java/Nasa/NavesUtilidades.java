package Nasa;

import java.util.function.Predicate;

public class NavesUtilidades {

    public static Predicate<NaveEspacial> filtroTipo(String tipoNave) {
        return (NaveEspacial Nave) -> {
            return Nave.getTipoNave().equals(tipoNave);
        };
    }

    public static Predicate<NaveEspacial> filtroNombre(String nombreNave) {
        return (NaveEspacial Nave) -> {
            return Nave.getNombre().equals(nombreNave);
        };
    }

    public static Predicate<NaveEspacial> filtroCoincidenciaNombre(String contieneNombre) {
        return (NaveEspacial Nave) -> {
            return Nave.getNombre().contains(contieneNombre);
        };
    }

    public static Predicate<NaveEspacial> filtroPotencias(float potenciaIngresada) {
        return (NaveEspacial Nave) -> {
            return Nave.getPotencia() > potenciaIngresada;
        };
    }

    public static Predicate<NaveEspacial> filtroPeso(float pesoIngresado) {
        return (NaveEspacial Nave) -> {
            return Nave.getPeso() > pesoIngresado;
        };
    }

}
