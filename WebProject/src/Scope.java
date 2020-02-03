

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Scope
 */
@WebServlet("/Scope")
public class Scope extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Scope() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		
		request.setAttribute("Username", uname.toUpperCase());
		request.setAttribute("Password",pass.concat("check"));
		
		HttpSession session =  request.getSession();
		session.setAttribute("Username", uname.toUpperCase());
		session.setAttribute("Password",pass.concat("check"));


		
		ServletContext context =  this.getServletContext();
		context.setAttribute("Username", uname.toUpperCase());
		context.setAttribute("Password",pass.concat("check"));
			
			
	}

}
