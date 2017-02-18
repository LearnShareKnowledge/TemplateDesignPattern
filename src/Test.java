/**
 * Created by 310124463 on 15/02/17.
 */
public class Test {

    public static void main(String [] args)
    {
        System.out.println("My SQL Connection");

        ConnectionTemplate mySqlConnection = new MySqlConnection();

        mySqlConnection.run();

        System.out.println("*************************");

        System.out.println("Oracle Connection ");

        ConnectionTemplate oracleConnection = new OracleConnection();

        oracleConnection.run();
    }
}
