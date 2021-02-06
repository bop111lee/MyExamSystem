SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for exam_paper
-- ----------------------------
DROP TABLE IF EXISTS `exam_paper`;
CREATE TABLE `exam_paper`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '试卷名称',
  `subject_id` int(11) NULL DEFAULT NULL COMMENT '学科',
  `paper_type` int(11) NULL DEFAULT NULL COMMENT '试卷类型( 1固定试卷  2临时试卷 3班级试卷 4.时段试卷 5.推送试卷)',
  `grade_level` int(11) NULL DEFAULT NULL COMMENT '级别',
  `score` int(11) NULL DEFAULT NULL COMMENT '试卷总分(千分制)',
  `question_count` int(11) NULL DEFAULT NULL COMMENT '题目数量',
  `suggest_time` int(11) NULL DEFAULT NULL COMMENT '建议时长(分钟)',
  `limit_start_time` datetime(0) NULL DEFAULT NULL COMMENT '时段试卷 开始时间',
  `limit_end_time` datetime(0) NULL DEFAULT NULL COMMENT '时段试卷 结束时间',
  `frame_text_content_id` int(11) NULL DEFAULT NULL COMMENT '试卷框架 内容为JSON',
  `create_user` int(11) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `deleted` bit(1) NULL DEFAULT NULL,
  `task_exam_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of exam_paper
-- ----------------------------

-- ----------------------------
-- Table structure for exam_paper_answer
-- ----------------------------
DROP TABLE IF EXISTS `exam_paper_answer`;
CREATE TABLE `exam_paper_answer`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `exam_paper_id` int(11) NULL DEFAULT NULL,
  `paper_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '试卷名称',
  `paper_type` int(11) NULL DEFAULT NULL COMMENT '试卷类型( 1固定试卷  2临时试卷 3班级试卷 4.时段试卷 )',
  `subject_id` int(11) NULL DEFAULT NULL COMMENT '学科',
  `system_score` int(11) NULL DEFAULT NULL COMMENT '系统判定得分',
  `user_score` int(11) NULL DEFAULT NULL COMMENT '最终得分(千分制)',
  `paper_score` int(11) NULL DEFAULT NULL COMMENT '试卷总分',
  `question_correct` int(11) NULL DEFAULT NULL COMMENT '做对题目数量',
  `question_count` int(11) NULL DEFAULT NULL COMMENT '题目总数量',
  `do_time` int(11) NULL DEFAULT NULL COMMENT '做题时间(秒)',
  `status` int(11) NULL DEFAULT NULL COMMENT '试卷状态(1待判分 2完成)',
  `create_user` int(11) NULL DEFAULT NULL COMMENT '学生',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '提交时间',
  `task_exam_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of exam_paper_answer
-- ----------------------------

-- ----------------------------
-- Table structure for exam_paper_question_customer_answer
-- ----------------------------
DROP TABLE IF EXISTS `exam_paper_question_customer_answer`;
CREATE TABLE `exam_paper_question_customer_answer`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `question_id` int(11) NULL DEFAULT NULL COMMENT '题目Id',
  `exam_paper_id` int(11) NULL DEFAULT NULL COMMENT '答案Id',
  `exam_paper_answer_id` int(11) NULL DEFAULT NULL,
  `question_type` int(11) NULL DEFAULT NULL COMMENT '题型',
  `subject_id` int(11) NULL DEFAULT NULL COMMENT '学科',
  `customer_score` int(11) NULL DEFAULT NULL COMMENT '得分',
  `question_score` int(11) NULL DEFAULT NULL COMMENT '题目原始分数',
  `question_text_content_id` int(11) NULL DEFAULT NULL COMMENT '问题内容',
  `answer` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '做题答案',
  `text_content_id` int(11) NULL DEFAULT NULL COMMENT '做题内容',
  `do_right` bit(1) NULL DEFAULT NULL COMMENT '是否正确',
  `create_user` int(11) NULL DEFAULT NULL COMMENT '做题人',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `item_order` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of exam_paper_question_customer_answer
-- ----------------------------

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '标题',
  `content` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '内容',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `send_user_id` int(11) NULL DEFAULT NULL COMMENT '发送者用户ID',
  `send_user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '发送者用户名',
  `send_real_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '发送者真实姓名',
  `receive_user_count` int(11) NULL DEFAULT NULL COMMENT '接收人数',
  `read_count` int(11) NULL DEFAULT NULL COMMENT '已读人数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for message_user
-- ----------------------------
DROP TABLE IF EXISTS `message_user`;
CREATE TABLE `message_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `message_id` int(11) NULL DEFAULT NULL COMMENT '消息内容ID',
  `receive_user_id` int(11) NULL DEFAULT NULL COMMENT '接收人ID',
  `receive_user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '接收人用户名',
  `receive_real_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '接收人真实姓名',
  `readed` bit(1) NULL DEFAULT NULL COMMENT '是否已读',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `read_time` datetime(0) NULL DEFAULT NULL COMMENT '阅读时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of message_user
-- ----------------------------

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `question_type` int(11) NULL DEFAULT NULL COMMENT '1.单选题  2.多选题  3.判断题 4.填空题 5.简答题',
  `subject_id` int(11) NULL DEFAULT NULL COMMENT '学科',
  `score` int(11) NULL DEFAULT NULL COMMENT '题目总分(千分制)',
  `grade_level` int(11) NULL DEFAULT NULL COMMENT '级别',
  `difficult` int(11) NULL DEFAULT NULL COMMENT '题目难度',
  `correct` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '正确答案',
  `info_text_content_id` int(11) NULL DEFAULT NULL COMMENT '题目  填空、 题干、解析、答案等信息',
  `create_user` int(11) NULL DEFAULT NULL COMMENT '创建人',
  `status` int(11) NULL DEFAULT NULL COMMENT '1.正常',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `deleted` bit(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of question
-- ----------------------------

-- ----------------------------
-- Table structure for subject
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '语文 数学 英语 等',
  `level` int(11) NULL DEFAULT NULL COMMENT '年级 (1-12) 小学 初中 高中  大学',
  `level_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '一年级、二年级等',
  `item_order` int(11) NULL DEFAULT NULL COMMENT '排序',
  `deleted` bit(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of subject
-- ----------------------------

-- ----------------------------
-- Table structure for task_exam
-- ----------------------------
DROP TABLE IF EXISTS `task_exam`;
CREATE TABLE `task_exam`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `grade_level` int(11) NULL DEFAULT NULL COMMENT '级别',
  `frame_text_content_id` int(11) NULL DEFAULT NULL COMMENT '任务框架 内容为JSON',
  `create_user` int(11) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `deleted` bit(1) NULL DEFAULT NULL,
  `create_user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of task_exam
-- ----------------------------

-- ----------------------------
-- Table structure for task_exam_customer_answer
-- ----------------------------
DROP TABLE IF EXISTS `task_exam_customer_answer`;
CREATE TABLE `task_exam_customer_answer`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `task_exam_id` int(11) NULL DEFAULT NULL,
  `create_user` int(255) NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `text_content_id` int(11) NULL DEFAULT NULL COMMENT '任务完成情况(Json)',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of task_exam_customer_answer
-- ----------------------------

-- ----------------------------
-- Table structure for text_content
-- ----------------------------
DROP TABLE IF EXISTS `text_content`;
CREATE TABLE `text_content`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of text_content
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_uuid` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `real_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '真实姓名',
  `age` int(11) NULL DEFAULT NULL,
  `sex` int(11) NULL DEFAULT NULL COMMENT '1.男 2女',
  `birth_day` datetime(0) NULL DEFAULT NULL,
  `user_level` int(11) NULL DEFAULT NULL COMMENT '学生年级(1-12)',
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `role` int(11) NULL DEFAULT NULL COMMENT '1.学生 2.老师 3.管理员',
  `status` int(11) NULL DEFAULT NULL COMMENT '1.启用 2禁用',
  `image_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '头像地址',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `modify_time` datetime(0) NULL DEFAULT NULL,
  `last_active_time` datetime(0) NULL DEFAULT NULL,
  `deleted` bit(1) NULL DEFAULT NULL COMMENT '是否删除',
  `wx_open_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '微信openId',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'd2d29da2-dcb3-4013-b874-727626236f47', 'student', 'D1AGFL+Gx37t0NPG4d6biYP5Z31cNbwhK5w1lUeiHB2zagqbk8efYfSjYoh1Z/j1dkiRjHU+b0EpwzCh8IGsksJjzD65ci5LsnodQVf4Uj6D3pwoscXGqmkjjpzvSJbx42swwNTA+QoDU8YLo7JhtbUK2X0qCjFGpd+8eJ5BGvk=', '学生', 18, 1, '2019-09-01 16:00:00', 12, '158800882', 1, 1, 'http://image.alvisu.com/Fn4CyLHWvT-kxIrK1ZaqTDidvXzj', '2019-09-07 18:55:02', '2020-02-04 08:26:54', NULL, b'0', NULL);
INSERT INTO `user` VALUES (2, '52045f5f-a13f-4ccc-93dd-f7ee8270ad4c', 'admin', 'D1AGFL+Gx37t0NPG4d6biYP5Z31cNbwhK5w1lUeiHB2zagqbk8efYfSjYoh1Z/j1dkiRjHU+b0EpwzCh8IGsksJjzD65ci5LsnodQVf4Uj6D3pwoscXGqmkjjpzvSJbx42swwNTA+QoDU8YLo7JhtbUK2X0qCjFGpd+8eJ5BGvk=', '管理员', 30, 1, '2019-09-07 18:56:07', NULL, NULL, 3, 1, NULL, '2019-09-07 18:56:21', NULL, NULL, b'0', NULL);

-- ----------------------------
-- Table structure for user_event_log
-- ----------------------------
DROP TABLE IF EXISTS `user_event_log`;
CREATE TABLE `user_event_log`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `real_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '真实姓名',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '内容',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_event_log
-- ----------------------------

-- ----------------------------
-- Table structure for t_user_token
-- ----------------------------
DROP TABLE IF EXISTS `user_token`;
CREATE TABLE `user_token`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `token` varchar(36) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `user_id` int(11) NULL DEFAULT NULL COMMENT '用户Id',
  `wx_open_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '微信openId',
  `create_time` datetime(0) NULL DEFAULT NULL,
  `end_time` datetime(0) NULL DEFAULT NULL,
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_token
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
