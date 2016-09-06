SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS auction;
DROP TABLE IF EXISTS auctions;
DROP TABLE IF EXISTS auction_image;
DROP TABLE IF EXISTS image;




/* Create Tables */

CREATE TABLE auction
(
	id int NOT NULL AUTO_INCREMENT,
	-- 标题
	name varchar(200) NOT NULL COMMENT '标题',
	endTime datetime NOT NULL,
	start_price int NOT NULL,
	description text,
	-- 加价幅度
	addrange int COMMENT '加价幅度',
	-- 保证金
	deposit int COMMENT '保证金',
	fixed_price int,
	userid int NOT NULL,
	parent int NOT NULL,
	CONSTRAINT id PRIMARY KEY (id),
	UNIQUE (id),
	UNIQUE (parent),
	auctions
);


CREATE TABLE auctions
(
	id int NOT NULL AUTO_INCREMENT,
	-- 标题
	name varchar(200) NOT NULL COMMENT '标题',
	endTime datetime NOT NULL,
	PRIMARY KEY (id),
	UNIQUE (id)
);


CREATE TABLE auction_image
(
	id int NOT NULL,
	imageid int NOT NULL,
	-- 根据type，关联拍场或者拍品的id
	refid int NOT NULL COMMENT '根据type，关联拍场或者拍品的id',
	-- 1:拍场图片
	-- 2:拍品图片
	type int NOT NULL COMMENT '1:拍场图片
2:拍品图片',
	PRIMARY KEY (id),
	UNIQUE (id),
	UNIQUE (imageid)
);


CREATE TABLE image
(
	id int NOT NULL,
	image_url varchar(200) NOT NULL,
	PRIMARY KEY (id),
	UNIQUE (image_url)
);



/* Create Foreign Keys */

ALTER TABLE auction
	ADD FOREIGN KEY (parent)
	REFERENCES auctions (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



