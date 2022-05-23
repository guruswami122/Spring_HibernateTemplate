package SpringCore.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import SpringCore.Spring.EmployeeDao;

public class MainApplication 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("/SpringCore/Spring/applicationContext.xml");
        EmployeeDao dao=(EmployeeDao)context.getBean("employee");
        Employee e=new Employee();
        e.setId(1234);
        e.setName("Guruswami");  
        e.setSalary(5000);  
        dao.saveEmployee(e);
       System.out.println("Employee Details save sucessfully");
        
        
    }
}
