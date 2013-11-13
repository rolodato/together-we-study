DROP DATABASE IF EXISTS tws;
CREATE DATABASE tws;
USE tws;

CREATE TABLE user (
    id int AUTO_INCREMENT PRIMARY KEY,
    name varchar(100) NOT NULL,
    email varchar(100),
    school varchar(100),
    location varchar(100)
);

CREATE TABLE lfg (
    id int AUTO_INCREMENT PRIMARY KEY,
    owner int NOT NULL,
    title varchar(100) NOT NULL,
    studySubject varchar(100) NOT NULL,
    startTime time,
    endTime time,
    FOREIGN KEY (owner)
        REFERENCES user (id)
);
