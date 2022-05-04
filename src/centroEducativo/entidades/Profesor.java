package centroEducativo.entidades;

public class Profesor {
	private int id, tipologiaSexo_id;
	private String nombre, apellido1, apellido2, dni, direccion, email, telefono;
	private byte[] imagen;

	/**
	 * 
	 */
	public Profesor() {
		super();
	}


	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param tipologiaSexo_id
	 * @param dni
	 * @param direccion
	 * @param email
	 * @param telefono
	 * @param imagen
	 */
	public Profesor(int id, String nombre, String apellido1, String apellido2, int tipologiaSexo_id, String dni,
			String direccion, String email, String telefono, byte[] imagen) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.tipologiaSexo_id = tipologiaSexo_id;
		this.dni = dni;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;
		this.imagen = imagen;
	}
	
	@Override
	public String toString() {
		return 	nombre + apellido1 + apellido2 + ".- " + dni + tipologiaSexo_id + direccion + email;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return the apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}
	
	/**
	 * @param apellido1 the apellido1 to set
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	/**
	 * @return the apellido2
	 */
	public String getApellido2() {
		return apellido2;
	}
	
	/**
	 * @param apellido2 the apellido2 to set
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	/**
	 * @return the tipologiaSexo_id
	 */
	public int getTipologiaSexo_id() {
		return tipologiaSexo_id;
	}

	/**
	 * @param tipologiaSexo_id the tipologiaSexo_id to set
	 */
	public void setTipologiaSexo_id(int tipologiaSexo_id) {
		this.tipologiaSexo_id = tipologiaSexo_id;
	}

	/**
	 * @return the imagen
	 */
	public byte[] getImagen() {
		return imagen;
	}
	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}
}
