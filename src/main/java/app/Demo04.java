package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo04 {

	public static void main(String[] args) {
		// obtener los datos de un usuario, segun el codigo
		
		// --> JPA	
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		//empezo la transaccion
		em.getTransaction().begin();
		//proceso -- buscar usuario
		Usuario u = em.find(Usuario.class, 5);
        System.out.println(u);
		// confirmar la transaccion
		em.getTransaction().commit();
		em.close();		

	}

}
