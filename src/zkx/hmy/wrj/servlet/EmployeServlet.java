package zkx.hmy.wrj.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zkx.hmy.wrj.controller.EmployeController;

import zkx.hmy.wrj.model.Employe;

/**
 * Servlet implementation class EmployeServlet
 */
@WebServlet("/EmployeServlet")
public class EmployeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//System.out.println(request.getParameter("Nom"));
		String nomString = request.getParameter("Nom");
		String prenomString = request.getParameter("Prenom");
		String heureString = request.getParameter("HeureDeTravail");
		int heureInt = Integer.parseInt(heureString);
		String telString = request.getParameter("Tel");
		Employe employe = new Employe();
		employe.setNom(nomString);
		employe.setPrenom(prenomString);
		employe.setHeureDeTravail(heureInt);
		employe.setNumeroTelephone(telString);
		
		//System.out.println(nomString+" "+prenomString+" "+heureString+" "+telString);
		EmployeController emController = new EmployeController();
		emController.addEmploye(employe);
		response.sendRedirect("index.jsp");
		
	}

}
