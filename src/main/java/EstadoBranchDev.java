public class EstadoBranchDev implements EstadoBranch{
    private EstadoBranchDev() {};
    private static EstadoBranchDev instance = new EstadoBranchDev();
    public static EstadoBranchDev getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Evadido";
    }
    @Override
    public String getNomeBranch() {
        return null;
    }
}
