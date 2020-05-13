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
		
		System.out.println("\n=== TESTE 2: department update ===");
		int id = 6;
		department = depDao.findById(id);
		department.setName("Vegan");
		depDao.update(department);
		System.out.println("Update completed");
		

	}

}
