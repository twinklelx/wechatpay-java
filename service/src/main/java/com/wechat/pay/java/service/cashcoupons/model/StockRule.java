// Copyright 2021 Tencent Inc. All rights reserved.
//
// 微信支付营销系统开放API
//
// 新增立减金api
//
// API version: 3.4.0

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.cashcoupons.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** StockRule */
public class StockRule {
  /** 发放总上限 说明：最大发券数 */
  @SerializedName("max_coupons")
  private Long maxCoupons;

  /** 总预算 说明：总消耗金额，单位分 */
  @SerializedName("max_amount")
  private Long maxAmount;

  /** 单天发放上限金额 说明：单天最高消耗金额，单位分 */
  @SerializedName("max_amount_by_day")
  private Long maxAmountByDay;

  /** 单个用户可领个数 说明：单个用户可领个数 */
  @SerializedName("max_coupons_per_user")
  private Integer maxCouponsPerUser;

  /** 是否开启自然人限制 说明：true-是；false-否，默认否 */
  @SerializedName("natural_person_limit")
  private Boolean naturalPersonLimit;

  /** api发券防刷 说明：true-是；false-否，默认否 */
  @SerializedName("prevent_api_abuse")
  private Boolean preventApiAbuse;

  public Long getMaxCoupons() {
    return maxCoupons;
  }

  public void setMaxCoupons(Long maxCoupons) {
    this.maxCoupons = maxCoupons;
  }

  public Long getMaxAmount() {
    return maxAmount;
  }

  public void setMaxAmount(Long maxAmount) {
    this.maxAmount = maxAmount;
  }

  public Long getMaxAmountByDay() {
    return maxAmountByDay;
  }

  public void setMaxAmountByDay(Long maxAmountByDay) {
    this.maxAmountByDay = maxAmountByDay;
  }

  public Integer getMaxCouponsPerUser() {
    return maxCouponsPerUser;
  }

  public void setMaxCouponsPerUser(Integer maxCouponsPerUser) {
    this.maxCouponsPerUser = maxCouponsPerUser;
  }

  public Boolean getNaturalPersonLimit() {
    return naturalPersonLimit;
  }

  public void setNaturalPersonLimit(Boolean naturalPersonLimit) {
    this.naturalPersonLimit = naturalPersonLimit;
  }

  public Boolean getPreventApiAbuse() {
    return preventApiAbuse;
  }

  public void setPreventApiAbuse(Boolean preventApiAbuse) {
    this.preventApiAbuse = preventApiAbuse;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockRule {\n");
    sb.append("    maxCoupons: ").append(toIndentedString(maxCoupons)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    maxAmountByDay: ").append(toIndentedString(maxAmountByDay)).append("\n");
    sb.append("    maxCouponsPerUser: ").append(toIndentedString(maxCouponsPerUser)).append("\n");
    sb.append("    naturalPersonLimit: ").append(toIndentedString(naturalPersonLimit)).append("\n");
    sb.append("    preventApiAbuse: ").append(toIndentedString(preventApiAbuse)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
