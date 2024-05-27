package test;
import java.io.*;
import javax.servlet.annotation.*;
import javax.servlet.*;
@SuppressWarnings("serial")
@WebServlet("/av")
public class avg extends GenericServlet{
	@Override
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
		int v1=Integer.parseInt(req.getParameter("v1"));
		int v2=Integer.parseInt(req.getParameter("v2"));
		float v3 = (float)(v1+v2)/2;
		PrintWriter pw=res.getWriter();
		
		res.setContentType("text/html");
		pw.println("avg="+v3+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("input.html");
		rd.include(req, res);
		
		
	}
	

}