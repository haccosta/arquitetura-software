package com.pucminas.dropshipping.seguranca.service;

import java.util.ArrayList;

import com.pucminas.dropshipping.seguranca.domain.Usuario;
import com.pucminas.dropshipping.seguranca.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Usuario usuario = usuarioRepository.findUsuarioUserName(username);


        if (usuario!=null) {
            return new User(username, "",
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("Usuario não encontrado " + username);
        }
    }
}
