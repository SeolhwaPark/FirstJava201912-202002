
public class Exam_02 {
	public static void main(String[] args) {
		String str = "AAAAA";
		String str2 = new String ("AAAAA");
		StringBuffer sb = new StringBuffer();//������ ũ�� ��������,�⺻ũ�� 16��
		StringBuffer sb2 = new StringBuffer(20);//������ ũ�� ��������,�⺻ũ�� 16��
		sb.append("AAAAA");
		sb.append("AAAAABBBBBBBBBBBBBBBb");
		sb.append("AAAAABBBBBBBBBBBbbBBBCCCCCCCCCCCCCCCCCCCCCc");
		System.out.println(sb);
		System.out.println("sb =" + sb.capacity());
		System.out.println("sb =" + sb.length());
		/*
AAAAAAAAAABBBBBBBBBBBBBBBbAAAAABBBBBBBBBBBbbBBBCCCCCCCCCCCCCCCCCCCCCc
sb =70
sb =69
		 */
		//System.out.println("sb =" + sb.capacity());//capacity���������� ũ��		
		//System.out.println("sb2 =" + sb2.length());
		//System.out.println("sb2 =" + sb2.capacity()); //16�� �þ
		
		
	}

}
