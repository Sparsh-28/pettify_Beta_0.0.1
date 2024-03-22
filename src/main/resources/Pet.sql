CREATE TABLE pet (
    petcode INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    about TEXT,
    ownerid INT,
    `type` VARCHAR(255),
    breed VARCHAR(255),
    FOREIGN KEY (ownerid) REFERENCES `user`(id),
    FOREIGN KEY (`type`) REFERENCES types(`type`),
    FOREIGN KEY (breed) REFERENCES breeds(breed)
)ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

COMMIT;
