package curso.jenkins.ofertasapi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="ofertas")
public class Oferta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@NotBlank
	private String titulo;
	private String empresa;
	private int salario;
	
	public Oferta() {
		super();
	}
	
	public Oferta(int id, String titulo, String empresa, int salario) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.empresa = empresa;
		this.salario = salario;
	}
	

}
