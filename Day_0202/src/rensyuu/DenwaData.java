package rensyuu;

import java.util.regex.Pattern;

/*
 * ��ȭ��ȣ�� �Է�
 * 010-1234-1234
 * end (��ҹ��� �������) ���� 
 * 
 * �˻����� ��  1�ڸ� �̻� �Է½� �� ���ù�ȣ�� ��µǾ� �Ѵ�
 * �����˻� 
 * ���ڸ��� �Է��ص� ��µǾ� ��.
 * 
 */
public class DenwaData {
	Denwa[] denwa;
	int cnt;
	
	DenwaData(){}
	
	DenwaData(Denwa[] denwa, int cnt){
		this.denwa = denwa;
		this.cnt = cnt;
	}
	
	void denwaPrint() {
		
	}
	
}