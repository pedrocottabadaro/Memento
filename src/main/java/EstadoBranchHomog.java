public class EstadoBranchHomog implements EstadoBranch{
    private EstadoBranchHomog() {};
    private static EstadoBranchHomog instance = new EstadoBranchHomog();
    public static EstadoBranchHomog getInstance() {
        return instance;
    }

    @Override
    public String getNomeBranch() {
        return null;
    }
}
