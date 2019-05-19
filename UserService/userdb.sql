CREATE TABLE user(
	uid int(11) PRIMARY KEY AUTO INCREMENT,
	Fname varchar(100) NOT NULL,
	lname varchar(100) NOT NULL,
	email varchar(100) NOT NULL,
	paasword varchar(20) NOT NULL,
	phone int(10) NOT NULL
	)