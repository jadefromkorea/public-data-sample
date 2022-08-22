package com.example.publicDataSample.vo.Stock;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockItem {
    /** 기준일자 */
    private String basDt;
    /** 종목 코드보다 짧으면서 유일성이 보장되는 코드(6자리) */
    private String srtnCd;
    /** 현선물 통합상품의 종목 코드(12자리) */
    private String isinCd;
    /** 종목의 명칭 */
    private String itmsNm;
    /** 주식의 시장 구분 (KOSPI/KOSDAQ/KONEX 중 1) */
    private String mrktCtg;
    /** 정규시장의 매매시간종료시까지 형성되는 최종가격 */
    private int clpr;
    /** 전일 대비 등락 */
    private int vs;
    /** 전일 대비 등락에 따른 비율 */
    private float fltRt;
    /** 정규시장의 매매시간개시후 형성되는 최초가격 */
    private int mkp;
    /** 하루 중 가격의 최고치 */
    private int hipr;
    /** 하루 중 가격의 최저치 */
    private int lopr;
    /** 체결수량의 누적 합계 */
    private long trqu;
    /** 거래건 별 체결가격 * 체결수량의 누적 합계 */
    private long trPrc;
    /** 종목의 상장주식수 */
    private long lstgStCnt;
    /** 종가 * 상장주식수 */
    private long mrktTotAmt;
}
