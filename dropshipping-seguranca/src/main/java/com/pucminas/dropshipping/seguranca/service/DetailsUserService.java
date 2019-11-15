package com.pucminas.dropshipping.seguranca.service;

import com.pucminas.dropshipping.seguranca.domain.Usuario;
import com.pucminas.dropshipping.seguranca.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DetailsUserService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public UserDetails loadUserByUsernamePassword(String username, String senha) throws UsernameNotFoundException {


        Usuario usuario = usuarioRepository.findUsuarioUserNamePassword(username, senha);

        if (usuario!=null) {
            return usuario;
        } else {
            throw new UsernameNotFoundException("Usuario nao encontrado! " + username);
        }
    }
}
