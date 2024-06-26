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
import com.wechat.pay.java.core.cipher.Encryption;
import java.util.function.UnaryOperator;

/** TransferDetailInput */
public class TransferDetailInput {
  /** 商家明细单号 说明：商户系统内部区分转账批次单下不同转账明细单的唯一标识 */
  @SerializedName("out_detail_no")
  private String outDetailNo;

  /** 转账金额 说明：转账金额单位为“分” */
  @SerializedName("transfer_amount")
  private Long transferAmount;

  /** 转账备注 说明：单条转账备注（微信用户会收到该备注），UTF8编码，最多允许32个字符 */
  @SerializedName("transfer_remark")
  private String transferRemark;

  /** 收款用户OpenID 说明：收款用户OpenID。如果转账特约商户授权类型是INFORMATION_AUTHORIZATION_TYPE，对应的是特约商户公众号下的OpenID。 */
  @SerializedName("openid")
  private String openid;

  /**
   * 收款用户姓名 说明：收款用户姓名。采用标准RSA算法，公钥由微信侧提供 明细转账金额 >= 2,000时，该笔明细必须填写收款用户姓名
   * 同一批次转账明细中的姓名字段传入规则需保持一致，也即全部填写、或全部不填写 若商户传入收款用户姓名，微信支付会校验用户OpenID与姓名是否一致，并提供电子回单
   */
  @Encryption
  @SerializedName("user_name")
  private String userName;

  public String getOutDetailNo() {
    return outDetailNo;
  }

  public void setOutDetailNo(String outDetailNo) {
    this.outDetailNo = outDetailNo;
  }

  public Long getTransferAmount() {
    return transferAmount;
  }

  public void setTransferAmount(Long transferAmount) {
    this.transferAmount = transferAmount;
  }

  public String getTransferRemark() {
    return transferRemark;
  }

  public void setTransferRemark(String transferRemark) {
    this.transferRemark = transferRemark;
  }

  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferDetailInput {\n");
    sb.append("    outDetailNo: ").append(toIndentedString(outDetailNo)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    transferRemark: ").append(toIndentedString(transferRemark)).append("\n");
    sb.append("    openid: ").append(toIndentedString(openid)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public TransferDetailInput cloneWithCipher(UnaryOperator<String> s) {
    TransferDetailInput copy = new TransferDetailInput();
    copy.outDetailNo = outDetailNo;
    copy.transferAmount = transferAmount;
    copy.transferRemark = transferRemark;
    copy.openid = openid;
    if (userName != null && !userName.isEmpty()) {
      copy.userName = s.apply(userName);
    }
    return copy;
  }
}
