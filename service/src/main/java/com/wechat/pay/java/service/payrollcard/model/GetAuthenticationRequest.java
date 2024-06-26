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

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/** GetAuthenticationRequest */
public class GetAuthenticationRequest {
  /** 特约商户号 说明：特约商户号 */
  @SerializedName("sub_mchid")
  @Expose(serialize = false)
  private String subMchid;

  /** 商家核身单号 说明：商户系统内部的商家核身单号，要求此参数只能由数字、大小写字母组成，在服务商内部唯一 */
  @SerializedName("authenticate_number")
  @Expose(serialize = false)
  private String authenticateNumber;

  public String getSubMchid() {
    return subMchid;
  }

  public void setSubMchid(String subMchid) {
    this.subMchid = subMchid;
  }

  public String getAuthenticateNumber() {
    return authenticateNumber;
  }

  public void setAuthenticateNumber(String authenticateNumber) {
    this.authenticateNumber = authenticateNumber;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAuthenticationRequest {\n");
    sb.append("    subMchid: ").append(toIndentedString(subMchid)).append("\n");
    sb.append("    authenticateNumber: ").append(toIndentedString(authenticateNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
