package MODEL;
/*
ENO //�����ȣ(����) 
HIREDATE //�Ի���(����)
ENAME //����̸�(����) 
SALARY //�޿�(����)
JOB //������(���� 
COMMISSION //Ŀ�̼�(����)
MANAGER //�ش����� ����ȣ(����) 
DNO //�μ���ȣ(����)

//�μ�����(DEPARTMENT)
DNO //�μ���ȣ(����)
DNAME //�μ���(����)
LOC //������(����)

//�޿�����(SALGRADE)
GRADE //�޿����(����)
LOSAL //�޿����Ѱ�(����)
HISAL //�޿����Ѱ�(����)

 */
public class VO {
	private int eno;
	private String ename;
	private String job;
	private int manager;
	private String hiredate;
	private String dname2;// �޴����� ���� ����
	private String dname;// �μ��̸��� ���� ����
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDname2() {
		return dname2;
	}
	public void setDname2(String dname2) {
		this.dname2 = dname2;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getManager() {
		return manager;
	}
	public void setManager(int manager) {
		this.manager = manager;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	private int salary;
	private int commission;
	private int dno;
	
}
