+# To Do List
 +
 +## Run the following SQL commands before
 +
 +```
 +CREATE DATABASE  `TodoDB` ;
 +
 +CREATE TABLE  `TodoDB`.`ToDoItem` (
 +`ID` INT NOT NULL ,
 +`TITLE` VARCHAR( 200 ) NOT NULL ,
 +`DATA` VARCHAR( 250 ) NOT NULL
 +) ENGINE = MYISAM ;
 +
 +CREATE USER 'yotam'@'localhost' IDENTIFIED BY  '1234';
 +
 +GRANT USAGE ON * . * TO  'yotam'@'localhost' IDENTIFIED BY  '1234' WITH MAX_QUERIES_PER_HOUR 0 MAX_CONNECTIONS_PER_HOUR 0 MAX_UPDATES_PER_HOUR 0 MAX_USER_CONNECTIONS 0 ;
 +
 +GRANT ALL PRIVILEGES ON  `TodoDB` . * TO  'yotam'@'localhost';
 +```
 +
 +## Authors
 +
 +* Yotam Akshota
 +* Igal Tsesis
