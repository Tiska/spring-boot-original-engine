package demo.persistence.beans.dao.impl.cg;

import com.cardiweb.generator.persistence.runtimev3.*;
import com.cardiweb.generator.persistence.runtimev3.impl.jdbc.JDBCPersistenceQuery;
import com.cardiweb.generator.persistence.runtimev3.impl.jdbc.JDBCQueryColumn;
import com.cardiweb.generator.persistence.runtimev3.impl.jdbc.JDBCQueryColumn.JDBCFunction;
import com.cardiweb.generator.persistence.runtimev3.impl.jdbc.JDBCTableAlias;
import demo.persistence.beans.dao.IClientDao;
import demo.persistence.beans.dao.IClientTo;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Cette classe est autogeneree par c-generator.<br/>
 *
 * @author c-generator (c) Cardiweb
 */
public abstract class ClientDaoCgImplDefault implements IClientDao {
	
	static protected final Logger logger = Logger.getLogger(ClientDaoCgImplDefault.class);
	
	public ClientDaoCgImplDefault() {
	}
	
	private com.cardiweb.generator.persistence.runtimev3.GeneratorRuntime _generatorRuntime = null;
	public com.cardiweb.generator.persistence.runtimev3.GeneratorRuntime getGeneratorRuntime() {
		return _generatorRuntime;
	}
	public void setGeneratorRuntime(com.cardiweb.generator.persistence.runtimev3.GeneratorRuntime runtime) {
		this._generatorRuntime=runtime;
		initSchema();
	}

	/************************************************************
	Section liee au CACHE.
	Fournit les methodes necessaires a la gestion d'un cache
	En fournissant une implementation de cache differente dans
	le GeneratorRuntime, on peut, par exemple, gerer une
	expiration des objets.
	 ************************************************************/

	/**
	 * Obtenir l'objet gerant le cache liee a cette classe.
	 * @return l'objet gerant le cache liee a cette classe
	 */
	public Cache getCache() {
		return getGeneratorRuntime().getCache("demo.persistence.beans.dao.IClientTo");
	}

	/**
	 * Cette methode permet de regarder dans le cache si cet objet existe deja.<br/>
	 * Si oui, c'est l'objet dans le cache qui est retourne.<br/>
	 * Si non, c'est l'objet passe en parametre qui est retourne.<br/>
	 * @param object l'objet dont il faut tester la presence dans le cache.
	 * @return si l'objet est deja dans le cache, la version en cache. Sinon, l'objet en parametre.
	 * @throws NullPointerException si object est null.
	 */
	protected demo.persistence.beans.dao.impl.cg.ClientToCgImpl selectCacheObject(demo.persistence.beans.dao.impl.cg.ClientToCgImpl object) {
		String key = object.getCacheKey();
		Object cacheValue=getCache().getByKey(key);
		if (cacheValue==null || cacheValue==com.cardiweb.generator.persistence.runtimev3.GeneratorRuntime.getNotFound()) {
			getCache().putByKey(key, object);
			return object;
		}
		return (demo.persistence.beans.dao.impl.cg.ClientToCgImpl)cacheValue;
	}

	/**
	 * Cette methode genere une clee chaine unique dependant des arguments.<br/>
	 * Actuellement, elle ne fait que concatener les clees et retourner une chaine.<br/>
	 * @param id la valeur pour id
	 * @return Une chaine representant de facon unique les parametres.
	 */
	protected String getCacheKey(long id) {
		return "demo.persistence.beans.dao.impl.cg.Client_"+id;
	}
	protected String _TABLE_SCHEMA = null;
	protected String _TABLE_NAME = "CLIENT";
	protected String _TABLE_FULL_NAME = null;
	protected static String _FIELD_ID = "ID";
	protected static String _FIELD_NOM = "NOM";
	protected static String _FIELD_PRENOM = "PRENOM";

	private void initSchema() {
		String s = null;
		s = getGeneratorRuntime().getStringProperty("c-generator.demo.persistence.Client.table_name");
		if (s!=null) {
			_TABLE_NAME = s;
		}
		s = getGeneratorRuntime().getStringProperty("c-generator.demo.persistence.Client.table_alias");
		if (s!=null) {
			ALIAS.setAlias(s);
		}
		s = getGeneratorRuntime().getStringProperty("c-generator.demo.persistence.Client.schema_name");
		if (s==null) {
			s = getGeneratorRuntime().getStringProperty("c-generator.demo.persistence.schema_name");
		}
		if (s!=null) {
			_TABLE_SCHEMA =  "null".equals(s)?null:s;
		}
		_TABLE_FULL_NAME = (_TABLE_SCHEMA==null?"":(_TABLE_SCHEMA+"."))+ "" + _TABLE_NAME + "";
		ALIAS.init(_TABLE_FULL_NAME);

		s = getGeneratorRuntime().getStringProperty("c-generator.demo.persistence.Client.id.column_name");
		if (s!=null) {
			_FIELD_ID = s;
		}
		s = getGeneratorRuntime().getStringProperty("c-generator.demo.persistence.Client.nom.column_name");
		if (s!=null) {
			_FIELD_NOM = s;
		}
		s = getGeneratorRuntime().getStringProperty("c-generator.demo.persistence.Client.prenom.column_name");
		if (s!=null) {
			_FIELD_PRENOM = s;
		}

		initDeleteQuery();
		initSaveQuery();
	}

	/**
	 * Objet representant un alias de la table CLIENT.
	 **/
	public static final TableAlias<IClientTo> ALIAS = new JDBCTableAlias<IClientTo>(demo.persistence.beans.dao.IClientTo.class, "CLIENT", "CLIENT");
	/**
	 * Retourne les colonnes pour faire les requetes la table Client.<br>
	 * Méthode à usage générique, utilisez getClientColumns() pour éviter les confusions
	 * @return CLIENT_COLUMNS colonnes pour faire les requetes la table Client
	 */
	public IClientDao.CLIENT_COLUMNS getColumns() {
		return getClientColumns();
	}
	/**
	 * Retourne le nom de la table.
	 * @return String le nom de la table
	 */
	public String getTableName() {
		return _TABLE_NAME;
	}
	/**
	 * Classe regroupant les colonnes/fonctions disponibles pour les requetes.
	 * @author c-generator (c) Cardiweb
	 * @Deprecated utiliser la methode getClientColumns() pour eviter de recupere des colonnes qui sont mal initialisees
	 **/
	@Deprecated
	public static interface CLIENT_COLUMNS extends IClientDao.CLIENT_COLUMNS{
		/**
		 * Objet representant la colonne ID (propriete id) a utiliser dans les requetes.
		 */
		@Deprecated
		public static final QueryColumn id = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "id", _FIELD_ID, null, long.class);
		/**
		 * Objet representant la colonne ID (propriete id) aggregee par la fonction min() a utiliser dans les requetes.
		 */
		@Deprecated
		public static final QueryColumn idMIN = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "id", _FIELD_ID, JDBCFunction.MIN, long.class);
		/**
		 * Objet representant la colonne ID (propriete id) aggregee par la fonction max') a utiliser dans les requetes.
		 */
		@Deprecated
		public static final QueryColumn idMAX = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "id", _FIELD_ID, JDBCFunction.MAX, long.class);
		/**
		 * Objet representant la colonne ID (propriete id) aggregee par la fonction count() a utiliser dans les requetes.
		 */
		@Deprecated
		public static final QueryColumn idCOUNT = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "id", _FIELD_ID, JDBCFunction.COUNT, long.class);
		/**
		 * Objet representant la colonne ID (propriete id) aggregee par la fonction sum() a utiliser dans les requetes.
		 */
		@Deprecated
		public static final QueryColumn idSUM = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "id", _FIELD_ID, JDBCFunction.SUM, long.class);
		/**
		 * Objet representant la colonne ID (propriete id) aggregee par la fonction avg() a utiliser dans les requetes.
		 */
		@Deprecated
		public static final QueryColumn idAVG = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "id", _FIELD_ID, JDBCFunction.AVG, long.class);
		/**
		 * Objet representant la colonne NOM (propriete nom) a utiliser dans les requetes.
		 */
		@Deprecated
		public static final QueryColumn nom = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "nom", _FIELD_NOM, null, String.class);
		/**
		 * Objet representant la colonne NOM (propriete nom) aggregee par la fonction min() a utiliser dans les requetes.
		 */
		@Deprecated
		public static final QueryColumn nomMIN = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "nom", _FIELD_NOM, JDBCFunction.MIN, String.class);
		/**
		 * Objet representant la colonne NOM (propriete nom) aggregee par la fonction max') a utiliser dans les requetes.
		 */
		@Deprecated
		public static final QueryColumn nomMAX = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "nom", _FIELD_NOM, JDBCFunction.MAX, String.class);
		/**
		 * Objet representant la colonne NOM (propriete nom) aggregee par la fonction count() a utiliser dans les requetes.
		 */
		@Deprecated
		public static final QueryColumn nomCOUNT = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "nom", _FIELD_NOM, JDBCFunction.COUNT, String.class);
		/**
		 * Objet representant la colonne NOM (propriete nom) a utiliser dans les requetes.
		 */
		@Deprecated
		public static final QueryColumn nomUPPER = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "nom", _FIELD_NOM, JDBCFunction.UPPER, String.class);
		/**
		 * Objet representant la colonne PRENOM (propriete prenom) a utiliser dans les requetes.
		 */
		@Deprecated
		public static final QueryColumn prenom = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "prenom", _FIELD_PRENOM, null, String.class);
		/**
		 * Objet representant la colonne PRENOM (propriete prenom) aggregee par la fonction min() a utiliser dans les requetes.
		 */
		@Deprecated
		public static final QueryColumn prenomMIN = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "prenom", _FIELD_PRENOM, JDBCFunction.MIN, String.class);
		/**
		 * Objet representant la colonne PRENOM (propriete prenom) aggregee par la fonction max') a utiliser dans les requetes.
		 */
		@Deprecated
		public static final QueryColumn prenomMAX = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "prenom", _FIELD_PRENOM, JDBCFunction.MAX, String.class);
		/**
		 * Objet representant la colonne PRENOM (propriete prenom) aggregee par la fonction count() a utiliser dans les requetes.
		 */
		@Deprecated
		public static final QueryColumn prenomCOUNT = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "prenom", _FIELD_PRENOM, JDBCFunction.COUNT, String.class);
		/**
		 * Objet representant la colonne PRENOM (propriete prenom) a utiliser dans les requetes.
		 */
		@Deprecated
		public static final QueryColumn prenomUPPER = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "prenom", _FIELD_PRENOM, JDBCFunction.UPPER, String.class);
	}
	private IClientDao.CLIENT_COLUMNS columns = null;
	/**
	 * Recupere les colonnes/fonctions disponibles pour les requetes.
	 * @author c-generator (c) Cardiweb
	 **/
	public IClientDao.CLIENT_COLUMNS getClientColumns(){
		if (columns == null) {
			IClientDao.CLIENT_COLUMNS temp = new CLIENT_COLUMNS() {
				private QueryColumn columnId = null;
				public QueryColumn getId(){
					if( columnId == null ){
						columnId = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "id", _FIELD_ID, null, long.class);
					}
					return columnId;
				}
				private QueryColumn columnIdMIN = null;
				public QueryColumn getIdMIN(){
					if( columnIdMIN == null ){
						columnIdMIN = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "id", _FIELD_ID, JDBCFunction.MIN, long.class);
					}
					return columnIdMIN;
				}
				private QueryColumn columnIdMAX = null;
				public QueryColumn getIdMAX(){
					if( columnIdMAX == null ){
						columnIdMAX = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "id", _FIELD_ID, JDBCFunction.MAX, long.class);
					}
					return columnIdMAX;
				}
				private QueryColumn columnIdCOUNT = null;
				public QueryColumn getIdCOUNT(){
					if( columnIdCOUNT == null ){
						columnIdCOUNT = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "id", _FIELD_ID, JDBCFunction.COUNT, long.class);
					}
					return columnIdCOUNT;
				}
				private QueryColumn columnIdSUM = null;
				public QueryColumn getIdSUM(){
					if( columnIdSUM == null ){
						columnIdSUM = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "id", _FIELD_ID, JDBCFunction.SUM, long.class);
					}
					return columnIdSUM;
				}
				private QueryColumn columnIdAVG = null;
				public QueryColumn getIdAVG(){
					if( columnIdAVG == null ){
						columnIdAVG = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "id", _FIELD_ID, JDBCFunction.AVG, long.class);
					}
					return columnIdAVG;
				}
				private QueryColumn columnNom = null;
				public QueryColumn getNom(){
					if( columnNom == null ){
						columnNom = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "nom", _FIELD_NOM, null, String.class);
					}
					return columnNom;
				}
				private QueryColumn columnNomMIN = null;
				public QueryColumn getNomMIN(){
					if( columnNomMIN == null ){
						columnNomMIN = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "nom", _FIELD_NOM, JDBCFunction.MIN, String.class);
					}
					return columnNomMIN;
				}
				private QueryColumn columnNomMAX = null;
				public QueryColumn getNomMAX(){
					if( columnNomMAX == null ){
						columnNomMAX = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "nom", _FIELD_NOM, JDBCFunction.MAX, String.class);
					}
					return columnNomMAX;
				}
				private QueryColumn columnNomCOUNT = null;
				public QueryColumn getNomCOUNT(){
					if( columnNomCOUNT == null ){
						columnNomCOUNT = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "nom", _FIELD_NOM, JDBCFunction.COUNT, String.class);
					}
					return columnNomCOUNT;
				}
				private QueryColumn columnNomUPPER = null;
				public QueryColumn getNomUPPER(){
					if( columnNomUPPER == null ){
						columnNomUPPER = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "nom", _FIELD_NOM, JDBCFunction.UPPER, String.class);
					}
					return columnNomUPPER;
				}
				private QueryColumn columnNomISNULL = null;
				public QueryColumn getNomISNULL(){
					if( columnNomISNULL == null ){
						columnNomISNULL = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "nom", _FIELD_NOM, JDBCFunction.ISNULL, String.class);
					}
					return columnNomISNULL;
				}
				private QueryColumn columnPrenom = null;
				public QueryColumn getPrenom(){
					if( columnPrenom == null ){
						columnPrenom = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "prenom", _FIELD_PRENOM, null, String.class);
					}
					return columnPrenom;
				}
				private QueryColumn columnPrenomMIN = null;
				public QueryColumn getPrenomMIN(){
					if( columnPrenomMIN == null ){
						columnPrenomMIN = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "prenom", _FIELD_PRENOM, JDBCFunction.MIN, String.class);
					}
					return columnPrenomMIN;
				}
				private QueryColumn columnPrenomMAX = null;
				public QueryColumn getPrenomMAX(){
					if( columnPrenomMAX == null ){
						columnPrenomMAX = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "prenom", _FIELD_PRENOM, JDBCFunction.MAX, String.class);
					}
					return columnPrenomMAX;
				}
				private QueryColumn columnPrenomCOUNT = null;
				public QueryColumn getPrenomCOUNT(){
					if( columnPrenomCOUNT == null ){
						columnPrenomCOUNT = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "prenom", _FIELD_PRENOM, JDBCFunction.COUNT, String.class);
					}
					return columnPrenomCOUNT;
				}
				private QueryColumn columnPrenomUPPER = null;
				public QueryColumn getPrenomUPPER(){
					if( columnPrenomUPPER == null ){
						columnPrenomUPPER = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "prenom", _FIELD_PRENOM, JDBCFunction.UPPER, String.class);
					}
					return columnPrenomUPPER;
				}
				private QueryColumn columnPrenomISNULL = null;
				public QueryColumn getPrenomISNULL(){
					if( columnPrenomISNULL == null ){
						columnPrenomISNULL = new JDBCQueryColumn((JDBCTableAlias<?>)ALIAS, "prenom", _FIELD_PRENOM, JDBCFunction.ISNULL, String.class);
					}
					return columnPrenomISNULL;
				}
			};
			columns = temp;
		}
		return columns;
	}
	/**
	 * Retourne un persistence query permettant de faire des recherche sur la classe demo.persistence.beans.dao.IClientTo
	 * @return un persistence query permettant de faire des recherche sur la classe demo.persistence.beans.dao.IClientTo
	 */
	public PersistenceQuery<IClientTo> newQuery() {
		return new PersistenceQueryClientVersion((demo.persistence.beans.dao.impl.cg.ClientDaoCgImpl)this);
	}

	/**
	 * Retourne un persistence query permettant de faire des recherche sur la classe demo.persistence.beans.dao.IClientTo dans une sous-requête
	 * @param parentQuery requête parente de la sous-requête
	 * @return un persistence query permettant de faire des recherche sur la classe demo.persistence.beans.dao.IClientTo dans une sous-requête
	 */
	public PersistenceQuery<IClientTo> newSubQuery(PersistenceQuery<?> parentQuery) {
		return new PersistenceQueryClientVersion((demo.persistence.beans.dao.impl.cg.ClientDaoCgImpl)this, parentQuery);
	}

	private static class PersistenceQueryClientVersion extends JDBCPersistenceQuery<IClientTo> {
		private demo.persistence.beans.dao.impl.cg.ClientDaoCgImpl _dao;
		/**
		 * Constructeur pour ce PersistenceQuery.
		 *
		 * @param dao
		 */
		public PersistenceQueryClientVersion(demo.persistence.beans.dao.impl.cg.ClientDaoCgImpl dao) {
			super(ALIAS, true);
			_dao=dao;
			init();
		}

		/**
		 * Construire une sous-requête pour ce PersistenceQuery.
		 *
		 * @param dao
		 * @param parentQuery
		 */
		public PersistenceQueryClientVersion(demo.persistence.beans.dao.impl.cg.ClientDaoCgImpl dao, PersistenceQuery<?> parentQuery) {
			super(ALIAS, true, parentQuery);
			_dao=dao;
			init();
		}

		@Override
		protected GeneratorRuntime getGeneratorRuntime() {
			return _dao.getGeneratorRuntime();
		}

		@Override
		protected demo.persistence.beans.dao.IClientTo loadObjectFromRS(ResultSet rs) {

			try {

				String ___key = null;
				Object cacheValue = null;
				if (useCache) {
					long id = rs.getLong(_FIELD_ID);
					___key = _dao.getCacheKey(id);
					cacheValue = _dao.getCache().getByKey(___key);
				}
				if (cacheValue==null || cacheValue==com.cardiweb.generator.persistence.runtimev3.GeneratorRuntime.getNotFound()) {

					demo.persistence.beans.dao.impl.cg.ClientToCgImpl object = (demo.persistence.beans.dao.impl.cg.ClientToCgImpl)_dao.create();
					object.setNew(false);
					object.setId(rs.getLong(_FIELD_ID));
					rs.getObject("NOM");
					// On affecte pas quand rs.wasNull() car vaut la valeur par defaut
					if (!rs.wasNull()) {
						object.setNom(rs.getString(_FIELD_NOM));
					}
					rs.getObject("PRENOM");
					// On affecte pas quand rs.wasNull() car vaut la valeur par defaut
					if (!rs.wasNull()) {
						object.setPrenom(rs.getString(_FIELD_PRENOM));
					}

					if (useCache) { _dao.getCache().putByKey(___key, object); }
					return object;
				}
				return (demo.persistence.beans.dao.IClientTo)cacheValue;
			} catch (SQLException sqle) {
				throw new PersistenceException("", sqle);
			}
		}

		private static List<String> primaryKeyColumnList = new java.util.ArrayList<String>();
		static {
			List<String> l = new java.util.ArrayList<String>();
			l.add(_FIELD_ID);
			primaryKeyColumnList=l;
		}
		@Override
		protected List<String> getPrimaryKeyColumnList() {
			return primaryKeyColumnList;
		}
	}

	protected void fillSQLPrimaryParameters(int offset, PreparedStatement pst,demo.persistence.beans.dao.IClientTo obj) throws SQLException {
		// visibilite 'protected' afin de pouvoir etre utilise par les blobs.
		pst.setLong(0+offset, obj.getId());
	}

	/**
	 * Methode de generation de la propriete id.<br/>
	 * Cette methode ne doit rien affecter mais simplement renvoyer la valeur.<br/>
	 * @return une id genere pour la propriete id de l'objet en cours.
	 */
	protected long generateSpecificIdForId() {
		return getGeneratorRuntime().generateLongId();
	}
	public demo.persistence.beans.dao.IClientTo getById(long id) {
		return getClient(id);
	}

	/**
	 * Getter principal : retourne l'objet Client en fonction de sa clee.
	 * @param id la valeur de la clee id
	 * @return l'objet correspondant a la clee ou null si aucun objet n'a ete trouve.
	 */
	public demo.persistence.beans.dao.IClientTo getClient(long id) {

		String ___key = getCacheKey(id);
		Object retour = getCache().getByKey(___key);
		if (retour==com.cardiweb.generator.persistence.runtimev3.GeneratorRuntime.getNotFound()) {
			return null;
		} else
		if (retour==null) {
			synchronized(getCache()) {
				retour = getCache().getByKey(___key);
				if (retour==com.cardiweb.generator.persistence.runtimev3.GeneratorRuntime.getNotFound()) {
					return null;
				} else
				if (retour==null) {
					retour = newQuery().equal(CLIENT_COLUMNS.id, id).getObject();
					if (retour==null) {
						getCache().putByKey(___key, com.cardiweb.generator.persistence.runtimev3.GeneratorRuntime.getNotFound());
					} else {
						getCache().putByKey(___key, retour);
					}
				}
			}
		}
		return (demo.persistence.beans.dao.IClientTo)retour;
	}
	private void initSaveQuery() {


		INSERT_QUERY = "insert into "+_TABLE_FULL_NAME+" ("+_FIELD_NOM+","+_FIELD_PRENOM+","+_FIELD_ID+") values (?,?,?)";
		UPDATE_QUERY = "update "+_TABLE_FULL_NAME+" set "+_FIELD_NOM+"=?,"+_FIELD_PRENOM+"=? where "+_FIELD_ID+"=?";
	}

	private String INSERT_QUERY;
	private String UPDATE_QUERY;
	public void save(demo.persistence.beans.dao.IClientTo _obj) {
		if (_obj==null) {
			throw new IllegalArgumentException("obj : null");
		}
		demo.persistence.beans.dao.impl.cg.ClientToCgImpl obj = (demo.persistence.beans.dao.impl.cg.ClientToCgImpl)_obj;

		try {
			String query=obj.isNew()?INSERT_QUERY:UPDATE_QUERY;
			if (query!=null) {
				if (obj.isNew()) { generateIds(obj); }
				Connection c = getGeneratorRuntime().getConnection();
				PreparedStatement pst = null;
				try {
					pst = c.prepareStatement(query);
					if (obj.getNom()==null) { pst.setNull(1 , 12);} else { pst.setString(1, obj.getNom());}
					if (obj.getPrenom()==null) { pst.setNull(2 , 12);} else { pst.setString(2, obj.getPrenom());}
					fillSQLPrimaryParameters(3, pst, obj);
					pst.executeUpdate();
				} finally {
					if (pst!=null) try { pst.close(); } catch (Exception e) { logger.error("", e); }
					getGeneratorRuntime().freeConnection(c);
				}
			}
			if (obj.isNew()) {
				getCache().putByKey(obj.getCacheKey(), obj);
			} else {
				getCache().removeByKey(obj.getCacheKey());
				getCache().putByKey(obj.getCacheKey(), obj);
			}
			clearListCache();
			obj.setNew(false);
			obj.clearLocalCache();
		} catch (Exception e) {
			throw new RuntimeException("Erreur lors de la sauvegarde de l'objet "+obj.getCacheKey(), e);
		}
	}

	private JDBCPersistenceQuery<IClientTo> _cachePersistenceQuery;
	public void clearListCache() {
		if (_cachePersistenceQuery==null) {
			_cachePersistenceQuery = (JDBCPersistenceQuery<IClientTo>)newQuery();
		}
		_cachePersistenceQuery.clearListCache(demo.persistence.beans.dao.IClientTo.class);
	}

	/**
	 * Cette methode genere toutes les valeurs pour les clee qui n'ont pas encore
	 * ete affectees.
	 *
	 * @param obj
	 */
	protected void generateIds(demo.persistence.beans.dao.impl.cg.ClientToCgImpl obj) {
		if (obj.getId()==-1) {
			obj.setId(generateSpecificIdForId());
		}
	}
	private String DELETE_QUERY;
	private void initDeleteQuery() {


		DELETE_QUERY="delete from "+_TABLE_FULL_NAME+" where "+_FIELD_ID+"=?";

	}

	public void delete(demo.persistence.beans.dao.IClientTo _obj) {

		if (_obj==null) {
			throw new IllegalArgumentException("obj : null");
		}

		demo.persistence.beans.dao.impl.cg.ClientToCgImpl obj = (demo.persistence.beans.dao.impl.cg.ClientToCgImpl)_obj;

		try {
			Connection c = getGeneratorRuntime().getConnection();
			PreparedStatement pst = null;
			try {
				pst = c.prepareStatement(DELETE_QUERY);
				fillSQLPrimaryParameters(1, pst, obj);
				pst.executeUpdate();
			} finally {
				if (pst!=null) try { pst.close(); } catch (Exception e) { logger.error("", e); }
				getGeneratorRuntime().freeConnection(c);
			}

			getCache().removeByKey(obj.getCacheKey());
			obj.clearLocalCache();
			clearListCache();
		} catch (Exception e) {
			throw new RuntimeException("Erreur lors de la suppression de l'objet "+obj.getCacheKey(), e);
		}
	}
	public demo.persistence.beans.dao.IClientTo create() {
		return new demo.persistence.beans.dao.impl.cg.ClientToCgImpl();
	}
	/**
	 * Retourne la liste de tous les objets en base de donnee.
	 * @return la liste de tous les objets en base de donnee.
	 */
	public List<IClientTo> getList() {
		return newQuery().getList();
	}
	
	/**
	 * TOUTES les proprietes de l'objet sont source sont copiees dans l'objet destination
	 * MEME les blobs (les references des blobs)...
	 * @param src L'objet source depuis lequel copier les proprietes
	 * @param dest L'objet vers lequel copier les proprietes
	 */
	public void copy(demo.persistence.beans.dao.IClientTo src, demo.persistence.beans.dao.IClientTo dest) {
		dest.setId(src.getId());
		dest.setNom(src.getNom());
		dest.setPrenom(src.getPrenom());
		
		dest.setNew(src.isNew());
	}
	
}
