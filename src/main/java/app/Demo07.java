package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Categoria;
import model.Usuario;

public class Demo07 {

	public static void main(String[] args) {
		// listado de usuarios
		
		// --> JPA	
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		
		// select * from tb_usuarios where idtipo = 1
		TypedQuery<Categoria> consulta = em.createQuery("select a from Categoria a where a.tipo = :xtipo",Categoria.class);
		consulta.setParameter("xtipo", 2);
		List<Categoria> lstUsuarios = consulta.getResultList();
		
		for (Categoria u : lstUsuarios) {
			System.out.println(u);
		}
		
		em.close();	

	}

}
