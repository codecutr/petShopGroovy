# petShopGroovy

CIS Homework</br>
Meg Fryling</br>
7.5.2022

* This is a rewrite of the [petShop](https://github.com/codecutr/petShop.git) java files in Groovy.  This version also replaced the separate Cat and Dog classes with a single Pet class that uses a petType attribute to distinguish between the two.
* Source files can be found in petShopGroovy/src/petShopGroovy/ directory.
* Unit tests are file PetTest.groovy.
   * Add JUnit5.8.1 to IDE external libraries.
* Currently uses DataSim version, which just simulates database insert, commit, rollback.  To change to real connection to MySQL database, change all usages of DataSim to DataDB.  
   * See SetUpMySQLDB.txt for MySQL database set up SQL.
   * Add mysql-connector-java-8.0.29 to IDE external libraries.
