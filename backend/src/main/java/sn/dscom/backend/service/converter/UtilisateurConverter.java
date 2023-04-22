package sn.dscom.backend.service.converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sn.dscom.backend.common.dto.UtilisateurDTO;
import sn.dscom.backend.database.entite.UtilisateurEntity;

import javax.validation.Valid;

@Component
public class UtilisateurConverter {
    @Autowired
    UtilisateurConverter(){super();}
    public static UtilisateurDTO toUtilisateurDTO(@Valid UtilisateurEntity entity) {
        //todo
        return null;
    }
    public static UtilisateurEntity toUtilisateurEntity( UtilisateurDTO utilisateurDTO) {
        //todo
        final UtilisateurEntity utilisateurEntity = new UtilisateurEntity();
        utilisateurEntity.setId(utilisateurDTO.getId());

        return utilisateurEntity;
    }
}
