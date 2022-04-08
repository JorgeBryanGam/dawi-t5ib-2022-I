package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Categoria;
import model.Usuario;

public class Login {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();

		// select * from tb_usuarios where idtipo = 1
		Query consulta = em.createNativeQuery("{call usp_validaAcceso(:usuario,:clave)}", Usuario.class);
		consulta.setParameter("usuario", 2);
		consulta.setParameter("clave", 2);

		Usuario u = (Usuario) consulta.getSingleResult();

		if (u == null) {
			System.err.println("usuario o clave incorrecto");
		} else {
			System.out.println("Bienvenido...");
		}

		em.close();


	}
}


