# 设备管理系统

spring boot+mybatis+restful
------

基于我的另一个基础脚手架完成
https://github.com/MengW9/scafflod.git

界面太low

**使用方式**


------
数据库表

```sql
-- ----------------------------
-- Table structure for sbinfo
-- ----------------------------
DROP TABLE IF EXISTS `sbinfo`;
CREATE TABLE `sbinfo`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '设备主键',
  `sbname` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '设备名称',
  `sbscrq` date NULL DEFAULT NULL COMMENT '设备生产日期',
  `sbwyrxb` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '设备维护人性别',
  `sbjg` int(10) NULL DEFAULT NULL COMMENT '设备价格',
  `sblx_id` int(11) NULL DEFAULT NULL COMMENT '设备类型ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sblx
-- ----------------------------
DROP TABLE IF EXISTS `sblx`;
CREATE TABLE `sblx`  (
  `sblx_id` int(11) NOT NULL COMMENT '设备类型ID',
  `sblx` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '设备类型',
  PRIMARY KEY (`sblx_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
```





