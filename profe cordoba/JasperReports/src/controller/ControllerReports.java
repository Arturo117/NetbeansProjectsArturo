/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;//Trabajar objetos dentro de java
import net.sf.jasperreports.engine.util.JRLoader;//Localizra la ruta del archivo
import net.sf.jasperreports.view.JasperDesignViewer;//Cargar visualizador 
import net.sf.jasperreports.view.JasperViewer;
import model.*;
/**
 *
 * @author cipri
 */
public class ControllerReports {
    
    public void executeReport(){
        try {
            JasperReport jr = (JasperReport)JRLoader.loadObject(ControllerReports.class.getResource("/reports/MyReportOne.jasper"));
            JasperPrint jp = JasperFillManager.fillReport(jr, null, new JREmptyDataSource());
            JasperViewer jv = new JasperViewer(jp);
            jv.show();
        } catch (JRException ex) {
            Logger.getLogger(ControllerReports.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void executeReportWithParameters(String title){
        try {
            JasperReport jr = (JasperReport)JRLoader.loadObject(ControllerReports.class.getResource("/reports/MyReportOne.jasper"));
            Map parameters = new HashMap<String, Object>(); 
            parameters.put("title", title);
            JasperPrint jp = JasperFillManager.fillReport(jr, parameters, new JREmptyDataSource());
            JasperViewer jv = new JasperViewer(jp);
            jv.show();
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "JRException " + ex.getMessage());
        }
    }
    
    public void executeReportWithSql(String person_dni){
        try {
            Conexion c = new Conexion();
            JasperReport jr = (JasperReport)JRLoader.loadObject(ControllerReports.class.getResource("/reports/ReportWithSqlAndParameter.jasper"));//Ruta relativa 
            Map parameters = new HashMap<String, Object>();
            parameters.put("person_dni", person_dni);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, c.getConection());
            JasperViewer jv = new JasperViewer(jp);
            jv.show();
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "JRException " + ex.getMessage());
        }
    }
    public void executeBarChartReport(){
        Conexion c = new Conexion();
        try {
            JasperReport jr = (JasperReport)JRLoader.loadObject(ControllerReports.class.getResource("/reports/BarChartReport.jasper"));
            JasperPrint jp = JasperFillManager.fillReport(jr, null, c.getConection());
            JasperViewer jv = new JasperViewer(jp);
            jv.show();
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "JRException" + ex.getMessage());
        }
    }
    
    public void executeReportWhitRange(String datestar, String dateend) {
        Conexion c = new Conexion();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(ControllerReports.class.getResource("/reports/rango.jasper"));
            Map parameters = new HashMap<String, Object>();//preparar con un jasper view
            parameters.put("datestart", datestar);
            parameters.put("dateend", dateend);
            JasperPrint jp = JasperFillManager.fillReport(jr, parameters, c.getConection());
            JasperViewer jv = new JasperViewer(jp);
            jv.show();
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "ERROR JRException " + ex.getMessage());
        }
    }
    
}
