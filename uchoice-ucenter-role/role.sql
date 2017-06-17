CREATE TABLE `uc_role` (
`id`  bigint(20) NOT NULL AUTO_INCREMENT ,
`role_id`  bigint(20) NULL DEFAULT NULL COMMENT '角色ID' ,
`role_name_cn`  varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色中文名' ,
`role_name_en`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色英文名' ,
`role_desc`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色描述' ,
`enable`  tinyint(4) NULL DEFAULT NULL COMMENT '角色是否可用，0：停用 ，1:启用' ,
`parent_role_id`  bigint(20) NULL DEFAULT NULL COMMENT '父角色ID' ,
`create_user_id`  bigint(20) NULL DEFAULT NULL COMMENT '创建人' ,
`create_date`  datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间' ,
`modify_date`  datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间' ,
`modify_user_id`  bigint(20) NULL DEFAULT NULL COMMENT '修改人' ,
PRIMARY KEY (`id`),
UNIQUE INDEX `role_id_idx` (`role_id`) USING BTREE
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1
ROW_FORMAT=DYNAMIC
;

