package sn.dscom.backend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sn.dscom.backend.common.dto.Credentials;
import sn.dscom.backend.common.dto.UtilisateurConnectedDTO;
import sn.dscom.backend.common.dto.UtilisateurDTO;
import sn.dscom.backend.database.entite.UtilisateurEntity;
import sn.dscom.backend.database.repository.UtilisateurRepository;
import sn.dscom.backend.service.converter.UtilisateurConverter;
import sn.dscom.backend.service.util.TokenUtils;

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
    /*@Transactional
    public String authentification(Credentials credentials){
        UtilisateurEntity  user=  utilisateurRepository.findUtilisateurEntitiesByLoginExists(credentials.getLogin());
        UtilisateurConnectedDTO utilisateurConnectedDTO=UtilisateurConverter.toUtilisateurConnectedDTO(user);
        String token = TokenUtils.generateToken(utilisateurConnectedDTO);
        return token;
    }
    */
    @Transactional
    public UtilisateurConnectedDTO chargerUtilisateurConnected(final UtilisateurConnectedDTO utilisateurConnectedDTO) {
        // todo
       /* UtilisateurEntity  user=  utilisateurRepository.findUtilisateurEntitiesByLoginExists(utilisateurConnectedDTO.getLogin());
        UtilisateurConnectedDTO userConnectedDTO=UtilisateurConverter.toUtilisateurConnectedDTO(user);
        return userConnectedDTO;
        */
        return  null;
    }
    public  UtilisateurDTO sauvegarderUtilisateur(UtilisateurDTO utilisateurDTO){
        return null;

    }
}
