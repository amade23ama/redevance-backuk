package sn.dscom.backend.service.converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sn.dscom.backend.common.dto.ExploitationDTO;
import sn.dscom.backend.common.dto.ProduitDTO;
import sn.dscom.backend.database.entite.ExploitationEntity;
import sn.dscom.backend.database.entite.ProduitEntity;

import javax.validation.Valid;

@Component
public class ProduitConverter {
    @Autowired
    ProduitConverter(){super();}
    public static ProduitDTO toProduitDTO(@Valid ProduitEntity produitEntity) {
        //todo
        return null;
    }
    public static ProduitEntity toProduitEntity(ProduitDTO produitDTO) {
        // todo
        final ProduitEntity produitEntity = new ProduitEntity();
        // produitEntity.setId(produitDTO.getId());

        return produitEntity;
    }
}
