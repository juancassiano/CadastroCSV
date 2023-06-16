package classes;

public class Contato {
    private String email;
    private String telefone;
    private String celular;
    private Boolean celularEWhatsapp = Boolean.FALSE;

    public Contato(String email, String telefone, String celular, Boolean celularEWhatsapp) {
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.celularEWhatsapp = celularEWhatsapp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Boolean getCelularEWhatsapp() {
        return celularEWhatsapp;
    }

    public void setCelularEWhatsapp(Boolean confirmar) {
        if(confirmar) {
            this.celularEWhatsapp = Boolean.TRUE;
        }
    }


}
