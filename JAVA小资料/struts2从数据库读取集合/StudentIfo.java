package student;
import com.opensymphony.xwork2.ActionSupport;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class StudentIfo extends ActionSupport{
	public List<Student>students;
	public List<Student>getStudents(){
		return students;
	}
	
	
    	public String execute() throws Exception {
    		students=new ArrayList<Student>();
    		DbBean db=new DbBean();
    		String sql = "select * from student" ;
    		ResultSet rs=db.executeQuery ( sql );
    		
    		while(rs.next()){
    			Student student=new Student();
    			student.setSname(rs.getString(1));
    			System.out.println(rs.getString(1));
    			student.setSsex(rs.getString(2));
    			student.setSage(rs.getString(3));
    			student.setSbirth(rs.getString(4));
    			student.setSmajor(rs.getString(5));
    			student.setSid(rs.getString(6));
    			student.setSclass(rs.getString(7));
    			students.add(student);
    		}
    		
    		rs.close();
    		
    		
    		db.close(); 
    		return SUCCESS;
    	}
}

