/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;
import java.util.List;
import models.Poste;

/**
 *
 * @author Ekko
 */
public interface IPosteDao {
    boolean ajouter(Poste poste);
    boolean supprimer(int id);
    boolean modifier(Poste poste);
    List<Poste> lister();
    Poste trouverParId(int id);
}
