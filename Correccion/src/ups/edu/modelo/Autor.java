package ups.edu.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Autor
 *
 */
@Entity

public class Autor implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nombre;
	private String nacionalidad;

	@OneToOne(mappedBy = "autor")
	private Capitulo capitulo;
	
		
	public Autor() {
		super();
	}
   
}
