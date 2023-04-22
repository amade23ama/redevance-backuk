package sn.dscom.backend.service.converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sn.dscom.backend.common.dto.ProfilDTO;
import sn.dscom.backend.common.dto.SiteDTO;
import sn.dscom.backend.database.entite.ProfilEntity;
import sn.dscom.backend.database.entite.SiteEntity;

import javax.validation.Valid;

@Component
public class SiteConverter {
    @Autowired
    SiteConverter(){super();}

    public static SiteDTO toSiteDTO(@Valid SiteEntity siteEntity) {
        //todo
        return null;
    }
    public static SiteEntity toSiteEntity( SiteDTO profilDTO) {
        // todo
        final SiteEntity siteEntity = new SiteEntity();
        // siteEntity.setId(siteDTO.getId());

        return siteEntity;
    }
}
