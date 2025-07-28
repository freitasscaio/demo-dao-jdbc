package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("=== TEST 1: department findAll ===");
		
		
		
		/*
		 * System.out.println("=== TEST 1: department insert ==="); Department dep = new
		 * Department(null, "Food"); departmentDao.insert(dep);
		 * System.out.println("Inserted! New id = " + dep.getId());
		 */

		
		
		
		/*
		 * System.out.println("=== TEST 2: department update ==="); Department dep =
		 * departmentDao.findById(2); dep.setName("Picture"); departmentDao.update(dep);
		 * System.out.println("Update completed!");
		 */

		sc.close();

	}

}
