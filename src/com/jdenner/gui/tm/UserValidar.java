/*
 * Método para validar o usúario.
 */
package com.jdenner.gui.tm;

/**
 *
 * @author Clenildon
 */
public class UserValidar {
    public boolean validarUsuario (String usuario, String senha){ 
       if( usuario.equals("adm")&& senha.equals("123")){
           return true;
       }else{
           return false;
       }
}
    
}
