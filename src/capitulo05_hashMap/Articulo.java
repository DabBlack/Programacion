package capitulo05_hashMap;

public class Articulo {

	public int numeroDeEstante, cantidadUnidadesStock;
	public String codigoDeBarras;
	
	
	/**
	 * 
	 */
	public Articulo() {
		super();
	}


	/**
	 * @param numeroDeEstante
	 * @param cantidadUnidadesStock
	 * @param codigoDeBarras
	 */
	public Articulo(int numeroDeEstante, int cantidadUnidadesStock, String codigoDeBarras) {
		super();
		this.numeroDeEstante = numeroDeEstante;
		this.cantidadUnidadesStock = cantidadUnidadesStock;
		this.codigoDeBarras = codigoDeBarras;
	}


	@Override
	public String toString() {
		return "Articulo [numeroDeEstante=" + numeroDeEstante + ", cantidadUnidadesStock=" + cantidadUnidadesStock
				+ ", codigoDeBarras=" + codigoDeBarras + "]";
	}


	/**
	 * @return the numeroDeEstante
	 */
	public int getNumeroDeEstante() {
		return numeroDeEstante;
	}


	/**
	 * @param numeroDeEstante the numeroDeEstante to set
	 */
	public void setNumeroDeEstante(int numeroDeEstante) {
		this.numeroDeEstante = numeroDeEstante;
	}


	/**
	 * @return the cantidadUnidadesStock
	 */
	public int getCantidadUnidadesStock() {
		return cantidadUnidadesStock;
	}


	/**
	 * @param cantidadUnidadesStock the cantidadUnidadesStock to set
	 */
	public void setCantidadUnidadesStock(int cantidadUnidadesStock) {
		this.cantidadUnidadesStock = cantidadUnidadesStock;
	}


	/**
	 * @return the codigoDeBarras
	 */
	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}


	/**
	 * @param codigoDeBarras the codigoDeBarras to set
	 */
	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}
	
}
	