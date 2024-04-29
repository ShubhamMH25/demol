

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FullName")
public class FullName extends HttpServlet {
private static final long serialVersionUID = 1L;
       
    
    public FullName() {
        super();
        System.out.println("FullName.FullName()");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			                                                         throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String funame=fname+" "+lname;
		out.print("Full Name is::"+funame);
				
	}


}
