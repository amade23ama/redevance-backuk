package sn.dscom.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.dscom.backend.common.dto.UtilisateurConnectedDTO;
import sn.dscom.backend.service.UtilisateurService;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class UtilisateurController {
    private UtilisateurService utilisateurService;
    @Autowired
    UtilisateurController(UtilisateurService utilisateurService){
        this.utilisateurService=utilisateurService;
    }

    @PostMapping("/test")
    @PreAuthorize("hasRole('CONSULT')")
    public UtilisateurConnectedDTO logout(){
        SimpleGrantedAuthority test= new SimpleGrantedAuthority("CONSULT");

        SecurityContext ctx = SecurityContextHolder.getContext();
         UtilisateurConnectedDTO user = (UtilisateurConnectedDTO) ctx.getAuthentication().getPrincipal();
        return  user;
    }
}
