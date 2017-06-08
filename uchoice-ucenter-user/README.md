## 用户模块

> 用户基本信息设计
采取宽表设计

- u_user_core_info

|字段名|字段类型|字段描述|Default|是否唯一|
|---|---|---|---|---|
user_unique_id|long|用户主键ID|increment|Y|
org_id|long|所属部门| |N
role_ids|List<long>|角色,可多个| |N
tags|List<long>|标签|
extentions|JSON|扩展
- u_user_self_info

|字段名|字段类型|字段描述|Default|是否唯一|
|---|---|---|---|---|
user_self_id|long|用户自身信息id|increment|Y
user_unique_id|long|关联用户主表|
user_name_cn|string|用户中文名| |N|
user_name_en_first|string|英文名| |N
user_name_en_second|string|英文名| |N
login_password|strin|登录密码| |N

- 接下来的用户信息进行分组设计



