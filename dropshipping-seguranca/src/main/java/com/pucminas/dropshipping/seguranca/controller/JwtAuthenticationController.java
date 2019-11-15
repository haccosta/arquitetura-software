package com.pucminas.dropshipping.seguranca.controller;

import com.pucminas.dropshipping.seguranca.util.JwtTokenUtil;
import com.pucminas.dropshipping.seguranca.model.JwtRequest;
import com.pucminas.dropshipping.seguranca.model.JwtResponse;
import com.pucminas.dropshipping.seguranca.service.AuthProviderService;
import com.pucminas.dropshipping.seguranca.service.DetailsUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@Api(value = "API Serviços de Segurança")
public class JwtAuthenticationController {

    @Autowired
    private AuthProviderService authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private DetailsUserService userDetailsService;

    @ApiOperation(
            value="Geração do token de segurança",
            response=String.class,
            notes="Essa operação realiza a geração do token de segurança através da informação do usuário e senha")
    @RequestMapping(value = "/autenticacao", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {

        authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

        final UserDetails userDetails = userDetailsService.loadUserByUsernamePassword(authenticationRequest.getUsername(), authenticationRequest.getPassword());

        final String token = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new JwtResponse(token));
    }

    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }
}