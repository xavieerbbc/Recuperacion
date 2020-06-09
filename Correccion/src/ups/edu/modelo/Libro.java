package ups.edu.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Libro
 *
 */
@Entity

public class Libro implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	private int codigo;
	@Column(name = "ISBN", unique = true, nullable = false)
	private String ISBN;
	private int numPaginas;
	@OneToMany(cascade= CascadeType.ALL, mappedBy = "libro")
	private List<Capitulo> capitulos; 
	
	
	
	public Libro() {
		super();
	}
   
}
