package com.example.learn.learn;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SoftwareEngineerService {
    
    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository){
        this.softwareEngineerRepository = softwareEngineerRepository;
    };

    // Voir tous les ingernieurs
    public List<SoftwareEngineer> getAllSoftwareEngineer(){
        return softwareEngineerRepository.findAll();
    };

    // Ajouter un ingernieur
    public void AddSoftwareEngineer(SoftwareEngineer softwareEngineer){
        softwareEngineerRepository.save(softwareEngineer);
    };

    // Voir tous un ingernieur
    public SoftwareEngineer getSoftwareEngineer(Integer id){
        return softwareEngineerRepository.findById(id).orElseThrow(() -> new IllegalStateException(id+" not found"));
    };

    // Mettre à jour un ingénieur
    public SoftwareEngineer updateSoftwareEngineer(Integer id, SoftwareEngineer updatedSoftwareEngineer) {
        // Recherche de l'ingénieur existant
        SoftwareEngineer existingEngineer = softwareEngineerRepository.findById(id).orElseThrow(() -> new IllegalStateException(id + " not found"));

        // Modification des champs voulu
        existingEngineer.setName(updatedSoftwareEngineer.getName());
        existingEngineer.setSkills(updatedSoftwareEngineer.getSkills());

        // Sauvegarde des nouvelles donnees
        return softwareEngineerRepository.save(existingEngineer);
    };

    // Supprimer un ingénieur
    public void deleteSoftwareEngineer(Integer id) {
        if (!softwareEngineerRepository.existsById(id)) {
            throw new IllegalStateException(id + " not found");
        }
        softwareEngineerRepository.deleteById(id);
    };
   
}
