package demo.persistence;

import com.cardiweb.generator.persistence.PersistenceGenerator;
import com.cardiweb.jdbcmetadata.Table;

import java.io.File;

public class BootstrapPersistenceGenerator extends PersistenceGenerator {

	@Override
	public boolean isDaoExtensible(Table t) {
		return true;
	}

	public boolean useTable(Table table) {
		return true;
	}

	@Override
	public boolean generateBiz(Table table) {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cardiweb.generator.persistence.PersistenceGenerator#useCache(com.
	 * cardiweb.jdbcmetadata.Table)
	 */
	@Override
	public boolean useCache(Table t) {
		return super.useCache(t);
	}

	@Override
	public File getSrcRoot() throws Exception {
		File root = new File(BootstrapPersistenceGenerator.class.getResource("/").getFile()).getParentFile().getParentFile();
		root = new File(root, "src/main/java");
		if (!root.exists() || !root.isDirectory()) {
			throw new Exception("Impossible de determiner ou generer les classes.");
		}

		return root;
	}

	public static void main(String[] args) throws Exception {

		BootstrapPersistenceGenerator generator = new BootstrapPersistenceGenerator();

		generator.setBasePackage("demo.persistence.beans");
		generator.setGeneratorPackage("demo.persistence");
		generator.setDb("com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1:3306/spring-boot-demo-bdd", "root", "");
		generator.generate();
	}


}
