/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nasa.Persistencia;

import Nasa.*;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Usuario
 */
public class NaveDAO {

    public boolean guardarNave(Connection con, List<NaveEspacial> listNavesEspaciales) {

        boolean resultado = true;

        Lanzadora objLanzadora;
        Robotica objRoboticas;
        Tripulada objTripulada;
        try {
            //Se deben asignar los valores a los  ? que son los parametros de la consulta.... ojo el orden importa
            PreparedStatement p = con.prepareStatement(NavesEspacialesHelper.guardarLanzadora());
            PreparedStatement p1 = con.prepareStatement(NavesEspacialesHelper.guardarRobotica());
            PreparedStatement p2 = con.prepareStatement(NavesEspacialesHelper.guardarTripulada());

            for (NaveEspacial nave : listNavesEspaciales) {

                switch (nave.getTipoNave()) {
                    case "Lanzadora":
                        objLanzadora = new Lanzadora();
                        objLanzadora = (Lanzadora) nave;

                        p.setString(1, objLanzadora.getNombre());
                        p.setFloat(2, objLanzadora.getPeso());
                        p.setFloat(3, objLanzadora.getCombustible());
                        p.setFloat(4, objLanzadora.getPotencia());
                        p.setString(5, objLanzadora.getTipoNave());
                        p.setString(6, objLanzadora.getTipoCarga());
                        p.setInt(7, objLanzadora.getCantidadTripulantes());
                        p.setInt(8, objLanzadora.getNroMotores());
                        p.execute();
                        objLanzadora = null;
                        break;
                    case "Robotica":
                        objRoboticas = new Robotica();
                        objRoboticas = (Robotica) nave;

                        p1.setString(1, nave.getNombre());
                        p1.setFloat(2, nave.getPeso());
                        p1.setFloat(3, nave.getCombustible());
                        p1.setFloat(4, nave.getPotencia());
                        p1.setString(5, nave.getTipoNave());
                        p1.setString(6, objRoboticas.getTipoPropulsion());
                        p1.setString(7, objRoboticas.getLineaCombustible());
                        p1.setString(8, objRoboticas.getTipoCatalizador());
                        p1.execute();
                        objRoboticas = null;

                        break;
                    case "Tripulada":
                        objTripulada = new Tripulada();
                        objTripulada = (Tripulada) nave;
                        p2.setString(1, nave.getNombre());
                        p2.setFloat(2, nave.getPeso());
                        p2.setFloat(3, nave.getCombustible());
                        p2.setFloat(4, nave.getPotencia());
                        p2.setString(5, nave.getTipoNave());
                        p2.setString(6, objTripulada.getTipoMotor());
                        p2.setString(7, objTripulada.getTipoCoheteQuimico());
                        p2.execute();
                        objTripulada = null;
                        break;
                }

                //  JOptionPane.showMessageDialog(null, "se guardaron los datos");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            resultado = false;
        } finally {
            try {
                con.close();
            } catch (Exception clo) {
                clo.printStackTrace();
            }
        }
        return resultado;

    }

    public List<NaveEspacial> cargarNaves(Connection con) {

        List<NaveEspacial> inventarioNavesEspaciales = new ArrayList();
        Lanzadora objLanzadora;
        Robotica objRoboticas;
        Tripulada objTripulada;
        try {
            Statement objStatement = con.createStatement();
            ResultSet objResultset = objStatement.executeQuery(NavesEspacialesHelper.buscarNaves());

            while (objResultset.next()) {
                if (objResultset.getString("TIPO_NAVE").equals("Lanzadora")) {
                    objLanzadora = new Lanzadora();
                    objLanzadora.setNombre(objResultset.getString("NOMBRE"));
                    objLanzadora.setPeso(objResultset.getFloat("PESO"));
                    objLanzadora.setCombustible(objResultset.getFloat("CONBUSTIBLE"));
                    objLanzadora.setPotencia(objResultset.getFloat("POTENCIA"));
                    objLanzadora.setTipoNave(objResultset.getString("TIPO_NAVE"));
                    objLanzadora.setTipoCarga(objResultset.getString("TIPO_CARGA"));
                    objLanzadora.setCantidadTripulantes(objResultset.getInt("CANTIDAD_TRIPULANTES"));
                    objLanzadora.setNroMotores(objResultset.getInt("NRO_MOTORES"));
                    inventarioNavesEspaciales.add(objLanzadora);
                    objLanzadora = null;
                } else if (objResultset.getString("TIPO_NAVE").equals("Robotica")) {
                    objRoboticas = new Robotica();
                    objRoboticas.setNombre(objResultset.getString("NOMBRE"));
                    objRoboticas.setPeso(objResultset.getFloat("PESO"));
                    objRoboticas.setCombustible(objResultset.getFloat("CONBUSTIBLE"));
                    objRoboticas.setPotencia(objResultset.getFloat("POTENCIA"));
                    objRoboticas.setTipoNave(objResultset.getString("TIPO_NAVE"));
                    objRoboticas.setTipoPropulsion(objResultset.getString("TIPO_PROPULSION"));
                    objRoboticas.setLineaCombustible(objResultset.getString("LINEA_COMBUSTIBLE"));
                    objRoboticas.setTipoCatalizador(objResultset.getString("TIPO_CATALIZADOR"));
                    inventarioNavesEspaciales.add(objRoboticas);
                    objRoboticas = null;

                } else if (objResultset.getString("TIPO_NAVE").equals("Tripulada")) {

                    objTripulada = new Tripulada();
                    objTripulada.setNombre(objResultset.getString("NOMBRE"));
                    objTripulada.setPeso(objResultset.getFloat("PESO"));
                    objTripulada.setCombustible(objResultset.getFloat("CONBUSTIBLE"));
                    objTripulada.setPotencia(objResultset.getFloat("POTENCIA"));
                    objTripulada.setTipoNave(objResultset.getString("TIPO_NAVE"));
                    objTripulada.setTipoMotor(objResultset.getString("TIPO_MOTOR"));
                    objTripulada.setTipoCoheteQuimico(objResultset.getString("TIPO_COHETE_QUIMICO"));
                    inventarioNavesEspaciales.add(objTripulada);
                    objTripulada = null;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            inventarioNavesEspaciales = null;
        } finally {
            try {
                con.close();
            } catch (Exception clo) {
                clo.printStackTrace();
            }
        }
        return inventarioNavesEspaciales;

    }
}
