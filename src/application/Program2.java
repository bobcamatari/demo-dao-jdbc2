package application;

import java.util.List;

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
		
		System.out.println("\n=== TESTE 3: department deleteByID ===");
		id = 7;
		depDao.deleteByID(id);
		System.out.println("Deleted");
		
		System.out.println("\n=== TESTE 4: department findByID ===");
		id = 3;
		department = depDao.findById(id);
		System.out.println(department);
		
		System.out.println("\n=== TESTE 5: department findAll ===");
		List<Department> list = depDao.findAll();
		for (Department obj: list) {
			System.out.println(obj);
		}

	}

}
