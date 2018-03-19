package zkx.hmy.wrj.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import zkx.hmy.wrj.controller.MeubleController;
import zkx.hmy.wrj.model.Employe;
import zkx.hmy.wrj.model.Meuble;

/**
 * Servlet implementation class MeubleServlet
 */
@WebServlet("/MeubleServlet")
public class MeubleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MeubleServlet() {
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
		String typeString = request.getParameter("type");
		String[] materielsStringArray = request.getParameterValues("materiels");
		String tempString = request.getParameter("tempsparlot");
		int tempInteger = Integer.parseInt(tempString);
		String materielString="";
		for(int i=0;i<materielsStringArray.length;i++){
				materielString+=materielsStringArray[i];
				materielString+="/";
		}
		materielString=materielString.substring(0, materielString.length()-1);

		
		Meuble meuble = new Meuble();
		meuble.setType(typeString);
		meuble.setMateriels(materielString);
		meuble.setTempsParLot(tempInteger);
		
		List<Employe> employeList = new ArrayList<Employe>();
		String[] str = request.getParameterValues("employe");
		for(int i=0;i<str.length;i++){
			Employe employeTemp = new Employe();
			employeTemp.setIDEmploye(Integer.parseInt(str[i]));
			employeList.add(employeTemp);
		}
		meuble.setEmployeList(employeList);
		MeubleController mController = new MeubleController();
		mController.addMeuble(meuble);
		response.sendRedirect("index.jsp");
	}

}
