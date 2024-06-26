// Copyright 2021 Tencent Inc. All rights reserved.
//
// 银行营销对外API
//
// # 前言
// 银行营销API是专为银行商户设置的一套API。目前仅包含“创建快捷交易协议号上传任务”接口，供银行上传快捷交易协议号文件。微信侧收到文件中，将快捷交易协议号转换为微信用户id，存储到指定的号码包文件中。
//
// API version: 0.1.0

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.marketingbankpackages.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/** ListTaskRequest */
public class ListTaskRequest {
  /** 号码包id 说明：号码包唯一标识符。可在微信支付商户平台创建号码包后获得。 */
  @SerializedName("package_id")
  @Expose(serialize = false)
  private String packageId;

  /** 文件名 说明：任务上传的文件名 */
  @SerializedName("filename")
  @Expose(serialize = false)
  private String filename;

  /** 分页页码 说明：分页页码，页码从0开始 */
  @SerializedName("offset")
  @Expose(serialize = false)
  private Long offset;

  /** 分页大小 说明：分页大小，单次最多查询20条记录 */
  @SerializedName("limit")
  @Expose(serialize = false)
  private Long limit;

  /** 任务状态 说明：上传任务的状态：PROCESSING - 处理中，FINISHED - 已完成 */
  @SerializedName("status")
  @Expose(serialize = false)
  private TaskStatus status;

  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }

  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
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

  public TaskStatus getStatus() {
    return status;
  }

  public void setStatus(TaskStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListTaskRequest {\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
