package demo.persistence.beans.dao;
import com.cardiweb.generator.persistence.runtimev3.QueryColumn;

/**
 * Cette interface est autogeneree par c-generator.<br/>
 *
 * @author c-generator (c) Cardiweb
 */
interface IClientDaoDefault {
	
	public demo.persistence.beans.dao.IClientTo getById(long id);

	public demo.persistence.beans.dao.IClientTo getClient(long id);

	public void save(demo.persistence.beans.dao.IClientTo Client);
	public void delete(demo.persistence.beans.dao.IClientTo Client);
	public demo.persistence.beans.dao.IClientTo create();
	public void copy(demo.persistence.beans.dao.IClientTo src, demo.persistence.beans.dao.IClientTo dest);

	public java.util.List<IClientTo> getList();


	/**
	 * Retourne un persistence query permettant de faire des recherche sur la classe demo.persistence.beans.dao.IClientTo
	 * @return un persistence query permettant de faire des recherche sur la classe demo.persistence.beans.dao.IClientTo
	 */
	public com.cardiweb.generator.persistence.runtimev3.PersistenceQuery<demo.persistence.beans.dao.IClientTo> newQuery();
	/**
	 * Retourne un persistence query permettant de faire des recherche sur la classe demo.persistence.beans.dao.IClientTo dans une sous-requête
	 * @param queryParent requête parente de la sous-requête
	 * @return un persistence query permettant de faire des recherche sur la classe demo.persistence.beans.dao.IClientTo dans une sous-requête
	 */
	public com.cardiweb.generator.persistence.runtimev3.PersistenceQuery<demo.persistence.beans.dao.IClientTo> newSubQuery(com.cardiweb.generator.persistence.runtimev3.PersistenceQuery<?> queryParent);
	
	/**
	 * Retourne les colonnes pour faire les requetes la table Client.<br>
	 * Méthode à usage générique, utilisez getClientColumns() pour éviter les confusions
	 * @return CLIENT_COLUMNS colonnes pour faire les requetes la table Client
	 */
	public CLIENT_COLUMNS getColumns();
	
	/**
	 * Retourne les colonnes pour faire les requetes la table Client
	 * @return CLIENT_COLUMNS colonnes pour faire les requetes la table Client
	 */
	public CLIENT_COLUMNS getClientColumns();
	
	/**
	 * Retourne le nom de la table.
	 * @return String le nom de la table
	 */
	public String getTableName();
	
	public static interface CLIENT_COLUMNS {
		/**
		 * colonne ID (propriete id) a utiliser dans les requetes.
		 * @return QueryColumn
		 */
		public QueryColumn getId();
		/**
		 * colonne ID (propriete id) aggregee par la fonction min() a utiliser dans les requetes.
		 * @return QueryColumn
		 */
		public QueryColumn getIdMIN();
		/**
		 * colonne ID (propriete id) aggregee par la fonction max') a utiliser dans les requetes.
		 * @return QueryColumn
		 */
		public QueryColumn getIdMAX();
		/**
		 * colonne ID (propriete id) aggregee par la fonction count() a utiliser dans les requetes.
		 * @return QueryColumn
		 */
		public QueryColumn getIdCOUNT();
		/**
		 * colonne ID (propriete id) aggregee par la fonction sum() a utiliser dans les requetes.
		 * @return QueryColumn
		 */
		public QueryColumn getIdSUM();
		/**
		 * Objet representant la colonne ID (propriete id) aggregee par la fonction avg() a utiliser dans les requetes.
		 * @return QueryColumn
		 */
		public QueryColumn getIdAVG();
		/**
		 * colonne NOM (propriete nom) a utiliser dans les requetes.
		 * @return QueryColumn
		 */
		public QueryColumn getNom();
		/**
		 * colonne NOM (propriete nom) aggregee par la fonction min() a utiliser dans les requetes.
		 * @return QueryColumn
		 */
		public QueryColumn getNomMIN();
		/**
		 * colonne NOM (propriete nom) aggregee par la fonction max') a utiliser dans les requetes.
		 * @return QueryColumn
		 */
		public QueryColumn getNomMAX();
		/**
		 * colonne NOM (propriete nom) aggregee par la fonction count() a utiliser dans les requetes.
		 * @return QueryColumn
		 */
		public QueryColumn getNomCOUNT();
		/**
		 * Objet representant la colonne NOM (propriete nom) a utiliser dans les requetes.
		 * @return QueryColumn
		 */
		public QueryColumn getNomUPPER();
		/**
		 * Objet representant la colonne NOM (propriete nom) aggregee par la fonction isnull() a utiliser dans les requetes.
		 * @return QueryColumn
		 */
		public QueryColumn getNomISNULL();
		/**
		 * colonne PRENOM (propriete prenom) a utiliser dans les requetes.
		 * @return QueryColumn
		 */
		public QueryColumn getPrenom();
		/**
		 * colonne PRENOM (propriete prenom) aggregee par la fonction min() a utiliser dans les requetes.
		 * @return QueryColumn
		 */
		public QueryColumn getPrenomMIN();
		/**
		 * colonne PRENOM (propriete prenom) aggregee par la fonction max') a utiliser dans les requetes.
		 * @return QueryColumn
		 */
		public QueryColumn getPrenomMAX();
		/**
		 * colonne PRENOM (propriete prenom) aggregee par la fonction count() a utiliser dans les requetes.
		 * @return QueryColumn
		 */
		public QueryColumn getPrenomCOUNT();
		/**
		 * Objet representant la colonne PRENOM (propriete prenom) a utiliser dans les requetes.
		 * @return QueryColumn
		 */
		public QueryColumn getPrenomUPPER();
		/**
		 * Objet representant la colonne PRENOM (propriete prenom) aggregee par la fonction isnull() a utiliser dans les requetes.
		 * @return QueryColumn
		 */
		public QueryColumn getPrenomISNULL();
	}
	
}
