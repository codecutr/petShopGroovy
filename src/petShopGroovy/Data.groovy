package petShopGroovy

//import java.sql.*;

/**
 * @author Meg Fryling
 * @version 6.30.2022
 *
 * This version is just simulating.  Can uncomment out code to switch to MySQL database connection .
 * See SetUpMySQLDB.txt for database set up SQL.
 *
 */

class Data {

    //protected Connection db;

    /**
     * The Database class constructor
     * @param database Database to be connected to
     */


    /*Data (String database) {


         try {

            db = DriverManager.getConnection("jdbc:mysql://localhost/" + database, "megfryling", "skittles");
            db.setAutoCommit(false);


        } catch (SQLException ex) {
            // handle errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

    }*/

    void beginTran () {
        //Never used this one.
        println("Beginning a transaction")

    }

    /**
     * Executes SQL commit statement.
     */

    void commit () {
        /*
         * try {

            Statement stmt = db.createStatement();
            stmt.execute("COMMIT");
             *
             */
        println("Committing transaction")
        /*
         * } catch (SQLException e) {
         * e.printStackTrace();
         * }
         */

    }

    /**
     * Executes SQL rollback statement.
     */

    void rollback() {

        /* try {
            Statement stmt = db.createStatement();
            stmt.execute("ROLLBACK");
        */
        println("Rolling back transaction")

        /*
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */

    }


    /**
     * Inserts Pet object data into database table
     *
     * @param table Table into which object's data will be added.
     * @param object Object to be inserted into table.
     */
    void insert (String table, Pet object) {

        //If name has never been assigned, do not attempt to add to the Pet table.
        //Name attribute is set to NOT NULL. Sure, you could allow null in the table
        //but no pet wants to be nameless!
        if (object.getName() == null)
        {
            println("Please give a name to this pet and try adding again.")

        }
        else {
            //If name is not null, try adding record to the Pet table.
            /*
                try {
//                    String query = "INSERT INTO " + table + "(`ID`,`Name`, `PetType`, `Age`, `FavoriteFood`)" + "VALUES (NULL, ?, ?, ?, ?)";
                    PreparedStatement stmt = db.prepareStatement(query);
                    stmt.setString(1, object.getName());
                    stmt.setString(2, object.getPetType());
                    stmt.setInt(3, object.getAge());
                    stmt.setString(4, object.getFavoriteFood());

                    int status = stmt.executeUpdate();
                    if (status > 0) {
                    */
            println("Inserted " + object.getName() + " into table " + table)
            /*
            }
            }
        catch (SQLException e) {
            e.printStackTrace();
        }
        */
        }

    }

}



