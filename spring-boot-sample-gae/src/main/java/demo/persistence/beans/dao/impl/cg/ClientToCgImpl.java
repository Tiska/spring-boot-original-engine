package demo.persistence.beans.dao.impl.cg;

import com.cardiweb.generator.persistence.runtimev3.annotations.Constraint;
import com.cardiweb.generator.persistence.runtimev3.annotations.DBFieldInfos;
import com.cardiweb.generator.persistence.runtimev3.annotations.DBTableInfos;


/**
 * Cette classe est autogeneree par c-generator.<br/>
 *
 * @author c-generator (c) Cardiweb
 */
@DBTableInfos(name="CLIENT",daoClass=ClientDaoCgImpl.class)
public class ClientToCgImpl implements demo.persistence.beans.dao.IClientTo, java.io.Serializable {
	
	/**
	 * serialVersionUID genere d'apres le nom de la classe
	 */
	private static final long serialVersionUID = 1161L;
	
	private transient ClientDaoCgImpl _dao=null;
	protected ClientDaoCgImpl getDao() {
		if (_dao==null) {
			_dao = (ClientDaoCgImpl)demo.persistence.GeneratorRuntime.getGeneratorRuntime().getImplementation(demo.persistence.beans.dao.IClientDao.class);
		}
		return _dao;
	}
	
	private boolean _new = true;
	public boolean isNew() {
		return _new;
	}
	public void setNew(boolean b) {
		_new=b;
	}
	public boolean getNew() {
		return _new;
	}
	
	private String _cacheKey = null;
	/**
	 * Retourne une clee unique pour l'objet.
	 * @return une clee unique pour l'objet
	 */
	public String getCacheKey() {
		if (_cacheKey==null) {
			_cacheKey=getDao().getCacheKey(_id);
		}
		return _cacheKey;
	}
	
	/**
	 * Appele automatiquement a chaque sauvegarde ou lors de la suppression de l'objet.
	 * Par defaut, ne fait rien.
	 */
	public void clearLocalCache() {
	}
	
	/**
	 * @see Object#equals(Object obj)
	 */
	@Override
	public boolean equals(Object obj) {
		if(this.isNew()){
			return super.equals(obj);
		}
		return (obj!=null) && obj.getClass()==getClass() && ((demo.persistence.beans.dao.impl.cg.ClientToCgImpl)obj).getCacheKey().equals(getCacheKey());
	}

	/**
	 * @see Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return getCacheKey().hashCode();
	}

	private long _id = -1;
	/**
	 * Obtenir la valeur de la propriete id.
	 *
	 * @return la valeur de la propriete id
	 */

	@DBFieldInfos(name="ID")
	@Constraint(nullable=false,primary=true,primaryOrder=0,unique=true,fieldOrder=1)
	public long getId() {
		return _id;
	}
	/**
	 * Affecte la propriete id.
	 *
	 * @param id la valeur a affecter.
	 */
	public void setId(long id) {
		_id=id;
	}
	private String _nom = null;
	/**
	 * Obtenir la valeur de la propriete nom.
	 *
	 * @return la valeur de la propriete nom
	 */

	@DBFieldInfos(name="NOM")
	@Constraint(nullable=true,maxlength=45,primary=false,unique=false,fieldOrder=2)
	public String getNom() {
		return _nom;
	}
	/**
	 * Affecte la propriete nom.
	 *
	 * @param nom la valeur a affecter.
	 * @throws IllegalArgumentException si la valeur depasse nom.length() caracteres.
	 */
	public void setNom(String nom) {
		if (nom!=null && nom.length()>45) {
			throw new IllegalArgumentException("Le champ 'nom' ne doit pas faire plus de 45 caracteres. Impossible de l'affecter avec \""+nom+"\" ("+nom.length()+" caracteres).");
		}
		_nom=nom;
	}
	private String _prenom = null;
	/**
	 * Obtenir la valeur de la propriete prenom.
	 *
	 * @return la valeur de la propriete prenom
	 */

	@DBFieldInfos(name="PRENOM")
	@Constraint(nullable=true,maxlength=45,primary=false,unique=false,fieldOrder=3)
	public String getPrenom() {
		return _prenom;
	}
	/**
	 * Affecte la propriete prenom.
	 *
	 * @param prenom la valeur a affecter.
	 * @throws IllegalArgumentException si la valeur depasse prenom.length() caracteres.
	 */
	public void setPrenom(String prenom) {
		if (prenom!=null && prenom.length()>45) {
			throw new IllegalArgumentException("Le champ 'prenom' ne doit pas faire plus de 45 caracteres. Impossible de l'affecter avec \""+prenom+"\" ("+prenom.length()+" caracteres).");
		}
		_prenom=prenom;
	}
	
}
