package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;



/*@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString*/
@Data
@Entity
@Table(name="tb_proveedor")
public class Proveedor {

	@Id
	private int idprovedor;
	
	@Column(name="nombre_rs")
	private String nombreProveedor;
	
	@Column(name="telefono")
	private String telefProveedor;
	
	@Column(name="email")
	private String emailProveedor;
}
