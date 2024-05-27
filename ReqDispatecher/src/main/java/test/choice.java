package test;
import java.io.*;
import javax.servlet.annotation.*;
import javax.servlet.*;
@SuppressWarnings("serial")
@WebServlet("/choice")

public class choice extends GenericServlet {
	@Override
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException {
		String s1=req.getParameter("s1");
		if(s1.equals("add")){
			RequestDispatcher rd=req.getRequestDispatcher("ad");
			rd.forward(req,res);
		}
		else if(s1.equals("avg")){
			RequestDispatcher rd=req.getRequestDispatcher("ag");
			rd.forward(req,res);
		}
		else if(s1.equals("sub")){
			RequestDispatcher rd=req.getRequestDispatcher("sub");
			rd.forward(req,res);
		}
		else if(s1.equals("mul")) {
			RequestDispatcher rd=req.getRequestDispatcher("mul");
			rd.forward(req,res);

		}
		else if(s1.equals("greater")) {
			RequestDispatcher rd=req.getRequestDispatcher("greater");
			rd.forward(req,res);

		}
		
	}
	

}
