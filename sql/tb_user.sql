CREATE TABLE `tb_user` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`mobile` VARCHAR(32) NOT NULL,
	`password` VARCHAR(128) NOT NULL,
	`nickname` VARCHAR(128) NOT NULL,
	`email` VARCHAR(64) NULL DEFAULT NULL,
	`signature` VARCHAR(256) NULL DEFAULT NULL,
	PRIMARY KEY (`id`),
	UNIQUE INDEX `mobile_UNIQUE` (`mobile`)
)
COMMENT='用户信息表'
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=14;
