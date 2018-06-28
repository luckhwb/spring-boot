/*
Navicat MySQL Data Transfer

Source Server         : AAA_HWB
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : luck

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-06-28 10:23:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `blog`
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `blog_id` mediumint(8) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` tinyint(1) NOT NULL DEFAULT '0' COMMENT '用户id',
  `blog_name` varchar(36) NOT NULL DEFAULT '' COMMENT '博客名称',
  `blog_title` varchar(128) NOT NULL COMMENT '博客标题',
  `blog_keyword` varchar(255) NOT NULL COMMENT '博客关键字',
  `blog_description` varchar(255) NOT NULL COMMENT '博客描述',
  PRIMARY KEY (`blog_id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog
-- ----------------------------
INSERT INTO `blog` VALUES ('1', '0', '化先生', '人名', '化', '大好人啊 真的是！！！');
INSERT INTO `blog` VALUES ('2', '0', '化先生', '党的十八大', '中华人名共和国', '习近平总书记走进中央人民大会堂');
INSERT INTO `blog` VALUES ('3', '0', 'ad', '世界杯开幕', '世界杯', '2018年6月14号俄罗斯世界杯开幕式！');
INSERT INTO `blog` VALUES ('6', '0', 'adsad', '薛之谦将要出新歌', '薛之谦', '薛之谦在6月14号发布微博称，最近在准备最新的歌曲，将在不久后与大家相见');

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `message_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `blog_id` int(11) NOT NULL COMMENT '文章id',
  `user_id` int(11) NOT NULL COMMENT '会员id',
  `parent_id` int(11) DEFAULT '0' COMMENT '回复消息Id',
  `date` datetime NOT NULL,
  `content` varchar(200) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '内容',
  PRIMARY KEY (`message_id`),
  KEY `m_id` (`message_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `uid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(20) DEFAULT NULL COMMENT '名字',
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'boos hwb..', '18');
INSERT INTO `users` VALUES ('2', 'Hello World!', '1');
INSERT INTO `users` VALUES ('3', '化伟', '20');
