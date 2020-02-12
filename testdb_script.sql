DROP TABLE IF EXISTS tblUser;

CREATE TABLE IF NOT EXISTS tblUser
(
    id               INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
    userNumber       INT          NOT NULL,
    userText         VARCHAR(255) NOT NULL,
    userDate         DATE         NOT NULL
);