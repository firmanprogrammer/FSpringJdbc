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

5. Open file **pom.xml** add this for spring-jdbc and mysql-connector-java:
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
6. 
