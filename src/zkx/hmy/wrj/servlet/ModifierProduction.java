package zkx.hmy.wrj.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zkx.hmy.wrj.controller.ProductionController;
import zkx.hmy.wrj.model.Meuble;
import zkx.hmy.wrj.model.Production;

/**
 * Servlet implementation class ModifierProduction
 */
@WebServlet("/ModifierProduction")
public class ModifierProduction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierProduction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//String idproduction=request.getParameter("idpro");
		//System.out.println(idproduction);
		
		String idproduction=request.getParameter("idpro");
		int idInteger=Integer.parseInt(idproduction);
		String nombreJoursString = request.getParameter("jour");
		int nombreJoursInteger = Integer.parseInt(nombreJoursString);
		String debutString = request.getParameter("debut");
		String finString = request.getParameter("fin");
		List<Meuble> meubleList = new ArrayList<Meuble>();
		String[] str = request.getParameterValues("meuble");
		for(int i=0;i<str.length;i++){
			Meuble meubleTemp = new Meuble();
			meubleTemp.setIDMeuble(Integer.parseInt(str[i]));
			meubleList.add(meubleTemp);
		}
 		ProductionController pController = new ProductionController();
		pController.updateProduction(idInteger, nombreJoursInteger, debutString, finString, meubleList);
		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
