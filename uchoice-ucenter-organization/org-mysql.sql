CREATE TABLE `uc_origanization` (
`id`  bigint(20) NOT NULL AUTO_INCREMENT ,
`org_id`  bigint(20) NULL DEFAULT NULL COMMENT '组织机构ID' ,
`org_name_cn`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组织机构中文名' ,
`org_name_en`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组织机构英文名' ,
`org_type_id`  bigint(20) NULL DEFAULT NULL COMMENT '组织机构类型ID' ,
`org_desc`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '组织机构描述' ,
`enable`  tinyint(255) NULL DEFAULT NULL COMMENT '组织机构是否可用 1:可用 0 不可用' ,
`org_leader_user_id`  bigint(20) NULL DEFAULT NULL COMMENT '组织机构负责人id' ,
`org_contact_user_id`  bigint(20) NULL DEFAULT NULL COMMENT '组织机构联系人ID' ,
`parent_org_id`  bigint(20) NULL DEFAULT NULL COMMENT '组织机构父组织ID' ,
`create_date`  datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间' ,
`create_user_id`  bigint(20) NULL DEFAULT NULL COMMENT '创建用户ID' ,
`modify_date`  datetime NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间' ,
`modify_user_id`  bigint(20) NULL DEFAULT NULL COMMENT '修改用户ID' ,
PRIMARY KEY (`id`),
UNIQUE INDEX `org_id_idx` (`org_id`) USING BTREE
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1
ROW_FORMAT=DYNAMIC
;

