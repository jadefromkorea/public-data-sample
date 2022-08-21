package com.example.publicDataSample.vo.Stock;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockParamVo {
    /** url */
    private String baseUrl;
    /** 공공데이터포털에서 받은 인증키 */
    private String serviceKey;
    /** 한 페이지 결과 수 */
    private int numOfRows;
    /** 페이지 번호 */
    private int pageNo;
    /** 구분(xml, json) Default: xml */
    private String resultType;
    /** 검색값과 기준일자가 일치하는 데이터를 검색 */
    private String basDt;
    /** 기준일자가 검색값보다 크거나 같은 데이터를 검색 */
    private String beginBasDt;
    /** 기준일자가 검색값보다 작은 데이터를 검색 */
    private String endBasDt;
    /** 기준일자값이 검색값을 포함하는 데이터를 검색 */
    private String likeBasDt;
    /** 단축코드가 검색값을 포함하는 데이터를 검색 */
    private String likeSrtnCd;
    /** 검색값과 ISIN코드이 일치하는 데이터를 검색 */
    private String isinCd;
    /** ISIN코드가 검색값을 포함하는 데이터를 검색 */
    private String likeIsinCd;
    /** 검색값과 종목명이 일치하는 데이터를 검색 */
    private String itmsNm;
    /** 종목명이 검색값을 포함하는 데이터를 검색 */
    private String likeItmsNm;
    /** 검색값과 시장구분이 일치하는 데이터를 검색 */
    private String mrktCls;
    /** 대비가 검색값보다 크거나 같은 데이터를 검색 */
    private String beginVs;
    /** 대비가 검색값보다 작은 데이터를 검색 */
    private String endVs;
    /** 등락률이 검색값보다 크거나 같은 데이터를 검색 */
    private String beginFltRt;
    /** 등락률이 검색값보다 작은 데이터를 검색 */
    private String endFltRt;
    /** 거래량이 검색값보다 크거나 같은 데이터를 검색 */
    private String beginTrqu;
    /** 거래량이 검색값보다 작은 데이터를 검색 */
    private String endTrqu;
    /** 거래대금이 검색값보다 크거나 같은 데이터를 검색 */
    private String beginTrPrc;
    /** 거래대금이 검색값보다 작은 데이터를 검색 */
    private String endTrPrc;
    /** 상장주식수가 검색값보다 크거나 같은 데이터를 검색 */
    private String beginLstgStCnt;
    /** 상장주식수가 검색값보다 작은 데이터를 검색 */
    private String endLstgStCnt;
    /** 시가총액이 검색값보다 크거나 같은 데이터를 검색 */
    private String beginMrktTotAmt;
    /** 시가총액이 검색값보다 작은 데이터를 검색 */
    private String endMrktTotAmt;

}
