#FSpringJdbc
Projek Maven+Spring+MySQL materi insert database with simple JDBC.
Tools: Eclipse, MySQLWorkbench or etc

##Tutorial
1. Database, create database & table:
    ```
    CREATE TABLE `CUSTOMER` (
         `CUST_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
         `FULL_NAME` varchar(50) NOT NULL,
         `ADDRESS` varchar(50) NOT NULL,
         `EMAIL` varchar(50) NOT NULL,
         PRIMARY KEY (`CUST_ID`)
    ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
    ```

2. Open **Eclipse**, Create a new **maven project**
3. Choose Archetype as **maven-archetype-quickstart**
4. Insert the following parameters:
  * Group Id: **com.belajarspring**
  * Artifact Id: **FSpringJdbc**
  * Package: **com.belajarspring.common**

5. Open file **pom.xml** add this for spring-jdbc and mysql-connector-java, then save it:
    ```
    ...
    <properties>
      ...
      <spring.version>4.2.0.RELEASE</spring.version>
    </properties>

    <dependencies>
      ...
      <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-core</artifactId>
        <version>${spring.version}</version>
      </dependency>

      <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>${spring.version}</version>
      </dependency>

      <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-beans</artifactId>
        <version>${spring.version}</version>
      </dependency>

      <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-jdbc</artifactId>
        <version>${spring.version}</version>
      </dependency>

      <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>5.1.35</version>
      </dependency>

    </dependencies>
    ```
    for full code [Download Here](https://github.com/firmanprogrammer/FSpringJdbc/blob/master/pom.xml)
    
6. Create a new package with name **com.belajarspring.model** and create a new class with name **Customer** in this package.

7. In this class type like this:
    ```
    package com.belajarspring.model;
    public class Customer {
        int custId;
        String fullName;
        String address;
        String email;
    }
    ```
    
8. in eclipse: right-click on Customer class/coding page then choose ***Source - Generate constractor using fields*** and right-click again choose ***Source - Generate Getters and Setters***. for full code [Download Here](https://github.com/firmanprogrammer/FSpringJdbc/blob/master/src/main/java/com/belajarspring/model/Customer.java)

9. Create a new package with name **com.belajarspring.dao** and create a new class with name **CustomerDao** in this package and type like this [Download Here](https://github.com/firmanprogrammer/FSpringJdbc/blob/master/src/main/java/com/belajarspring/dao/CustomerDao.java)

10. Create a new package with name **com.belajarspring.dao.impl** and create a new class with name **JdbcCustomerDao** in this package and type like this [Download Here](https://github.com/firmanprogrammer/FSpringJdbc/blob/master/src/main/java/com/belajarspring/dao/impl/JdbcCustomerDao.java)

11. Create a new folder in **../src/main** with name **resources** and create 3 xml files in this folder and enter code like this **[Datasource.xml](https://github.com/firmanprogrammer/FSpringJdbc/blob/master/src/main/resources/Datasource.xml), [Beans.xml](https://github.com/firmanprogrammer/FSpringJdbc/blob/master/src/main/resources/Beans.xml), [Main.xml](https://github.com/firmanprogrammer/FSpringJdbc/blob/master/src/main/resources/Main.xml)**

12. Open class **App.java** and change with this [Here's code](https://github.com/firmanprogrammer/FSpringJdbc/blob/3fb95566dcba9de9ffa050539c5dec0db1f0f5e2/src/main/java/com/belajarspring/common/App.java)

13. Then right-click on file **App.java** in eclipse choose **Run As - Java Application**

