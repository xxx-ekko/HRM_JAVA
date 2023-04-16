/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import models.Administrateur;

/**
 *
 * @author Ekko
 */
public interface IAdministrateurDao {
    public boolean createAdministrateur(Administrateur admin);
    public boolean updateAdministrateur(Administrateur admin);
    public boolean deleteAdministrateur(Administrateur admin);
    public Administrateur findAdministrateurById(int id);
    public List<Administrateur> findAllAdministrateurs();
    boolean authentifier(String login, String motDePasse);
    
}
