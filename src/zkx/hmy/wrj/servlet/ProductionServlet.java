package zkx.hmy.wrj.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zkx.hmy.wrj.controller.ProductionController;
import zkx.hmy.wrj.model.Meuble;
import zkx.hmy.wrj.model.Production;

/**
 * Servlet implementation class ProductionServlet
 */
@WebServlet("/ProductionServlet")
public class ProductionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductionServlet() {
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
		
        //System.out.println(request.getRequestURI());
		doGet(request, response);
		String nombreJoursString = request.getParameter("jour");
		int nombreJoursInteger = Integer.parseInt(nombreJoursString);
		String debutString = request.getParameter("debut");
		String finString = request.getParameter("fin");
		
		Production production = new Production();
		production.setNombreJours(nombreJoursInteger);
		production.setDateDebut(debutString);
		production.setDateFin(finString);
		List<Meuble> meubleList = new ArrayList<Meuble>();
		String[] str = request.getParameterValues("meuble");
		for(int i=0;i<str.length;i++){
			Meuble meubleTemp = new Meuble();
			meubleTemp.setIDMeuble(Integer.parseInt(str[i]));
			meubleList.add(meubleTemp);
		}
 		//System.out.println(production.getNombreJours()+" "+production.getDateDebut()+" "+production.getDateFin());
		production.setMeubleList(meubleList);
		ProductionController pController = new ProductionController();
		pController.addProduction(production);
		response.sendRedirect("index.jsp");
	}
	
	protected void doTest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("ok");
	}

}
