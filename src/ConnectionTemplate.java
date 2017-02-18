/**
 * Created by 310124463 on 15/02/17.
 */
public abstract class ConnectionTemplate {

    private boolean isloggingDisabled;

    public ConnectionTemplate()
    {
        isloggingDisabled = isLogginDisabled();
    }

    public final void run ()
    {
        logging();

        setDBDriver();

        setCredentials();

        connect();

        prepareStatement();

        setData();

        insert();

        close();

        destroy();
    }

    protected abstract void destroy();

    protected abstract void close();

    protected abstract void insert();

    protected abstract void setData();

    protected abstract void prepareStatement();

    protected abstract void connect();

    protected abstract void setCredentials();

    protected abstract void setDBDriver();

    public boolean isLogginDisabled()
    {
        return false;
    }

    private void logging()
    {
        if(!isloggingDisabled)
        {
            System.out.println("--- Print the logs --- ");
        }
    }


}
