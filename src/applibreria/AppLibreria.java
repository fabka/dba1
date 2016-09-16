/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applibreria;

import entities.ColumnasDba;
import entities.Libro;
import entities.Punto1;
import entities.RestriccionesPunto3;
import entities.TablasDba;
import entities.VistasDba;
import facades.ColumnasDbaJpaController;
import facades.LibroJpaController;
import facades.Punto1JpaController;
import facades.RestriccionesPunto3JpaController;
import facades.TablasDbaJpaController;
import facades.VistasDbaJpaController;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author sala-a
 */
public class AppLibreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("AppLibreriaPU");  
    EntityManager em = emf.createEntityManager();

    //Punto 1

    Punto1JpaController controlPunto1 = new Punto1JpaController(emf);
    List<Punto1> findPunto1Entities = controlPunto1.findPunto1Entities();
    for (Punto1 l : findPunto1Entities) {
        System.out.println(l.getUsername() + " " + l.getTotalTablas() + " " + 
                l.getTotalTablas()+ " " + l.getTotalTriggers()+ " " + l.getTotalVistas() + " " + 
                l.getTotalVistasMat() + " " + l.getAccountStatus() + " " + l.getDefaultTablespace());
    }

    //Usuario Seleccionado
    String sel = "LOGAN";
    //Punto 2 --problema con @Id

    TablasDbaJpaController controlTablas = new TablasDbaJpaController(emf);
    List<TablasDba> findTablasDbaEntities = controlTablas.findTablasDbaEntities();
    VistasDbaJpaController controlVistas = new VistasDbaJpaController(emf);
    List<VistasDba> findVistasDbaEntities = controlVistas.findVistasDbaEntities();
    //Lista de Tablas y Vistas seleccionadas
    List<String> seleccionadas = new ArrayList<String>();
    System.out.println("\n    Tablas y Vistas del usuario  ");
    for (TablasDba l : findTablasDbaEntities) {
        if(l.getOwner().equals(sel)){
            seleccionadas.add(l.getTableName());
            System.out.println(l.getTableName());
        }
    }
    for (VistasDba l : findVistasDbaEntities) {
        if(l.getOwner().equals(sel)){
            seleccionadas.add(l.getViewName());
            System.out.println(l.getViewName());
        }
    }
        
    
    
    // Punto 3
    
    ColumnasDbaJpaController controlColumnas = new ColumnasDbaJpaController(emf);
    List<ColumnasDba> findColumnasDbaEntities = controlColumnas.findColumnasDbaEntities();
    RestriccionesPunto3JpaController controlRestricciones = new RestriccionesPunto3JpaController(emf);
    List<RestriccionesPunto3> findRestriccionesDbaEntities = controlRestricciones.findRestriccionesPunto3Entities();
        System.out.println("----------");
    for(RestriccionesPunto3 r : findRestriccionesDbaEntities){
        if(r.getOwner().equals(sel) ){
            System.out.println(r.getTableName()+"  "+r.getColumnName());
        }
    }
    
    
    for(String s : seleccionadas){
        System.out.println("\n Seleccionada:  " + s + "\n");
        for(ColumnasDba c :findColumnasDbaEntities){
            String resp=" ";
            if(c.getOwner().equals(sel) && c.getTableName().equals(s)){
                resp = (c.getColumnName() + "  (" + c.getDataType() + " " + c.getDataLength() + ")");
                for(RestriccionesPunto3 r : findRestriccionesDbaEntities){
                    if(r.getOwner().equals(sel) && r.getTableName().equals(s) && c.getColumnName().equals(r.getColumnName()) && r.getConstraintType().equals("P") ){
                        resp = resp.concat("(Pk)");
                    }
                }
                System.out.println(resp);
            }           
        }
    } 
    
    }
}
