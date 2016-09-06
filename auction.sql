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
	-- ����
	name varchar(200) NOT NULL COMMENT '����',
	endTime datetime NOT NULL,
	start_price int NOT NULL,
	description text,
	-- �Ӽ۷���
	addrange int COMMENT '�Ӽ۷���',
	-- ��֤��
	deposit int COMMENT '��֤��',
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
	-- ����
	name varchar(200) NOT NULL COMMENT '����',
	endTime datetime NOT NULL,
	PRIMARY KEY (id),
	UNIQUE (id)
);


CREATE TABLE auction_image
(
	id int NOT NULL,
	imageid int NOT NULL,
	-- ����type�������ĳ�������Ʒ��id
	refid int NOT NULL COMMENT '����type�������ĳ�������Ʒ��id',
	-- 1:�ĳ�ͼƬ
	-- 2:��ƷͼƬ
	type int NOT NULL COMMENT '1:�ĳ�ͼƬ
2:��ƷͼƬ',
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



