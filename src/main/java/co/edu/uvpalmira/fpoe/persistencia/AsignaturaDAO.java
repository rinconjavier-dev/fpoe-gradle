/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uvpalmira.fpoe.persistencia;

import co.edu.uvpalmira.fpoe.jpalib.AbstractDAO;
import co.edu.uvpalmira.fpoe.modelo.Asignatura;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java.util.List;

/**
 *
 * @author Javier A. Rincón L.
 */


public class AsignaturaDAO extends AbstractDAO<Asignatura> {

    public AsignaturaDAO(EntityManagerFactory emf) {
        super(Asignatura.class, emf);
    } 
    
    
    // Devuelve la asignatura con el mismo codigo.
    public Asignatura buscarPorCodigo (String codigo) {
        EntityManager em = super.getEntityManager();     
        return (Asignatura) em.createNamedQuery ("Asignatura.buscarPorCodigo")
                .setParameter("codigo", codigo)
                .getSingleResult();
    }
    
    
    // Devuelve lista de objetos de tipo asignatura. Ej: FPOE
    public List<Asignatura> buscarPorEscuela (String codigoEscuela) {
        EntityManager em = super.getEntityManager();     
        return em.createNamedQuery ("Asignatura.buscarPorEscuela")
                .setParameter("prefijo", codigoEscuela)
                .getResultList();
    }
    
}
