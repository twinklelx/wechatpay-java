// Copyright 2021 Tencent Inc. All rights reserved.
//
// 微工卡接口文档
//
// 服务商通过本API文档提供的接口，查询商户和微工卡的授权关系、生成预授权的token口令、核身预下单、核身结果的查询等。
//
// API version: 1.5.2

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.payrollcard.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** RelationEntity */
public class RelationEntity {
  /** 用户OpenID 说明：用户OpenID */
  @SerializedName("openid")
  private String openid;

  /** 商户号 说明：商户号 */
  @SerializedName("mchid")
  private String mchid;

  /** 特约商户号 说明：特约商户号 */
  @SerializedName("sub_mchid")
  private String subMchid;

  /** 授权状态 说明：授权状态：UNAUTHORIZED：未授权 AUTHORIZED：已授权 DEAUTHORIZED：已取消授权 */
  @SerializedName("authorize_state")
  private String authorizeState;

  /** 授权时间 说明：授权时间 */
  @SerializedName("authorize_time")
  private String authorizeTime;

  /**
   * 取消授权时间
   * 说明：取消授权时间，遵循RFC3339标准格式，格式为yyyy-MM-DDThh:mm:ss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC
   * 8小时，即北京时间）。
   */
  @SerializedName("deauthorize_time")
  private String deauthorizeTime;

  /** 开通状态 说明：微工卡的开通状态：UNREGISTERED：未开通；REGISTERED：已开通；CLOSED：已关闭 */
  @SerializedName("register_state")
  private PayrollCardRegisterState registerState;

  /**
   * 开通时间
   * 说明：开通时间，未开通时不返回。遵循RFC3339标准格式，格式为yyyy-MM-DDThh:mm:ss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC
   * 8小时，即北京时间）。
   */
  @SerializedName("register_time")
  private String registerTime;

  /**
   * 关闭时间
   * 说明：关闭时间，仅当开通状态是已关闭时返回。遵循RFC3339标准格式，格式为yyyy-MM-DDThh:mm:ss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC
   * 8小时，即北京时间）。
   */
  @SerializedName("close_time")
  private String closeTime;

  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }

  public String getMchid() {
    return mchid;
  }

  public void setMchid(String mchid) {
    this.mchid = mchid;
  }

  public String getSubMchid() {
    return subMchid;
  }

  public void setSubMchid(String subMchid) {
    this.subMchid = subMchid;
  }

  public String getAuthorizeState() {
    return authorizeState;
  }

  public void setAuthorizeState(String authorizeState) {
    this.authorizeState = authorizeState;
  }

  public String getAuthorizeTime() {
    return authorizeTime;
  }

  public void setAuthorizeTime(String authorizeTime) {
    this.authorizeTime = authorizeTime;
  }

  public String getDeauthorizeTime() {
    return deauthorizeTime;
  }

  public void setDeauthorizeTime(String deauthorizeTime) {
    this.deauthorizeTime = deauthorizeTime;
  }

  public PayrollCardRegisterState getRegisterState() {
    return registerState;
  }

  public void setRegisterState(PayrollCardRegisterState registerState) {
    this.registerState = registerState;
  }

  public String getRegisterTime() {
    return registerTime;
  }

  public void setRegisterTime(String registerTime) {
    this.registerTime = registerTime;
  }

  public String getCloseTime() {
    return closeTime;
  }

  public void setCloseTime(String closeTime) {
    this.closeTime = closeTime;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationEntity {\n");
    sb.append("    openid: ").append(toIndentedString(openid)).append("\n");
    sb.append("    mchid: ").append(toIndentedString(mchid)).append("\n");
    sb.append("    subMchid: ").append(toIndentedString(subMchid)).append("\n");
    sb.append("    authorizeState: ").append(toIndentedString(authorizeState)).append("\n");
    sb.append("    authorizeTime: ").append(toIndentedString(authorizeTime)).append("\n");
    sb.append("    deauthorizeTime: ").append(toIndentedString(deauthorizeTime)).append("\n");
    sb.append("    registerState: ").append(toIndentedString(registerState)).append("\n");
    sb.append("    registerTime: ").append(toIndentedString(registerTime)).append("\n");
    sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
