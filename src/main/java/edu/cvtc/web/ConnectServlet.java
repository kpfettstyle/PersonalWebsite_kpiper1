package edu.cvtc.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConnectServlet
 */
@WebServlet("/connect")
public class ConnectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String target = "/thanks.jsp";
		
		final String firstName = request.getParameter("firstName");
		final String lastName = request.getParameter("lastName");
		final String email = request.getParameter("email");
		
		final User user = new User(firstName, lastName, email);
		
		if(firstName != null && !firstName.isEmpty()
				&& lastName != null && !lastName.isEmpty()
				&& email != null && !email.isEmpty()) {
			
			// TODO:  Insert the new User into the connection database.
			
		} else { // Did not pass validation
			target = "/index.jsp";
			final String message = "Please completly fill out the form.";
			request.setAttribute("message", message);
		}
		
		request.setAttribute("user", user);
		
		getServletContext().getRequestDispatcher(target).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
