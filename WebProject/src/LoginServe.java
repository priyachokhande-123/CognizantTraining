

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServe
 */
@WebServlet("/LoginServe")
public class LoginServe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer=response.getWriter();
		
		String uname=request.getParameter("uname");
	String pass=request.getParameter("pass");
	if(uname.equals("Priya")&& pass.equals("123"))
	{
		this.getServletContext().getRequestDispatcher("/welcome.html").forward(request, response);
		//response.sendRedirect("welcome.jsp");
		/*
		writer.write("<h1>Congratulations</h1>" );

		writer.write("<h1>You have successfully login</h1>" );*/
	}
	else
	{

		response.sendRedirect("error.html");
	//	writer.write("<h1>Invalid credentials</h1>");
	}
	
	/*
	if(uname.equals("Priya")&& pass.equals("123"))
	{
		
		writer.write("<h1>Congratulations</h1>" );

		writer.write("<h1>You have successfully login</h1>" );
	}
	else
	{

	
	writer.write("<h1>Invalid credentials</h1>");
	}
	*/
	}

}
