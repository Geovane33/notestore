package br.senac.sp.utils;

/**
 *
 * @author tscarton
 */
public enum PerfilEnum {
    admin("admin"), vendedor("vendedor"), gerente("gerente"), estoquista("estoquista");;
    private final String perfil;
    
    PerfilEnum(String perfil){
        this.perfil = perfil;
    }
    public String getPerfil(){
        return this.perfil;
    }
}
