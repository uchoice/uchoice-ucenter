DROP TABLE IF EXISTS `uc_user`;
DROP TABLE IF EXISTS `uc_user_passport`;
DROP TABLE IF EXISTS `uc_user_relation_info`;

CREATE TABLE `uc_user` (
`id`  bigint(20) NOT NULL AUTO_INCREMENT ,
`user_id`  int(11) NOT NULL COMMENT '用户ID' ,
`user_name`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名' ,
`user_name_cn`  varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户中文名' ,
`user_name_en`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户英文名' ,
`phone`  varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户手机号' ,
`extention`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '扩展字段，JSON格式' ,
`status`  int(255) NULL DEFAULT NULL COMMENT '用户状态 0：正常  1:锁定 其他状态位' ,
`email`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户邮箱' ,
`create_date`  datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间' ,
`create_user_id`  bigint(20) NULL DEFAULT NULL COMMENT '创建用户ID，如果是注册，则跟自己ID一直' ,
`modify_date`  datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间' ,
`modify_user_id`  bigint(20) NULL DEFAULT NULL COMMENT '修改用户ID' ,
PRIMARY KEY (`id`),
UNIQUE INDEX `user_id_idx` (`user_id`) USING BTREE ,
INDEX `user_status_idx` (`user_id`, `status`) USING BTREE
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='用户主表'
AUTO_INCREMENT=1
ROW_FORMAT=DYNAMIC
;
CREATE TABLE `uc_user_passport` (
`id`  bigint(20) NOT NULL ,
`user_id`  bigint(20) NOT NULL COMMENT '用户ID' ,
`identity_type`  int(255) NULL DEFAULT NULL COMMENT '凭证类型 0：用户名 1：手机号 2：邮箱 3：第三方QQ  4：第三方微信' ,
`identifier`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '凭证' ,
`credential`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '凭证tocken/密码' ,
`enable`  tinyint(255) NULL DEFAULT NULL COMMENT '是否可用 0：禁用登陆  1：启用登陆' ,
PRIMARY KEY (`id`),
INDEX `user_idx` (`user_id`) USING BTREE ,
INDEX `login_idx` (`identity_type`, `identifier`, `credential`) USING BTREE
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
ROW_FORMAT=DYNAMIC
;
CREATE TABLE `uc_user_relation_info` (
`id`  bigint(20) NULL DEFAULT NULL ,
`user_id`  bigint(20) NULL DEFAULT NULL COMMENT '用户ID' ,
`org_id`  bigint(20) NULL DEFAULT NULL COMMENT '组织ID' ,
`role_ids`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色ID，可多个,JSON<Long>' ,
`tags`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标签 JSON(List<Long></>)' ,
`extention`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '扩展字段' ,
INDEX `user_id_idx` (`user_id`) USING BTREE
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
ROW_FORMAT=DYNAMIC
;





