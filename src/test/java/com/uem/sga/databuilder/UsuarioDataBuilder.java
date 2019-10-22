package com.uem.sga.databuilder;

import com.uem.sga.model.TipoUsuario;
import com.uem.sga.model.Usuario;

public class UsuarioDataBuilder {

    public static final String USUARIO_USERNAME =  "adminteste";
    public static final String USUARIO_SENHA =  "12345qwert";
    public static final TipoUsuario USUARIO_TIPO = TipoUsuario.ADMINISTRADOR;

    public static Usuario fullUsuario(){
        return Usuario.builder()
                .senha(USUARIO_SENHA)
                .username(USUARIO_USERNAME)
                .tipo(USUARIO_TIPO)
                .build();
    }
}
