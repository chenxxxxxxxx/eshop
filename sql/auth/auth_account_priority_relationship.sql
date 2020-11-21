CREATE TABLE `auth_account_priority_relationship` (
    `id` bigint(20) NOT NULL,
    `account_id` bigint(20) NOT NULL DEFAULT 0,
    `priority_id` bigint(20) NOT NULL DEFAULT 0,
    `gmt_create` datetime NOT NULL,
    `gmt_modified` datetime NOT NULL,
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='账号和权限关系';
