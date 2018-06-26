
package lab.pkg03;

import java.util.GregorianCalendar;


public class opiniao extends produto {



    public opiniao(String comentario, int nota, String nome, double preco, GregorianCalendar data) {
        super(nome, preco);
        this.nota = nota;
        this.comentario = comentario;
        this.data = data;

    }
    int nota;
    String comentario;
    GregorianCalendar data;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;

    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }





}
