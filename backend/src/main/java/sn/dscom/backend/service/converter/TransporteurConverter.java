package sn.dscom.backend.service.converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sn.dscom.backend.common.dto.SiteDTO;
import sn.dscom.backend.common.dto.TransporteurDTO;
import sn.dscom.backend.database.entite.SiteEntity;
import sn.dscom.backend.database.entite.TransporteurEntity;

import javax.validation.Valid;

@Component
public class TransporteurConverter {
    @Autowired
    TransporteurConverter(){super();}
    public static TransporteurDTO toTransporteurDTO(@Valid TransporteurEntity transporteurEntity) {
        //todo
        return null;
    }
    public static TransporteurEntity toTransporteurEntity(TransporteurDTO transporteurDTO) {
        // todo
        final TransporteurEntity transporteurEntity = new TransporteurEntity();
        // transporteurEntity.setId(transporteurDTO.getId());

        return transporteurEntity;
    }
}
