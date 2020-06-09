package ups.edu.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Capitulo
 *
 */
@Entity

public class Capitulo implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private int numero;
	private String titulo;
	@ManyToOne
	@JoinColumn
	private Libro libro;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Autor autor;
	
	
	
	
	public Capitulo() {
		super();
	}
   
}
