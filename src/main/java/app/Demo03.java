package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo03 {

	public static void main(String[] args) {
		//eliminar un usuario
		
		
		// --> JPA	
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		//empezo la transaccion
		em.getTransaction().begin();
		//proceso -- eliminar usuario
		//Forma 1. borrado logico --> no lo borras, solo cambias algun estado, flag
		
		//Forma 2. borrado fisico --> borrar
		Usuario u = new Usuario(10, "Juan", "Perez","Jperez@gmail.com", "345", "2000/01/15", 1, 1);
		em.remove(u);
		// confirmar la transaccion
		em.getTransaction().commit();
		em.close();
	}

}
