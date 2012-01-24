package senai.cronos.util;

import java.text.DateFormat;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Sergio Lisan
 */
public class Feriado implements Comparable<Feriado> {

    public Feriado() {
    }

    public Feriado(Date dia, String descricao) {
        this.dia = dia;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Feriado other = (Feriado) obj;
        if (!Objects.equals(this.dia, other.dia)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.dia);
        hash = 67 * hash + Objects.hashCode(this.descricao);
        return hash;
    }

    @Override
    public String toString() {
        return DateFormat.getDateInstance(DateFormat.SHORT).format(dia) + " - " + descricao;
    }
    private Date dia;
    private String descricao;

    @Override
    public int compareTo(Feriado t) {
        return dia.compareTo(t.dia);
    }
}
