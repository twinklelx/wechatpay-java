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
import java.util.List;

/** ModifyAvailableMerchantRequest */
public class ModifyAvailableMerchantRequest {
  /** 创建批次的商户号 说明：批次创建方商户号 */
  @SerializedName("stock_creator_mchid")
  private String stockCreatorMchid;

  /** 增加可用商户列表 说明：增加可用商户列表 */
  @SerializedName("add_mchid_list")
  private List<String> addMchidList;

  /** 删除可用商户列表 说明：删除可用商户列表 */
  @SerializedName("delete_mchid_list")
  private List<String> deleteMchidList;

  public String getStockCreatorMchid() {
    return stockCreatorMchid;
  }

  public void setStockCreatorMchid(String stockCreatorMchid) {
    this.stockCreatorMchid = stockCreatorMchid;
  }

  public List<String> getAddMchidList() {
    return addMchidList;
  }

  public void setAddMchidList(List<String> addMchidList) {
    this.addMchidList = addMchidList;
  }

  public List<String> getDeleteMchidList() {
    return deleteMchidList;
  }

  public void setDeleteMchidList(List<String> deleteMchidList) {
    this.deleteMchidList = deleteMchidList;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyAvailableMerchantRequest {\n");
    sb.append("    stockCreatorMchid: ").append(toIndentedString(stockCreatorMchid)).append("\n");
    sb.append("    addMchidList: ").append(toIndentedString(addMchidList)).append("\n");
    sb.append("    deleteMchidList: ").append(toIndentedString(deleteMchidList)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
