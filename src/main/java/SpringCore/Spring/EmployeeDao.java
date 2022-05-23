package SpringCore.Spring;

import org.springframework.orm.hibernate4.HibernateTemplate;

public class EmployeeDao {
	
	HibernateTemplate template; 
	
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	public void saveEmployee(Employee e) {
		template.save(e);
	}

}
