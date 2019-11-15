package com.pucminas.dropshipping.seguranca.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "usuario",schema="public")
@NamedQuery(name="Usuario.findUsuarioUserNamePassword",
        query="SELECT u FROM Usuario u WHERE u.userName=:userName AND u.senha=:senha")

@NamedQuery(name="Usuario.findUsuarioUserName",
        query="SELECT u FROM Usuario u WHERE u.userName=:userName")
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String userName;

    private String email;

    private String senha;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return new ArrayList<>();
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", login=" + userName + ", senha=" + senha + ", email=" + email
                + ", status=" + true + "]";
    }
}
