SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Indexes */

DROP INDEX index_account_id ON account;
DROP INDEX index_account_userid_type ON account;



/* Drop Tables */

DROP TABLE IF EXISTS account_log;
DROP TABLE IF EXISTS account;
DROP TABLE IF EXISTS article;
DROP TABLE IF EXISTS article_category;
DROP TABLE IF EXISTS authorities;
DROP TABLE IF EXISTS user;




/* Create Tables */

CREATE TABLE account
(
	id int NOT NULL AUTO_INCREMENT,
	user_id int NOT NULL,
	balance int NOT NULL,
	frozen int NOT NULL,
	-- 账户类型：1积分账户，2人民币账户
	type int NOT NULL COMMENT '账户类型：1积分账户，2人民币账户',
	PRIMARY KEY (id),
	CONSTRAINT user_account_type_unique UNIQUE (user_id, type)
);


CREATE TABLE account_log
(
	id int NOT NULL AUTO_INCREMENT,
	account_id int NOT NULL,
	-- 相关交易ID
	trans_id int NOT NULL COMMENT '相关交易ID',
	-- 交易后余额
	balance int NOT NULL COMMENT '交易后余额',
	-- 冻结金额
	frozen int NOT NULL COMMENT '冻结金额',
	-- 变动方向1 增加，减少
	trans_type int NOT NULL COMMENT '变动方向1 增加，减少',
	-- 交易数量
	trans_aount int NOT NULL COMMENT '交易数量',
	create_time time NOT NULL,
	PRIMARY KEY (id)
);


CREATE TABLE article
(
	id int NOT NULL AUTO_INCREMENT,
	-- 标题
	title varchar(100) NOT NULL COMMENT '标题',
	-- 图片
	image varchar(100) NOT NULL COMMENT '图片',
	-- 内容地址
	content_uri varchar(100) COMMENT '内容地址',
	-- 图标
	icon varchar(100) COMMENT '图标',
	aticle_cate_id int NOT NULL,
	PRIMARY KEY (id)
);


CREATE TABLE article_category
(
	id int NOT NULL AUTO_INCREMENT,
	-- 文章栏目类型
	type varchar(10) COMMENT '文章栏目类型',
	-- 栏目名称
	name varchar(100) NOT NULL COMMENT '栏目名称',
	-- 图标
	icon varchar(100) COMMENT '图标',
	PRIMARY KEY (id),
	UNIQUE (type)
);


CREATE TABLE authorities
(
	id int NOT NULL,
	role varchar(100),
	user_id int NOT NULL,
	PRIMARY KEY (id),
	UNIQUE (id)
);


CREATE TABLE user
(
	id int NOT NULL AUTO_INCREMENT,
	-- 用户名
	name varchar(20) NOT NULL COMMENT '用户名',
	-- 邮箱
	email varchar(50) COMMENT '邮箱',
	-- 手机号码
	mobile varchar(20) COMMENT '手机号码',
	-- 密码
	password varchar(20) COMMENT '密码',
	-- 创建时间
	created_time time NOT NULL COMMENT '创建时间',
	-- 更新时间
	update_time time NOT NULL COMMENT '更新时间',
	PRIMARY KEY (id),
	UNIQUE (name),
	UNIQUE (name)
);



/* Create Foreign Keys */

ALTER TABLE account_log
	ADD FOREIGN KEY (account_id)
	REFERENCES account (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE article
	ADD FOREIGN KEY (aticle_cate_id)
	REFERENCES article_category (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE account
	ADD FOREIGN KEY (user_id)
	REFERENCES user (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE authorities
	ADD FOREIGN KEY (user_id)
	REFERENCES user (id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



/* Create Indexes */

CREATE INDEX index_account_id USING BTREE ON account (id ASC);
CREATE INDEX index_account_userid_type USING BTREE ON account (user_id ASC, type ASC);



