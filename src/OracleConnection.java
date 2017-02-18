/**
 * Created by 310124463 on 15/02/17.
 */
public class OracleConnection extends ConnectionTemplate {
    @Override
    protected void destroy() {
        System.out.println("OracleConnection.destroy");
    }

    @Override
    protected void close() {
        System.out.println("OracleConnection.close");
    }

    @Override
    protected void insert() {
        System.out.println("OracleConnection.insert");
    }

    @Override
    protected void setData() {
        System.out.println("OracleConnection.setData");
    }

    @Override
    protected void prepareStatement() {
        System.out.println("OracleConnection.prepareStatement");
    }

    @Override
    protected void connect() {
        System.out.println("OracleConnection.connect");
    }

    @Override
    protected void setCredentials() {
        System.out.println("OracleConnection.setCredentials");
    }

    @Override
    protected void setDBDriver() {
        System.out.println("OracleConnection.setDBDriver");
    }

    @Override
    public boolean isLogginDisabled() {
        return false;
    }
}
