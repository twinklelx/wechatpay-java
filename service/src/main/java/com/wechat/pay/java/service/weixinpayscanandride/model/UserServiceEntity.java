// Copyright 2021 Tencent Inc. All rights reserved.
//
// 公共出行平台代扣服务对外API
//
// 公共出行平台代扣服务对外API
//
// API version: 1.0.0

// Code generated by WechatPay APIv3 Generator based on [OpenAPI
// Generator](https://openapi-generator.tech); DO NOT EDIT.

package com.wechat.pay.java.service.weixinpayscanandride.model;

import static com.wechat.pay.java.core.util.StringUtil.toIndentedString;

import com.google.gson.annotations.SerializedName;

/** UserServiceEntity */
public class UserServiceEntity {
  /** 代扣签约ID 说明：签约成功后，微信返回代扣签约ID */
  @SerializedName("contract_id")
  private String contractId;

  /** 用户服务可用状态 说明：用户服务可用状态，枚举值有： */
  @SerializedName("user_service_state")
  private UserServiceStateEnum userServiceState;

  /** 不可用状态描述 说明：blocked服务状态描述，返回用户状态为BLOCKED，会返回该字段，具体描述的枚举值如下： */
  @SerializedName("block_reason")
  private BlockReasonEnum blockReason;

  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  public UserServiceStateEnum getUserServiceState() {
    return userServiceState;
  }

  public void setUserServiceState(UserServiceStateEnum userServiceState) {
    this.userServiceState = userServiceState;
  }

  public BlockReasonEnum getBlockReason() {
    return blockReason;
  }

  public void setBlockReason(BlockReasonEnum blockReason) {
    this.blockReason = blockReason;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserServiceEntity {\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    userServiceState: ").append(toIndentedString(userServiceState)).append("\n");
    sb.append("    blockReason: ").append(toIndentedString(blockReason)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
