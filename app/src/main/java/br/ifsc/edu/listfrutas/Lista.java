package br.ifsc.edu.listfrutas;

public class Lista {

    private String codigo;
    private String nomefruta;
    private String preco;
    private String precovenda;
    private int imagem;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNomefruta(String nomefruta) {
        this.nomefruta = nomefruta;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public void setPrecovenda(String precovenda) {
        this.precovenda = precovenda;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getNomefruta() {
        return nomefruta;
    }

    public String getPreco() {
        return preco;
    }

    public String getPrecovenda() {
        return precovenda;
    }

    public int getImagem() {
        return imagem;
    }

    public Lista (String codigo, String nomefruta, String preco, String precovenda, int imagem) {
        this.codigo= codigo;
        this.nomefruta= nomefruta;
        this.preco= preco;
        this.precovenda= precovenda;
        this.imagem= imagem;
    }

}
