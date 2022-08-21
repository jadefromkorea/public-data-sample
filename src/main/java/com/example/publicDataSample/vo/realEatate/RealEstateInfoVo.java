package com.example.publicDataSample.vo.realEatate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RealEstateInfoVo {
    /** 결과코드, ex) 00., 크기: 2 */
    private String resultCode;
    /** 결과메세지, ex) OK., 크기: 50 */
    private String resultMsg;
    /** 한 페이지 결과 수, ex) 10, 크기: 4 */
    private int numOfRows;
    /** 페이지 번호, ex) 1, 크기: 4 */
    private int pageNo;
    /** 전체 결과 수, ex) 3, 크기: 4 */
    private int totalCount;
    /** 거래금액(만원), ex) 82500, 크기: 40 */
    private int dealAmount;
    /** 건축년도, ex) 2008, 크기: 4 */
    private String buildYear;
    /** 계약년도, ex) 2015, 크기: 4 */
    private String dealYear;
    /** 도로명, ex) 사직로8길, 크기: 20 */
    private String roadName;
    /** 도로명건물본번, ex) 4, 크기: 5 */
    private String roadNameBonbun;
    /** 도로명건물부번, ex) 0, 크기: 5 */
    private String roadNameBubun;
    /** 도로명시군구코드, ex) 11110, 크기: 5 */
    private String roadNameSigunguCode;
    /** 도로명코드, ex) 3, 크기: 2 */
    private String roadNameSeq;
    /** 도로명지상지하코드, ex) 0, 크기: 1 */
    private String roadNameBasementCode;
    /** 도로명코드, ex) 4100135, 크기: 7 */
    private String roadNameCode;
    /** 법정동, ex) 사직동, 크기: 40 */
    private String dong;
    /** 법정동본번코드, ex) 9, 크기: 4 */
    private String bonbun;
    /** 법정동부번코드, ex) 0, 크기: 4 */
    private String bubun;
    /** 대상물건의 시군구코드, ex) 11110, 크기: 5 */
    private String sigunguCode;
    /** 대상물건의 읍면동코드, ex) 11500, 크기: 5 */
    private String eubmyundongCode;
    /** 법정동지번코드, ex) 1, 크기: 1 */
    private String landCode;
    /** 아파트명, ex) 광화문풍림스페이스본(9-0), 크기: 40 */
    private String apartmentName;
    /** 계약월, ex) 12, 크기: 2 */
    private int dealMonth;
    /** 일, ex) 1, 크기: 6 */
    private int dealDay;
    /** 일련번호, ex) 11110-2203, 크기: 14 */
    private String seq;
    /** 전용면적(㎡), ex) 94.51, 크기: 20 */
    private String areaforExclusiveUse;
    /** 지번, ex) 9, 크기: 10 */
    private int jibun;
    /** 지역코드, ex) 11110, 크기: 5 */
    private String regionalCode;
    /** 층, ex) 11, 크기: 4 */
    private String floor;
    /** 해제여부, ex) O, 크기: 1 */
    private String cancelDealType;
    /** 해제사유발생일, ex) 21.01.27, 크기: 8 */
    private String cancelDealDay;
    /** 중개 및 직거래 여부, ex) 중개거래, 크기: 10 */
    private String reqGbn;
    /** 시군구 단위, ex) 서울 서초구, 크기: 150 */
    private String rdealerLawdnm;
}
