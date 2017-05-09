/*----------------------------------------------------------------
 *  Copyright (C) 2016山东金视野教育科技股份有限公司
 * 版权所有。 
 *
 * 文件名：
 * 文件功能描述：
 *
 * 
 * 创建标识：
 *
 * 修改标识：
 * 修改描述：
 *----------------------------------------------------------------*/

package com.baidu.ueditor.define;

import com.fasterxml.jackson.annotation.*;
/**
 * @author konglm
 *
 */
public class QiNiuCom {

	@JsonProperty("Bucket")
	private String bucket;
	@JsonProperty("Key")
	private String key;
	@JsonProperty("Pops")
	private String pops;
	@JsonProperty("NotifyUrl")
	private String notifyUrl;
	public String getBucket() {
		return bucket;
	}
	public void setBucket(String bucket) {
		this.bucket = bucket;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getPops() {
		return pops;
	}
	public void setPops(String pops) {
		this.pops = pops;
	}
	public String getNotifyUrl() {
		return notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
	
		
	
}
