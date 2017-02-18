/**
 * Created by 310124463 on 15/02/17.
 */
public class MySqlConnection extends ConnectionTemplate {
    @Override
    protected void destroy() {
        System.out.println("MySqlConnection.destroy");

    }

    @Override
    protected void close() {
        System.out.println("MySqlConnection.close");

    }

    @Override
    protected void insert() {
        System.out.println("MySqlConnection.insert");
    }

    @Override
    protected void setData() {
        System.out.println("MySqlConnection.setData");
    }

    @Override
    protected void prepareStatement() {
        System.out.println("MySqlConnection.prepareStatement");
    }

    @Override
    protected void connect() {
        System.out.println("MySqlConnection.connect");
    }

    @Override
    protected void setCredentials() {
        System.out.println("MySqlConnection.setCredentials");
    }

    @Override
    protected void setDBDriver() {
        System.out.println("MySqlConnection.setDBDriver");
    }

    @Override
    public boolean isLogginDisabled() {
        return true;
    }
}
