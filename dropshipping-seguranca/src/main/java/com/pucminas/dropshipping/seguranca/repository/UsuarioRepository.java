package com.pucminas.dropshipping.seguranca.repository;

import com.pucminas.dropshipping.seguranca.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findUsuarioUserNamePassword(String userName, String senha);

    Usuario findUsuarioUserName(String userName);

}
