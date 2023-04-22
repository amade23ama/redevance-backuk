package sn.dscom.backend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.dscom.backend.common.dto.UtilisateurDTO;
import sn.dscom.backend.database.entite.UtilisateurEntity;
import sn.dscom.backend.database.repository.UtilisateurRepository;

@Service
@Transactional
@AllArgsConstructor
public class UtilisateurService {
    private UtilisateurRepository utilisateurRepository;

    @Transactional
    public UtilisateurEntity ajouterUtilisateur(UtilisateurDTO utilisateurDTO){
        // todo
        return null;
    }
    @Transactional
    public UtilisateurDTO majUtilisateur( UtilisateurDTO utilisateurDTO){
        // todo
        return null;

    }
    private UtilisateurEntity chargerUtilisateurFromDatabase(final UtilisateurDTO utilisateurDTO) {
        //return utilisateurRepository.getReferenceById();
        // todo
        return null;
    }
}
