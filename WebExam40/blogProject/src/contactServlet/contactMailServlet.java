package contactServlet;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/contact_email")
public class contactMailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public contactMailServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		ServletContext context = getServletContext();
		String path = context.getRealPath("upload"); // 서버상의 경로
		String encType = "UTF-8";
		int maxSize = 2 * 1024 * 1024;

		MultipartRequest multi = new MultipartRequest(request, path, maxSize, encType, new DefaultFileRenamePolicy());

		String name = multi.getParameter("name"); // 일반적인 텍스트 받는법
		String email = multi.getParameter("email"); // 일반적인 텍스트 받는법
		String subject = multi.getParameter("subject"); // 일반적인 텍스트 받는법
		String contents = multi.getParameter("contents"); // 일반적인 텍스트 받는법
		String fotoname = multi.getFilesystemName("fotoname"); // 파일의 이름만 DB에 저장하는 방법

		String host = "smtp.naver.com";

		final String username = "yunholove731"; // 네이버 아이디를 입력해주세요. @nave.com은 입력하지 마시구요.
		final String password = "77kawamura"; // 네이버 이메일 비밀번호를 입력해주세요.
		int port = 465; // 포트번호
		// 메일 내용
		String recipient = "yunholove731@naver.com"; // 받는 사람의 메일주소를 입력해주세요.
		// 메일 제목 입력해주세요.
		String image = "http://localhost:8089/blogProject/upload/" + fotoname;
		if(fotoname == null) {
			image = "첨부파일 없음";
		}
		
		//메일에 직접 보내지게 될 내용
		String body = "문의자 : " + name + "\n이메일주소 : " + email + "\n문의 제목 : "+ subject 
				+"\n문의 내용 : " + contents + "\n첨부된 이미지주소 : " + image ; // 메일 내용 입력해주세요.
		
		Properties props = System.getProperties(); // 정보를 담기 위한 객체 생성
		
		// SMTP 서버 정보 설정
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", port);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.ssl.trust", host);
		
		// Session 생성
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			String un = username;
			String pw = password;

			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(un, pw);
			}
		});
		session.setDebug(true); // for debug
		try {
			Message mimeMessage = new MimeMessage(session); // MimeMessage 생성
			mimeMessage.setFrom(new InternetAddress("yunholove731@naver.com")); // 발신자 셋팅 , 보내는 사람의 이메일주소를 한번 더 입력합니다.
																				// 이때는 이메일 풀 주소를 다 작성해주세요.
			mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient)); // 수신자셋팅 //.TO 외에
																								// .CC(참조) .BCC(숨은참조)도 있음
			mimeMessage.setSubject(subject); // 제목셋팅
			mimeMessage.setText(body); // 내용셋팅
			Transport.send(mimeMessage); // javax.mail.Transport.send() 이용

			
			request.setAttribute("row", 1);
			RequestDispatcher dispatcher = request.getRequestDispatcher("contact/check.jsp");
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			
			request.setAttribute("row", 0);
			RequestDispatcher dispatcher = request.getRequestDispatcher("contact/check.jsp");
			dispatcher.forward(request, response);
		}
	}
}
