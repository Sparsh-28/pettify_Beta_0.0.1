USE pettifydb;

DROP TABLE IF EXISTS usercredential;
CREATE TABLE usercredential (
    id INT AUTO_INCREMENT PRIMARY KEY,
    useremail VARCHAR(255),
    password VARCHAR(255),
    FOREIGN KEY (useremail) REFERENCES `user`(email)
)ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

COMMIT;
