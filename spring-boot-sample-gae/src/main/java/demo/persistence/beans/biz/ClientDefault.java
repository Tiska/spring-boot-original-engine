package demo.persistence.beans.biz;

import org.apache.log4j.Logger;

/**
 * Cette classe est autogeneree par c-generator.<br/>
 *
 * @author c-generator (c) Cardiweb
 */
public abstract class ClientDefault {
	
	static  final Logger logger = Logger.getLogger(ClientDefault.class);
	
	protected ClientDefault() {
	}
	protected demo.persistence.beans.dao.IClientTo _to = null;
	protected static Client create(demo.persistence.beans.dao.IClientTo to) {
		if (to==null) {
			return null;
		}
		Client retour = new Client();
		retour._to=to;
		return retour;
	}
	
	protected static com.cardiweb.generator.persistence.runtimev3.GeneratorRuntime _generatorRuntime = null;
	protected static  com.cardiweb.generator.persistence.runtimev3.GeneratorRuntime getGeneratorRuntime() {
		if (_generatorRuntime==null) {
			_generatorRuntime=demo.persistence.GeneratorRuntime.getGeneratorRuntime();
		}
		return _generatorRuntime;
	}
	
	private static demo.persistence.beans.dao.IClientDao _dao = null;
	protected static demo.persistence.beans.dao.IClientDao getDao() {
		if (_dao==null) {
			_dao = getGeneratorRuntime().getImplementation(demo.persistence.beans.dao.IClientDao.class);
		}
		return _dao;
	}
	
	public static Client getById(long id) {
		return getClient(id);
	}
	
	public static Client getClient(long id) {
		return create(getDao().getById(id));
	}
	
	public void delete() {
		getDao().delete(_to);
	}
	
	public void save() {
		getDao().save(_to);
	}
	
	public static Client create() {
		Client retour = create(getDao().create());
		retour.init();
		return retour;
	}
	
	/**
	 * Permet d'initialiser un bean à sa création, lors de l'appel à create() en static.<br>
	 * A surcharger si besoin.
	 */
	protected void init() {
	}
	
	public static class ClientLazyListLoader extends com.cardiweb.clazylist.LazyListListLoader<Client, demo.persistence.beans.dao.IClientTo>{
		public ClientLazyListLoader(java.util.List<demo.persistence.beans.dao.IClientTo> source) {
			super(source);
		}
		
		@Override
		public Client adapt(demo.persistence.beans.dao.IClientTo to) {
			return Client.create(to);
		}
	}
	
	/**
	 * Transforme une liste de To en une liste d'objets business en autorisant l'appel à toArray()
	 */
	protected static java.util.List<Client> toBizList(java.util.List<demo.persistence.beans.dao.IClientTo> source) {
		return new com.cardiweb.clazylist.LazyList<Client>(new ClientLazyListLoader(source), true);
	}
	
	public static java.util.List<Client> getList() {
		return new com.cardiweb.clazylist.LazyList<Client>(new ClientLazyListLoader(getDao().getList()));
	}
	
	
	private boolean isCopy = false;
	private demo.persistence.beans.dao.IClientTo getTo(boolean read) {
		if (isCopy || _to.isNew() || read) {
			return _to;
		}
		demo.persistence.beans.dao.IClientTo copy = getDao().create();
		getDao().copy(_to, copy);
		_to=copy;
		isCopy=true;
		return _to;
	}
	
	
	/**
	 * Obtenir la valeur de la propriete id.
	 *
	 * @return la valeur de la propriete id
	 */
	public long getId() {
		return getTo(true).getId();
	}
	/**
	 * Affecte la propriete id.
	 *
	 * @param id la valeur a affecter.
	 */
	public void setId(long id) {
		getTo(false).setId(id);
	}
	
	/**
	 * Obtenir la valeur de la propriete nom.
	 *
	 * @return la valeur de la propriete nom
	 */
	public String getNom() {
		return getTo(true).getNom();
	}
	/**
	 * Affecte la propriete nom.
	 *
	 * @param nom la valeur a affecter.
	 */
	public void setNom(String nom) {
		getTo(false).setNom(nom);
	}
	
	/**
	 * Obtenir la valeur de la propriete prenom.
	 *
	 * @return la valeur de la propriete prenom
	 */
	public String getPrenom() {
		return getTo(true).getPrenom();
	}
	/**
	 * Affecte la propriete prenom.
	 *
	 * @param prenom la valeur a affecter.
	 */
	public void setPrenom(String prenom) {
		getTo(false).setPrenom(prenom);
	}
	
	public boolean isNew() {
		return _to.isNew();
	}
	
	public void setNew(boolean _new) {
		_to.setNew(_new);
	}
	
	/**
	 * Copie une entité vers l'objet courant.
	 * Les blobs sont copiés mais pas les attributs clés.
	 * @param to L'entité que l'on veut copier vers l'objet courant
	 */
	public void copyFrom(ClientDefault to) {
		setNom(to.getNom());
		setPrenom(to.getPrenom());
	}
	
	/**
	 * Retourne une copie du biz, prête à être enregistrée en BD.
	 */
	public Client getCopy() {
		Client copy = Client.create();
		copy.copyFrom(this);
		return copy;
	}
	
	
}
