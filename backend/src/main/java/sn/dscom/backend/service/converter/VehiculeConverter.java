package sn.dscom.backend.service.converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sn.dscom.backend.common.dto.TransporteurDTO;
import sn.dscom.backend.common.dto.VehiculeDTO;
import sn.dscom.backend.database.entite.TransporteurEntity;
import sn.dscom.backend.database.entite.VehiculeEntity;

import javax.validation.Valid;

@Component
public class VehiculeConverter {
    @Autowired
    VehiculeConverter(){super();}
    public static VehiculeDTO toVehiculeDTO(@Valid VehiculeEntity vehiculeEntity) {
        //todo
        return null;
    }
    public static VehiculeEntity toVehiculeEntity(VehiculeDTO vehiculeDTO) {
        // todo
        final VehiculeEntity vehiculeEntity = new VehiculeEntity();
        // vehiculeEntity.setId(vehiculeDTO.getId());

        return vehiculeEntity;
    }
}
