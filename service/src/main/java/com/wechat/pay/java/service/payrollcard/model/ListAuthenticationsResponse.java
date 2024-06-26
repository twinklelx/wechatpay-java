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
import java.util.List;

/** ListAuthenticationsResponse */
public class ListAuthenticationsResponse {
  /** 查询结果记录列表 说明：查询结果记录列表 */
  @SerializedName("data")
  private List<AuthenticationEntity> data;

  /** 总记录条数 说明：经过条件筛选，查询到的记录总数 */
  @SerializedName("total_count")
  private Long totalCount;

  /** 记录起始位置 说明：该次请求资源的起始位置，请求中包含偏移量时应答消息返回相同偏移量，否则返回默认值0 */
  @SerializedName("offset")
  private Long offset;

  /** 本次返回条数 说明：经过条件筛选，本次查询到的记录条数 */
  @SerializedName("limit")
  private Long limit;

  public List<AuthenticationEntity> getData() {
    return data;
  }

  public void setData(List<AuthenticationEntity> data) {
    this.data = data;
  }

  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }

  public Long getOffset() {
    return offset;
  }

  public void setOffset(Long offset) {
    this.offset = offset;
  }

  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAuthenticationsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
