package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo05 {

	public static void main(String[] args) {
		// eliminar version 2 --> usando busqueda

		// --> JPA	
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		//empezo la transaccion
		em.getTransaction().begin();
		//proceso -- buscar usuario
		Usuario u = em.find(Usuario.class, 10);
		if(u==null)
			System.out.println("Codigo no existe");
		else {
			em.remove(u);
			System.out.println("Usuario eliminado");
		}
		em.remove(u);
		// confirmar la transaccion
		em.getTransaction().commit();
		em.close();	

	}

}
