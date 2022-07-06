package petShopGroovy

/**
 * @author Meg Fryling
 * @version 6.30.2022
 *
 * This version is just simulating.  Can use DataDB version for connection to MySQL database.
 * See SetUpMySQLDB.txt for database set up SQL.
 *
 */

class DataSim {

    /**
     * Executes SQL commit statement.
     */

    static void commit () {

        println("Committing transaction")

    }

    /**
     * Executes SQL rollback statement.
     */

    static void rollback() {

        println("Rolling back transaction")

    }


    /**
     * Inserts Pet object data into database table
     *
     * @param table Table into which object's data will be added.
     * @param object Object to be inserted into table.
     */
    static void insert (String table, Pet object) {

        //If name has never been assigned, do not attempt to add to the Pet table.
        //Name attribute is set to NOT NULL. Sure, you could allow null in the table
        //but no pet wants to be nameless!
        if (object.getName() == null)
        {
            println("Please give a name to this pet and try adding again.")

        }
        else {
            //If name is not null, add record to the Pet table.

            println("Inserted " + object.getName() + " into table " + table)
        }

    }

}



