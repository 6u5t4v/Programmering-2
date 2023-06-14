package architecture1Semester.storage;

import architecture1Semester.application.model.Company;
import architecture1Semester.application.model.Employee;

import java.io.Serializable;
import java.util.ArrayList;

public class Storage implements Serializable {
    private static Storage instance;

    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }

        return instance;
    }

    private Storage() {
    }

    private ArrayList<Company> companies = new ArrayList<>();
    private ArrayList<Employee> employees = new ArrayList<>();

    // -------------------------------------------------------------------------

    public ArrayList<Company> getCompanies() {
        return new ArrayList<Company>(companies);
    }

    public void addCompany(Company company) {
        companies.add(company);
    }

    public void removeCompany(Company company) {
        companies.remove(company);
    }

    // -------------------------------------------------------------------------

    public ArrayList<Employee> getEmployees() {
        return new ArrayList<Employee>(employees);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    // -------------------------------------------------------------------------

}
