DROP TABLE IF EXISTS tblUser;

CREATE TABLE IF NOT EXISTS tblUser
(
    id               INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
    userNumber       DOUBLE,
    userText         VARCHAR(255),
    userDate         DATE
);

