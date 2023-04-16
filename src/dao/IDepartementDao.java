/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;
import java.util.List;
import models.Departement;
/**
 *
 * @author Ekko
 */
public interface IDepartementDao {

    boolean createDepartement(Departement departement);
    //Departement getDepartementById(int id);
    //List<Departement> getAllDepartements();
    boolean updateDepartement(Departement departement);
    boolean deleteDepartement(Departement departement);   
    Departement findDepartementById(int id);   
    List<Departement> findAllDepartements();

}
