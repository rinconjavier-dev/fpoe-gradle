/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.uvpalmira.fpoe.logica;
import co.edu.uvpalmira.fpoe.jpalib.NonexistentEntityException;
import co.edu.uvpalmira.fpoe.modelo.Asignatura;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

/**
 *
 * @author Javier A. Rincón L.
 */

/**
 *
 * Interfaz (interface) es un archivo directo de la carpeta Java 
 * y en este se definen los métodos, pero no se implementan.
 * Es de cierta forma un nombramiento puntual.
 *
 */


public interface ILogica {

    public void crearAsignatura(Asignatura asignatura) throws SQLIntegrityConstraintViolationException, Exception;
    public void modificarAsignatura(Asignatura asignatura) throws NonexistentEntityException, Exception;

    public Asignatura buscarAsignatura(String codigo);
    public List<Asignatura> buscarAsignaturas();

    public void guardar(Asignatura asignatura);
    
    

}
