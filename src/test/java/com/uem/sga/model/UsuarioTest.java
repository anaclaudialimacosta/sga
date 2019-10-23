package com.uem.sga.model;

import com.uem.sga.databuilder.UsuarioDataBuilder;
import org.junit.*;

public class UsuarioTest {

    @Test
    public void deveCriarUmUsuarioComSucesso(){
        Usuario usuario = UsuarioDataBuilder.fullUsuario();

        Assert.assertEquals(UsuarioDataBuilder.USUARIO_TIPO, usuario.getTipo());
        Assert.assertEquals(UsuarioDataBuilder.USUARIO_USERNAME, usuario.getUsername());
    }

    @Test
    public void deveRetornarExceptionQuandoUsernameNull(){
        String mensagem = null;
        try {
            Usuario user = Usuario.builder()
                    .username(null)
                    .senha(UsuarioDataBuilder.USUARIO_SENHA)
                    .tipo(UsuarioDataBuilder.USUARIO_TIPO)
                    .build();
        }catch (Exception e){
            mensagem = e.getMessage();
        }
        Assert.assertEquals("Usuario é campo Obrigatorio",mensagem);

    }

    @Test
    public void deveRetornarExceptionQuandoUsernameEmpty(){

        String mensagem = null;
        try {
            Usuario user = Usuario.builder()
                    .username("")
                    .senha(UsuarioDataBuilder.USUARIO_SENHA)
                    .tipo(UsuarioDataBuilder.USUARIO_TIPO)
                    .build();
        }catch (Exception e){
            mensagem = e.getMessage();
        }
        Assert.assertEquals("Usuario é campo Obrigatorio",mensagem);

    }
    @Test
    public void deveRetornarExcecaoQuandoSenhaEmpty(){

        String mensagem = null;
        try {
            Usuario user = Usuario.builder()
                    .username(UsuarioDataBuilder.USUARIO_USERNAME)
                    .senha(null)
                    .tipo(UsuarioDataBuilder.USUARIO_TIPO)
                    .build();
        }catch (Exception e){
            mensagem = e.getMessage();
        }
        Assert.assertEquals("Senha é campo Obrigatório",mensagem);

    }
    @Test
    public void deveRetornarExcecaoQuandoSenhaNull(){
        String mensagem = null;
        try {
            Usuario user = Usuario.builder()
                    .username(UsuarioDataBuilder.USUARIO_USERNAME)
                    .senha(null)
                    .tipo(UsuarioDataBuilder.USUARIO_TIPO)
                    .build();
        }catch (Exception e){
            mensagem = e.getMessage();
        }
        Assert.assertEquals("Senha é" +
                "campo Obrigatório",mensagem);
    }

    @Test
    public void deveRetornarExcecaoQuandoTipoNull(){
        String mensagem = null;
        try {
            Usuario user = Usuario.builder()
                    .username(UsuarioDataBuilder.USUARIO_USERNAME)
                    .senha(UsuarioDataBuilder.USUARIO_SENHA)
                    .tipo(null)
                    .build();
        }catch (Exception e){
            mensagem = e.getMessage();
        }
        Assert.assertEquals("Tipo é um campo Obrigatorio",mensagem);
    }

}
