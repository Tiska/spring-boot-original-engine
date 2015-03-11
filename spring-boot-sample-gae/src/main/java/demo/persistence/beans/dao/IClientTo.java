package demo.persistence.beans.dao;

/**
 * Cette interface est autogeneree par c-generator.<br/>
 *
 * @author c-generator (c) Cardiweb
 */
public interface IClientTo extends java.io.Serializable {
	
	
	/**
	 * Obtenir la valeur de la propriete id.
	 *
	 * @return la valeur de la propriete id
	 */
	public long getId();
	
	/**
	 * Affecte la propriete id.
	 *
	 * @param id la valeur a affecter.
	 */
	public void setId(long id);
	
	/**
	 * Obtenir la valeur de la propriete nom.
	 *
	 * @return la valeur de la propriete nom
	 */
	public String getNom();
	
	/**
	 * Affecte la propriete nom.
	 *
	 * @param nom la valeur a affecter.
	 */
	public void setNom(String nom);
	
	/**
	 * Obtenir la valeur de la propriete prenom.
	 *
	 * @return la valeur de la propriete prenom
	 */
	public String getPrenom();
	
	/**
	 * Affecte la propriete prenom.
	 *
	 * @param prenom la valeur a affecter.
	 */
	public void setPrenom(String prenom);
	
	public boolean isNew();
	
	public void setNew(boolean _new);
	
	
}
