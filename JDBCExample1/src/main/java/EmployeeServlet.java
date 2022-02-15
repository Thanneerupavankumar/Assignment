

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int empid=Integer.parseInt(request.getParameter("txtempid"));
		String ename=request.getParameter("txtempname");
		double salary=Double.parseDouble(request.getParameter("txtsalary"));
		try {
		Connection con=DBConnection.getMyConnection();
		String str="Insert into employees (eid,ename,salary)values(???)";
		PreparedStatement ps=con.prepareStatement(str);
		ps.setInt(1, empid);
		ps.setString(2,ename);
		ps.setDouble(3, salary);
		int ans=ps.executeUpdate();
		PrintWriter out=response.getWriter();
		if(ans>0)
			out.println("Record inserted");
		else
			out.println("Record not inserted");
		con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
