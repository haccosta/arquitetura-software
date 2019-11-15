package com.pucminas.dropshipping.seguranca.service;

import com.pucminas.dropshipping.seguranca.domain.Usuario;
import com.pucminas.dropshipping.seguranca.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class AuthProviderService implements AuthenticationProvider {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Authentication authenticate(Authentication auth) throws AuthenticationException {
        String login = auth.getName();
        String senha = auth.getCredentials().toString();

        Usuario usuario = usuarioRepository.findUsuarioUserNamePassword(login, senha);

        if (usuario != null) {
            return new UsernamePasswordAuthenticationToken(login, senha);
        }
        throw new UsernameNotFoundException("Login e/ou Senha inválidos.");
    }

    @Override
    public boolean supports(Class<?> auth) {
        return auth.equals(UsernamePasswordAuthenticationToken.class);
    }

}
