package javaInterface;

public class DaoExam {
	static void dbWork(DataAccessobject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {			
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
		
	/*DataAccessobject dao = new OracleDao();
	 * dbWork(dao);
	 * dao = new MysqlDao();
	 * dbWork(dao);
	 */
	}

}
