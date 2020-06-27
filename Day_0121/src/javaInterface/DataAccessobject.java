package javaInterface;
/*
 * DaoExam클래스의 main메소드에서 dbwork메소드를 호출할때 OracleDao와 MysqlDao객체를 
 * 매개값으로 주고 호출했다.
 * 
 * dbWork()메소드는 두 객체를 모두 매개 값으로 받기 위해 DataAccessObject 타입의 매개변수를
 * 가지고 있다.
 * 
 * 실행 결과를 보고 DataAccessObject 인터페이스와 OracleDao, MysqlDao 구현 클래스를 작성
 * 
 * ㅠㅠ..
 */
public interface DataAccessobject {
	public void select();
	public void insert();
	public void update();
	public void delete();
	
}
