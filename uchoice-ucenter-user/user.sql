DROP TABLE IF EXISTS `uc_user`;
DROP TABLE IF EXISTS `uc_user_passport`;
DROP TABLE IF EXISTS `uc_user_relation_info`;

CREATE TABLE `uc_user` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`user_id`  int(11) NOT NULL COMMENT '用户ID' ,
`user_name_cn`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户中文名' ,
`user_name_en`  varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户英文名' ,
`phone`  int(10) UNSIGNED ZEROFILL NULL DEFAULT NULL COMMENT '手机号码' ,
`email`  varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱' ,
`status`  int(11) NULL DEFAULT NULL COMMENT '状态' ,
`extention`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '扩展字段' ,
PRIMARY KEY (`id`),
INDEX `user_id_idx` (`user_id`) USING BTREE
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1
ROW_FORMAT=DYNAMIC
;

CREATE TABLE `uc_user_passport` (
  `id`  int(11) NOT NULL AUTO_INCREMENT ,
  `user_id`  int(11) NULL DEFAULT NULL COMMENT '用户id' ,
  `identity_type`  int(11) NULL DEFAULT NULL COMMENT '凭证类型 0：用户名 1：手机 2：邮箱 3：三方QQ 4:三方微信 5:三方支付宝' ,
  `identifier`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '凭证' ,
  `credential`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '凭证密码' ,
  `enable`  int(11) NULL DEFAULT NULL COMMENT '是否禁止登陆' ,
  PRIMARY KEY (`id`),
  INDEX `login_idx` (`identity_type`, `identifier`, `credential`) USING BTREE COMMENT '登陆三要素索引'
)
  ENGINE=InnoDB
  DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
  AUTO_INCREMENT=1
  ROW_FORMAT=DYNAMIC
;


CREATE TABLE `uc_user_relation_info` (
  `id`  int(11) NOT NULL AUTO_INCREMENT ,
  `user_id`  int(11) NULL DEFAULT NULL COMMENT '用户ID' ,
  `org_id`  int(11) NULL DEFAULT NULL COMMENT '所属组织机构Id' ,
  `role_ids`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色ID，可有多个角色JSON(List<Integer>)' ,
  `tags`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标签，可多个JSON(List<long>)' ,
  `extention`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '扩展字段' ,
  PRIMARY KEY (`id`),
  INDEX `user_id_idx` (`user_id`) USING BTREE
)
  ENGINE=InnoDB
  DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
  AUTO_INCREMENT=1
  ROW_FORMAT=DYNAMIC
;





