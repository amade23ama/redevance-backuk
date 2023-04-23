package sn.dscom.backend.service.converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import sn.dscom.backend.common.dto.ProfilDTO;
import sn.dscom.backend.common.dto.UtilisateurDTO;
import sn.dscom.backend.common.dto.VehiculeDTO;
import sn.dscom.backend.database.entite.ProfilEntity;
import sn.dscom.backend.database.entite.UtilisateurEntity;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UtilisateurConverter {
    @Autowired
    UtilisateurConverter(){super();}
    public static UtilisateurDTO toUtilisateurDTO(@Valid UtilisateurEntity utilisateurEntity) {
        //todo
        if (utilisateurEntity == null) {
            return null;
        }
         UtilisateurDTO utilisateurDTO=UtilisateurDTO.builder()
                .id(utilisateurEntity.getId())
                .nom(utilisateurEntity.getNom())
                .prenom(utilisateurEntity.getPrenom())
                .login(utilisateurEntity.getLogin())
                .password(utilisateurEntity.getPassword())
                .email(utilisateurEntity.getEmail())
                .telephone(utilisateurEntity.getTelephone())
                .active(utilisateurEntity.getId()==null?true:utilisateurEntity.isActive())
                .dateCreation(utilisateurEntity.getId() == null ? new Date() :utilisateurEntity.getDateCreation())
                .dateModification(utilisateurEntity == null ? null :utilisateurEntity.getDateModification())
                //.depotEntityListDTO(null)
                .build();
        List<ProfilDTO> listeProfils = new ArrayList<>();
        if (!CollectionUtils.isEmpty(utilisateurEntity.getProfils())) {
            utilisateurEntity.getProfils()
                    .forEach((ProfilEntity profilEntity) ->
                            listeProfils.add(ProfilConverter.toProfilDTO(profilEntity)));
        }
        utilisateurDTO.setProfils(listeProfils);
        return utilisateurDTO;
    }
    public static UtilisateurEntity toUtilisateurEntity( UtilisateurDTO utilisateurDTO) {
        //todo
        if (utilisateurDTO == null) {
            return null;
        }
        UtilisateurEntity utilisateurEntity =UtilisateurEntity.builder()
                .id(utilisateurDTO.getId())
                .login(utilisateurDTO.getLogin())
                .email(utilisateurDTO.getEmail())
                .password(utilisateurDTO.getPassword())
                .prenom(utilisateurDTO.getPrenom())
                .nom(utilisateurDTO.getNom())
                .telephone(utilisateurDTO.getTelephone())
                .active(utilisateurDTO.getId()==null?true:utilisateurDTO.isActive())
                .dateCreation(utilisateurDTO.getId() == null ? new Date() :utilisateurDTO.getDateCreation())
                .dateModification(utilisateurDTO.getId() == null? null :utilisateurDTO.getDateModification())
                .build();


        final List<ProfilEntity> listeProfils = new ArrayList<>();
        if (!CollectionUtils.isEmpty(utilisateurDTO.getProfils())) {
            utilisateurDTO.getProfils()
                    .forEach((ProfilDTO profilDTO) ->
                            listeProfils.add(ProfilConverter.toProfilEntity(profilDTO)));
        }
        utilisateurEntity.setProfils(listeProfils);



        return utilisateurEntity;
    }



}
