/* �ڷ���(Data Type ������ ũ��)
 *    �⺻�ڷ���:����char,����byte;int(���̾�);long,�Ǽ�float;double(���̾�),��boolean
 *    �����ڷ���(�ּ�,��ġ):�迭,Ŭ����,�������̽�11
 *    ex:int Seoul, Char a, a='A'.... 
 *    ù���ڰ� �빮�ڸ� Ŭ�����ٿ�
 *    
 *    ������ ������ �� �ڷ����� �����
 *    
 */  
public class Exam_02 {
	public static void main(String[] args) {
		char ch; //2��(byte)
		int jung; //4��
		double dou; //8��
		boolean bool; //1��
		
		ch='S'; //���Կ����� 1���ڴ���
		jung=345678; //��������
		dou = 3.141592; //�Ǽ�����
		bool=true; //true(��) ����
				
		System.out.println("char ch=" + ch);
		System.out.println("int jung=" + jung);
		System.out.println("double dou=" + dou);
		System.out.println("boolean bool=" + bool);
	}

}
