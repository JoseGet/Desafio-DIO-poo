package dominio;

public class Curso extends Conteudo {
    
   
    private int cargaHoraria;
    private double valor;
    
    
    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }


    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + ", valor="
                + valor + "]";
    }


    @Override
    public double calcularXP() {
        return XP_PADRAO * getCargaHoraria();
    }       

    
}
