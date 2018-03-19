package zkx.hmy.wrj.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;
import zkx.hmy.wrj.controller.UtilisateurController;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		//doGet(request, response);
		boolean redirect=false;
		String roleSelect=request.getParameter("select");
		//System.out.println(roleSelect);
		String nomString= request.getParameter("uid");
		String mdpString = request.getParameter("pwd");
		
		UtilisateurController uController = new UtilisateurController();
		List uList=uController.getUtilisateurList();
		for(int i=0;i<uList.size();i++){
			Object[] objects = (Object[])uList.get(i);
			if(roleSelect.equals(objects[3])){
				//System.out.println("admin");
				if((nomString.equals(objects[1]))&&(mdpString.equals(objects[2]))){
					//System.out.println("ok");
					redirect=true;
				}
			}
		}	
		if(redirect==true){
			response.sendRedirect("index.jsp");
		}
		
	}

}
