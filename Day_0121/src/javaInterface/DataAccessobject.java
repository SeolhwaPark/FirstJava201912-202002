package javaInterface;
/*
 * DaoExamŬ������ main�޼ҵ忡�� dbwork�޼ҵ带 ȣ���Ҷ� OracleDao�� MysqlDao��ü�� 
 * �Ű������� �ְ� ȣ���ߴ�.
 * 
 * dbWork()�޼ҵ�� �� ��ü�� ��� �Ű� ������ �ޱ� ���� DataAccessObject Ÿ���� �Ű�������
 * ������ �ִ�.
 * 
 * ���� ����� ���� DataAccessObject �������̽��� OracleDao, MysqlDao ���� Ŭ������ �ۼ�
 * 
 * �Ф�..
 */
public interface DataAccessobject {
	public void select();
	public void insert();
	public void update();
	public void delete();
	
}
