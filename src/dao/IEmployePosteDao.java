/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;
import java.util.List;
import models.EmployePoste;

/**
 *
 * @author Ekko
 */
public interface IEmployePosteDao {
    List<EmployePoste> getAllEmployePostes();
    EmployePoste findEmployePosteById(int id);
    void addEmployePoste(EmployePoste employePoste);
    void updateEmployePoste(EmployePoste employePoste);
    void deleteEmployePoste(EmployePoste employePoste);
}
