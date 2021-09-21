package com.example.dao;

import com.example.model.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOMemoryImpl implements EmployeeDAO {

    // not thread-safe
    private Employee[] employeeArray = new Employee[10];

    // package level access
    EmployeeDAOMemoryImpl() {
    }

    // Add an Employee record
    public void add(Employee emp) throws DAOException {
        try {
            if(employeeArray[emp.getId()]!=null) {
                throw new DAOException("員工已存在,加入失敗!");
            }        
            employeeArray[emp.getId()] = emp;
        } catch(ArrayIndexOutOfBoundsException ae){
            throw new DAOException("新增失敗! 員工編號需小於"+employeeArray.length);
        }
    }

    // Update an employee record
    public void update(Employee emp) throws DAOException {
        try {
            if(employeeArray[emp.getId()]==null) {
                throw new DAOException("編號"+emp.getId()+"員工不存在,更新失敗!");
            }        
            employeeArray[emp.getId()] = emp;
        } catch(ArrayIndexOutOfBoundsException ae){
            throw new DAOException("更新失敗! 員工編號需小於"+employeeArray.length);
        }
    }

    // Delete an employee record that has this ID
    public void delete(int id) throws DAOException{        
        try {
            if(employeeArray[id]==null) {
                throw new DAOException("編號"+id+"員工不存在,刪除失敗!");
            }        
            employeeArray[id] = null;
        } catch(ArrayIndexOutOfBoundsException ae){
            throw new DAOException("刪除失敗! 員工編號需小於"+employeeArray.length);
        }
    }

    // Find an Employee record using this ID
    public Employee findById(int id) throws DAOException{
        try {
            return employeeArray[id];
        } catch(ArrayIndexOutOfBoundsException ae){
            throw new DAOException("查詢失敗! 員工編號需小於"+employeeArray.length);
        }
    }

    // Return an array of all of the Employee records
    // We are using a collection List object to store the results
    // This makes it easier to just add to the collection
    public Employee[] getAllEmployees() {
        List<Employee> emps = new ArrayList<>();
        // Iterate through the memory array and find Employee objects
        for (Employee e : employeeArray) {
            if (e != null) {
                emps.add(e);
            }
        }
        return emps.toArray(new Employee[0]);
    }

    @Override
    public void close() throws Exception {
        System.out.println("資源關閉!");
    }
    
    
}
