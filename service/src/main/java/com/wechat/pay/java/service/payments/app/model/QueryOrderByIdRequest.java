// Copyright 2021 Tencent Inc. All rights reserved.
//
// APP支付
//
// APP支付API
//
// API version: 1.2.3

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.payments.app.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/** QueryOrderByIdRequest */
public class QueryOrderByIdRequest {
  /** transactionId */
  @SerializedName("transaction_id")
  @Expose(serialize = false)
  private String transactionId;

  /** mchid 说明：直连商户号 */
  @SerializedName("mchid")
  @Expose(serialize = false)
  private String mchid;

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public String getMchid() {
    return mchid;
  }

  public void setMchid(String mchid) {
    this.mchid = mchid;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryOrderByIdRequest {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    mchid: ").append(toIndentedString(mchid)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
