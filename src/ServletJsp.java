

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/ServletApp")
public class ServletJsp extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public ServletJsp() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("uname");
		String city = request.getParameter("ucity");
		
		System.out.println("Your name is " + name + " and your city is " + city);
		System.out.println();
		
		response.sendRedirect("success.jsp");
	}

}
