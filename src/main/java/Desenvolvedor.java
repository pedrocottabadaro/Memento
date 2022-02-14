import java.util.ArrayList;
import java.util.List;

public class Desenvolvedor {

    private EstadoBranch estadoBranch;
    private List<EstadoBranch> memento = new ArrayList<EstadoBranch>();

    public EstadoBranch getBranch() {
        return this.estadoBranch;
    }

    public void setBranch(EstadoBranch estadoBranch) {
        this.estadoBranch = estadoBranch;
        this.memento.add(this.estadoBranch);
    }

    public void restoreBranch(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Branch not found");
        }
        this.estadoBranch = this.memento.get(indice);
    }

    public List<EstadoBranch> getBranches() {
        return this.memento;
    }
}
