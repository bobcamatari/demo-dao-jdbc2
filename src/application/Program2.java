package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao(); 
		
		System.out.println("=== TESTE 1: department insert ===");
		Department department = new Department(null, "Artes plasticas");
		depDao.insert(department);
		System.out.println("Nova inserção. ID: " + department.getId());

	}

}
