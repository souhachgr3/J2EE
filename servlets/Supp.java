

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class Supp
 */
@WebServlet("/Supp")
public class Supp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Supp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idParam = Integer.parseInt(request.getParameter("id"));
		ArrayList<Etudiant> list = Ajouter.list;
        for (int i = 0; i < list.size(); i++) {
            Etudiant etudiant = list.get(i);
            if (etudiant.getId() == idParam) {
                list.remove(i);
                
                break; 
            }
        }
        response.sendRedirect(request.getContextPath() + "/Ajouter");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        doGet(request, response);
	}

}
