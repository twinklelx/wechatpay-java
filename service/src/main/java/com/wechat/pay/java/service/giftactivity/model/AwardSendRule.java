// Copyright 2021 Tencent Inc. All rights reserved.
//
// 支付有礼活动对外API
//
// No description provided (generated by Openapi Generator
// https://github.com/openapitools/openapi-generator)
//
// API version: 0.1.2

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.giftactivity.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** AwardSendRule */
public class AwardSendRule {
  /** 满送活动奖品发放规则 说明： */
  @SerializedName("full_send_rule")
  private FullSendRule fullSendRule;

  public FullSendRule getFullSendRule() {
    return fullSendRule;
  }

  public void setFullSendRule(FullSendRule fullSendRule) {
    this.fullSendRule = fullSendRule;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwardSendRule {\n");
    sb.append("    fullSendRule: ").append(toIndentedString(fullSendRule)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}