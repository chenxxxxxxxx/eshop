package com.zhss.eshop.order.domain;

import com.zhss.eshop.common.util.AbstractObject;

import java.util.Date;

/**
 * 订单操作日志
 * @author zhonghuashishan
 *
 */
public class OrderOperateLogDTO extends AbstractObject {

	/**
	 * id
	 */
	private Long id;
	/**
	 * 订单id
	 */
	private Long orderInfoId;
	/**
	 * 操作类型
	 */
	private Integer operateType;
	/**
	 * 操作内容
	 */
	private String operateContent;
	/**
	 * 创建时间
	 */
	private Date gmtCreate;
	/**
	 * 修改时间
	 */
	private Date gmtModified;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getOrderInfoId() {
		return orderInfoId;
	}
	public void setOrderInfoId(Long orderInfoId) {
		this.orderInfoId = orderInfoId;
	}
	public Integer getOperateType() {
		return operateType;
	}
	public void setOperateType(Integer operateType) {
		this.operateType = operateType;
	}
	public String getOperateContent() {
		return operateContent;
	}
	public void setOperateContent(String operateContent) {
		this.operateContent = operateContent;
	}
	public Date getGmtCreate() {
		return gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtModified() {
		return gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	
	@Override
	public String toString() {
		return "OrderOperateLogDTO [id=" + id + ", orderInfoId=" + orderInfoId + ", operateType=" + operateType
				+ ", operateContent=" + operateContent + ", gmtCreate=" + gmtCreate + ", gmtModified=" + gmtModified
				+ "]";
	}
	
}
