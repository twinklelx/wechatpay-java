// Copyright 2021 Tencent Inc. All rights reserved.
//
// Native支付
//
// Native支付API
//
// API version: 1.2.3

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.payment.nativepay.model;

import com.google.gson.annotations.SerializedName;
import com.wechat.pay.java.core.util.GsonUtil;

/** CloseRequest */
public class CloseRequest {
  /** mchid 说明：直连商户号 */
  @SerializedName("mchid")
  private String mchid;

  public String getMchid() {
    return mchid;
  }

  public void setMchid(String mchid) {
    this.mchid = mchid;
  }

  @Override
  public String toString() {
    return GsonUtil.getGson().toJson(this);
  }
}
