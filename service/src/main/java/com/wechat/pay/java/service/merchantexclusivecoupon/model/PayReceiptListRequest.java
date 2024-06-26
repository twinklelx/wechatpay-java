// Copyright 2021 Tencent Inc. All rights reserved.
//
// 营销商家券对外API
//
// No description provided (generated by Openapi Generator
// https://github.com/openapitools/openapi-generator)
//
// API version: 0.0.11

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.merchantexclusivecoupon.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/** PayReceiptListRequest */
public class PayReceiptListRequest {
  /** 商家券批次号 说明：由微信支付生成，调用创建商家券API成功时返回的唯一批次ID */
  @SerializedName("stock_id")
  @Expose(serialize = false)
  private String stockId;

  /**
   * 商家券code 说明：券的唯一标识。 在WECHATPAY\\_MODE的券code模式下，商家券code是由微信支付生成的唯一ID；
   * 在MERCHANT\\_UPLOAD、MERCHANT\\_API的券code模式下，商家券code是由商户上传或指定，在批次下保证唯一；
   */
  @SerializedName("coupon_code")
  @Expose(serialize = false)
  private String couponCode;

  /** 补差付款请求单号 说明：商户调用补差付款API时填写的“业务请求唯一单号” */
  @SerializedName("out_subsidy_no")
  @Expose(serialize = false)
  private String outSubsidyNo;

  public String getStockId() {
    return stockId;
  }

  public void setStockId(String stockId) {
    this.stockId = stockId;
  }

  public String getCouponCode() {
    return couponCode;
  }

  public void setCouponCode(String couponCode) {
    this.couponCode = couponCode;
  }

  public String getOutSubsidyNo() {
    return outSubsidyNo;
  }

  public void setOutSubsidyNo(String outSubsidyNo) {
    this.outSubsidyNo = outSubsidyNo;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayReceiptListRequest {\n");
    sb.append("    stockId: ").append(toIndentedString(stockId)).append("\n");
    sb.append("    couponCode: ").append(toIndentedString(couponCode)).append("\n");
    sb.append("    outSubsidyNo: ").append(toIndentedString(outSubsidyNo)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
