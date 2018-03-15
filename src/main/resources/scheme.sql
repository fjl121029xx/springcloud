DROP TABLE IF EXISTS student;

CREATE TABLE student (
  id      INT         NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name    VARCHAR(32) NOT NULL,
  sex     VARCHAR(5),
  age     INT(3),
  balance DECIMAL(10, 2)
);

INSERT INTO student (name, sex, age, balance) VALUES ("tom", "男", 18, 29.22);
INSERT INTO student (name, sex, age, balance) VALUES ("jerry", "女", 18, 29.22);
INSERT INTO student (name, sex, age, balance) VALUES ("jack", "男", 18, 29.22);
INSERT INTO student (name, sex, age, balance) VALUES ("rose", "女", 18, 29.22);
