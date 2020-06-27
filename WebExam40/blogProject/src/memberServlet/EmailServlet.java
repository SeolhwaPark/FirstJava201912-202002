package memberServlet;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/email_check")
public class EmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmailServlet() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getSession().invalidate();
		// 인증 번호 생성기
		StringBuffer temp = new StringBuffer();
		Random rnd = new Random();
		for (int i = 0; i < 10; i++) {
			int rIndex = rnd.nextInt(3);
			switch (rIndex) {
			case 0:
				// a-z
				temp.append((char) ((int) (rnd.nextInt(26)) + 97));
				break;
			case 1:
				// A-Z
				temp.append((char) ((int) (rnd.nextInt(26)) + 65));
				break;
			case 2:
				// 0-9
				temp.append((rnd.nextInt(10)));
				break;
			}
		}
		String impass = temp.toString();

		// 네이버일 경우 smtp.naver.com 을 입력합니다.
		// Google일 경우 smtp.gmail.com 을 입력합니다.
		String host = "smtp.naver.com";

		final String username = "yunholove731"; // 네이버 아이디를 입력해주세요. @nave.com은 입력하지 마시구요.
		final String password = "77kawamura"; // 네이버 이메일 비밀번호를 입력해주세요.
		int port = 465; // 포트번호
		// 메일 내용
		String recipient = "yunholove731@naver.com"; // 받는 사람의 메일주소를 입력해주세요.
		String subject = "메일테스트";
		// 메일 제목 입력해주세요.
		String body = "임시 비밀번호는 " + impass + "입니다."; // 메일 내용 입력해주세요.
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
																								// .CC(참조) .BCC(숨은참조) 도
																								// 있음
			mimeMessage.setSubject(subject); // 제목셋팅
			mimeMessage.setText(body); // 내용셋팅
			Transport.send(mimeMessage); // javax.mail.Transport.send() 이용

			request.getSession().setAttribute("impass", impass);
		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("member/email.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int row = 0;
		String certifyCode = request.getParameter("certifyCode");
		if (request.getSession().getAttribute("impass").equals(certifyCode)) {
			row = 1;
		}
		request.setAttribute("row", row);
		RequestDispatcher dispatcher = request.getRequestDispatcher("member/email.jsp");
		dispatcher.forward(request, response);
	}
}
