package sn.dscom.backend.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.dscom.backend.common.dto.Credentials;
import sn.dscom.backend.common.dto.UtilisateurConnectedDTO;
import sn.dscom.backend.securite.CookieAuthenticationFilter;
import sn.dscom.backend.securite.JwtAuthentication;
import sn.dscom.backend.service.ConnectedUtilisateurService;
import sn.dscom.backend.service.UtilisateurService;

@RestController
@RequestMapping("/api")
public class AuthController {

    private ConnectedUtilisateurService connectedUtilisateurService;
    @Autowired
    AuthController(ConnectedUtilisateurService connectedUtilisateurService){
         this.connectedUtilisateurService=connectedUtilisateurService;
    }
    @PostMapping("/login")
    public String login(@RequestBody Credentials credentials){
        String token=this.connectedUtilisateurService.genereTokenAuthentificationUtilisateur(credentials);
        return  token;
    }
    @PostMapping("/updateConnected")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public UtilisateurConnectedDTO updateConnected(){
       UtilisateurConnectedDTO userConnectedDTO= this.connectedUtilisateurService.getConnectedUtilisateur();
     return userConnectedDTO;
    }

}
