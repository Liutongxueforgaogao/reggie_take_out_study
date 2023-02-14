package com.itheima.reggie.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * @descriptions: 分页参数
 * @author:
 * @date: 2023/2/14 14:46
 * @version: 1.0
 */
@Data
public class Page {
	@TableField(exist = false)
	private int page;
	@TableField(exist = false)
	private int pageSize;
}
