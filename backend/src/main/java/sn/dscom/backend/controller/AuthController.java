package sn.dscom.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.dscom.backend.common.dto.Credentials;
import sn.dscom.backend.service.UtilisateurService;

@RestController
@RequestMapping("/api")
public class AuthController {

    private UtilisateurService utilisateurService;
    @Autowired
    AuthController(UtilisateurService utilisateurService){
         this.utilisateurService=utilisateurService;
    }
    @PostMapping("/login")
    public String login(@RequestBody Credentials credentials){
        String token=this.utilisateurService.authentification(credentials);
     return  token;
    }

}
