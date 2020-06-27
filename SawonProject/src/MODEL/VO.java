package MODEL;
/*
ENO //사원번호(숫자) 
HIREDATE //입사일(날자)
ENAME //사원이름(문자) 
SALARY //급여(숫자)
JOB //업무명(문자 
COMMISSION //커미션(숫자)
MANAGER //해당사원의 상사번호(숫자) 
DNO //부서번호(숫자)

//부서정보(DEPARTMENT)
DNO //부서번호(숫자)
DNAME //부서명(문자)
LOC //지역명(문자)

//급여정보(SALGRADE)
GRADE //급여등급(숫자)
LOSAL //급여하한값(숫자)
HISAL //급여상한값(숫자)

 */
public class VO {
	private int eno;
	private String ename;
	private String job;
	private int manager;
	private String hiredate;
	private String dname2;// 메니져를 위해 만듬
	private String dname;// 부서이름을 위해 만듬
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
