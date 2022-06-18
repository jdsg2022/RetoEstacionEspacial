/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nasa.Persistencia;

/**
 *
 * @author Usuario
 */
public class NavesEspacialesHelper {
    public static String guardarLanzadora(){

        return "INSERT INTO `naveespacial`( `NOMBRE`, `PESO`, `CONBUSTIBLE`, `POTENCIA`, `TIPO_NAVE`, `TIPO_CARGA`, `CANTIDAD_TRIPULANTES`, `NRO_MOTORES`) VALUES (?,?,?,?,?,?,?,?)";
    }public static String guardarRobotica(){
        return "INSERT INTO `naveespacial`(`NOMBRE`, `PESO`, `CONBUSTIBLE`, `POTENCIA`, `TIPO_NAVE`, `TIPO_PROPULSION`, `LINEA_COMBUSTIBLE`, `TIPO_CATALIZADOR`) VALUES (?,?,?,?,?,?,?,?)";
    }public static String guardarTripulada(){
        return "INSERT INTO `naveespacial`(`NOMBRE`, `PESO`, `CONBUSTIBLE`, `POTENCIA`, `TIPO_NAVE`, `TIPO_MOTOR`, `TIPO_COHETE_QUIMICO`) VALUES (?,?,?,?,?,?,?)";
    }
    public static String buscarNaves(){
        return "SELECT * FROM `naveespacial` ";
    }
}
