package com.example.dao;

import com.example.model.Employee;
import java.util.*;

public class EmployeeDAOCollectionImpl implements EmployeeDAO {
    private SortedMap<Integer, Employee> employees = new TreeMap<>();
    @Override
    public void add(Employee emp) throws DAOException {
        int id = emp.getId();
        if(employees.containsKey(id)==true) {
            throw new DAOException("員工已存在,加入失敗!");
        }        
        employees.put(id, emp);
    }

    @Override
    public void update(Employee emp) throws DAOException {
        int id = emp.getId();
        if(employees.containsKey(id)==false) {
            throw new DAOException("編號"+id+"員工不存在,更新失敗!");
        }
        employees.put(id, emp);
    }

    @Override
    public void delete(int id) throws DAOException {
        if(employees.containsKey(id)==false) {
            throw new DAOException("編號"+id+"員工不存在,刪除失敗!");
        }
        employees.remove(id);
    }

    @Override
    public Employee findById(int id) throws DAOException {
        Employee emp = employees.get(id);
        if(emp==null){
            throw new DAOException("編號"+id+"員工不存在");
        }
        return emp;
    }

    @Override
    public Employee[] getAllEmployees() {
        return employees.values().toArray(new Employee[0]);
    }

    @Override
    public void close() throws Exception {
        System.out.println("資源關閉!");
    }
    
}
