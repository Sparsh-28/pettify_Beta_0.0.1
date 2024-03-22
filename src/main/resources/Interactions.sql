CREATE TABLE interactions(
    id INT AUTO_INCREMENT PRIMARY KEY,
    sender INT,
    receiver INT,
    reason VARCHAR(255),
    status VARCHAR(255),
    FOREIGN KEY (sender) REFERENCES `user`(id),
    FOREIGN KEY (receiver) REFERENCES `user`(id)
)ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

COMMIT;