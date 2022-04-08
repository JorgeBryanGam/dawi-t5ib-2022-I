package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Data;



@Data
@Entity
@Table(name="tb_productos")
public class Producto {

	@Id
	@Column(name = "id_prod")
	private String codigo;
	
	@Column(name="des_prod")
	private String descripcion;
	
	@Column(name="stk_prod")
	private int stock;
	
	@Column(name="pre_prod")
	private double precio;
	
	@ManyToOne
	@JoinColumn(name="idcategoria",insertable = false, updatable = false)
	private Categoria categoria;
	

	private int idcategoria;
	
	@Column(name="est_prod")
	private int estado;
	
	@ManyToOne
	@JoinColumn(name="idprovedor",insertable = false, updatable = false)
	private Proveedor proveedor;
	
    
	private int idprovedor;



	//------------------
	/*
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", stock=" + stock + ", precio=" + precio
				+ ", codigoCategoria=" + codigoCategoria + "]";
	}
	
	//--------------------

	
	public Producto(String codigo, String descripcion, int stock, double precio, int codigoCategoria, int estado, int codigoProvedor) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.stock = stock;
		this.precio = precio;
		this.codigoCategoria = codigoCategoria;
		this.estado = estado;
		this.codigoProvedor = codigoProvedor;

	}


	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//--------------------

	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(int codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getCodigoProvedor() {
		return codigoProvedor;
	}

	public void setCodigoProvedor(int codigoProvedor) {
		this.codigoProvedor = codigoProvedor;
	}
	*/

	

	
	
}
