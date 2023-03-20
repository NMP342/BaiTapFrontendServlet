package demoServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/background-random")
public class BackgroundRandom extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		resp.sendRedirect("background_random.html");
//		writer.println("<html><body style=\"background-image: linear-gradient(to right, #AF57E6, #B5FF96); color: white; text-align: center; font-size: 30px; letter-spacing: 30px\">\r\n"
//				+ "	<h1>BACKGROUND</h1>\r\n"
//				+ "	<h1>GENERATOR </h1><input type=\"color\" id=\"color1\" value=\"#AF57E6\">\r\n"
//				+ "		<input type=\"color\" id=\"color2\" value=\"#B5FF96\">\r\n"
//				+ "		<button onclick=\"colorrandom()\" type=\"button\">Random</button></body>\r\n"
//				+ "</html><script>\r\n"
//				+ "function colorrandom() {\r\n"
//				+ "	var letters = \"0123456789ABCDEF\";\r\n"
//				+ "	var color1 = \"#\";\r\n"
//				+ "	var color2 = \"#\"\r\n"
//				+ "	for (var i = 0; i < 6; i++) {\r\n"
//				+ "		color1 += letters[Math.floor(Math.random() * 16)];\r\n"
//				+ "		color2 += letters[Math.floor(Math.random() * 16)];\r\n"
//				+ "	}\r\n"
//				+ "	document.getElementById(\"color1\").value = color1;\r\n"
//				+ "	document.getElementById(\"color2\").value = color2;\r\n"
//				+ "	var gradient = \"linear-gradient(to right,\"+color1+\",\"+color2+\")\";\r\n"
//				+ "    document.body.style.backgroundImage = gradient;\r\n"
//				+ "\r\n"
//				+ "}\r\n"
//				+ "</script>");
		writer.close();
	}
}
