package dio.web.api.model;

public class Usuario {

    //  int usucodigo   = rs.getInt("usucodigo");
    //                String usunome  = rs.getString("usunome");
    //                String usuemail = rs.getString("usuemail");
    //                String ususenha = rs.getString("ususenha");
    //                String usutoken = rs.getString("usutoken");
    //                int usuativo    = rs.getInt("usuativo");

    private Integer usucodigo;
    private String usunome;
    private String usuemail;
    private String ususenha;
    private String usutoken;
    private Integer usuativo;

    public Usuario(Integer usucodigo, String usunome, String usuemail, String ususenha, String usutoken, Integer usuativo) {
        this.usucodigo = usucodigo;
        this.usunome = usunome;
        this.usuemail = usuemail;
        this.ususenha = ususenha;
        this.usutoken = usutoken;
        this.usuativo = usuativo;
    }

    public Integer getUsucodigo() {
        return usucodigo;
    }

    public void setUsucodigo(Integer usucodigo) {
        this.usucodigo = usucodigo;
    }

    public String getUsunome() {
        return usunome;
    }

    public void setUsunome(String usunome) {
        this.usunome = usunome;
    }

    public String getUsuemail() {
        return usuemail;
    }

    public void setUsuemail(String usuemail) {
        this.usuemail = usuemail;
    }

    public String getUsusenha() {
        return ususenha;
    }

    public void setUsusenha(String ususenha) {
        this.ususenha = ususenha;
    }

    public String getUsutoken() {
        return usutoken;
    }

    public void setUsutoken(String usutoken) {
        this.usutoken = usutoken;
    }

    public Integer getUsuativo() {
        return usuativo;
    }

    public void setUsuativo(Integer usuativo) {
        this.usuativo = usuativo;
    }
}
