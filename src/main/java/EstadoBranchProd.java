public class EstadoBranchProd implements EstadoBranch{
    private EstadoBranchProd() {};
    private static EstadoBranchProd instance = new EstadoBranchProd();
    public static EstadoBranchProd getInstance() {
        return instance;
    }

    @Override
    public String getNomeBranch() {
        return null;
    }
}
