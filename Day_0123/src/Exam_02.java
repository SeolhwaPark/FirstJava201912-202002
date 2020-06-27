
public class Exam_02 {
	public static void main(String[] args) {
		String str = "AAAAA";
		String str2 = new String ("AAAAA");
		StringBuffer sb = new StringBuffer();//버퍼의 크기 지정가능,기본크기 16자
		StringBuffer sb2 = new StringBuffer(20);//버퍼의 크기 지정가능,기본크기 16자
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
		//System.out.println("sb =" + sb.capacity());//capacity실제공간의 크기		
		//System.out.println("sb2 =" + sb2.length());
		//System.out.println("sb2 =" + sb2.capacity()); //16씩 늘어남
		
		
	}

}
