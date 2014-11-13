/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MeuIPad;

/**
 *
 * @author Jeanne
 */
public class IPad extends Device{
    protected String cor;
    protected String tipoTela;
    protected int mesesGarantia;
    protected Ponto coordenadasTela;
    protected Usuario usuarioIpad;
    protected static final int GARANTIA_MAXIMA = 36; // 36 meses ou 3 anos

    public IPad(String modelo, int codigoBarras, float pesoLiq,String cor, String tipoTela, int mesesGarantia, Ponto coordenadasTela, Usuario usuarioIpad) {
        super(modelo,codigoBarras, pesoLiq);
        setCor(cor);
        setTipoTela(tipoTela);
        setMesesGarantia(mesesGarantia);
        this.coordenadasTela = new Ponto(coordenadasTela);
        this.usuarioIpad = new Usuario(usuarioIpad);
    }
    
    public IPad() {
        super();
        this.cor = "";
        this.tipoTela = "";
        this.mesesGarantia = 0;
        this.coordenadasTela = new Ponto();
        this.usuarioIpad = new Usuario();
    }
    
    public IPad(IPad IpadOriginal) {
        super(IpadOriginal);
        setCor(cor);
        setTipoTela(tipoTela);
        setMesesGarantia(mesesGarantia);
        this.coordenadasTela = new Ponto(IpadOriginal.coordenadasTela);
        this.usuarioIpad = new Usuario(IpadOriginal.usuarioIpad);
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    public void setMesesGarantia(int mesesGarantia) {
        this.mesesGarantia = (mesesGarantia >= 0 && mesesGarantia <= GARANTIA_MAXIMA)?mesesGarantia:0;
    }
    
    public void setCoordenadasTela(Ponto coordenadasTela) {
        this.coordenadasTela.setX(coordenadasTela.getX());
        this.coordenadasTela.setY(coordenadasTela.getY());
    }

    public void setUsuarioIpad(Usuario usuarioIpad) {
        this.usuarioIpad.setNome(usuarioIpad.getNome());
        this.usuarioIpad.setSenha(usuarioIpad.getSenha());
    }

    public String getCor() {
        return cor;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    public Ponto getCoordenadasTela() {
        return coordenadasTela;
    }

    public Usuario getUsuarioIpad() {
        return usuarioIpad;
    }
    
    public void tocarTela(float x,float y) {
        this.coordenadasTela.setX(x);
        this.coordenadasTela.setY(y);
    }
    
    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Cor: "+this.cor);
        System.out.println("Tipo da Tela: "+this.tipoTela);
        System.out.println("Meses de Garantia: "+this.mesesGarantia);
        System.out.println("Coordenadas apontadas na tela pelo usuario: "+this.coordenadasTela);
        System.out.println("Usuario do IPad - "+this.usuarioIpad);
    }
    
    public static void imprimeMensagem() {
        System.out.println("Bem Vindo ao IPad!");
    }
}
