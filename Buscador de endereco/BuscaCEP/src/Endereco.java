import com.google.gson.annotations.SerializedName;

public class Endereco {
    @SerializedName("cep")
    private String CEP;
    @SerializedName("localidade")
    private String cidade;
    private String bairro;
    @SerializedName("logradouro")
    private String rua;
    private String numeroCasa;
    @SerializedName("uf")
    private String estado;

    public String getEndereco(){
        return "\nCidade = " + cidade +
                "\nRua = " + rua +
                "\nN° = "+numeroCasa+
                "\nBairro = " + bairro +
                "\nEstado = " + estado +
                "\nCEP = " + CEP;

    }
    public String getRua(){
        return rua;
    }
    public String getCidade(){
        return cidade;
    }
    public void setEndereco(String rua,String bairro,String numero){
        this.rua=rua;
        this.bairro=bairro;
        this.numeroCasa=numero;
    }
    public void setRua(String rua){
        this.rua=rua;
    }
    public void setNumeroCasa(String numeroCasa){
        this.numeroCasa=numeroCasa;
    }

}
