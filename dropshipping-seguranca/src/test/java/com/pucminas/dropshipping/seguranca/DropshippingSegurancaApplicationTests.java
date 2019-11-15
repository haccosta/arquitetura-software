package com.pucminas.dropshipping.seguranca;

import com.pucminas.dropshipping.seguranca.repository.UsuarioRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DropshippingSegurancaApplicationTests {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Test
    @Sql(scripts = {"/data.sql"},
            config = @SqlConfig(encoding = "utf-8", transactionMode = SqlConfig.TransactionMode.ISOLATED))
    public void testLoadDataForTestCase() {
        assertEquals(2, usuarioRepository.findAll().size());
    }

}
