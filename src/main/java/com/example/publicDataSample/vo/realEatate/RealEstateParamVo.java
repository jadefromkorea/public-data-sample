package com.example.publicDataSample.vo.realEatate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RealEstateParamVo {
    /** url */
    private String baseUrl;
    /** 공공데이터포털에서 받은 인증키 */
    private String serviceKey;
    /** 한 페이지 결과 수 */
    private int numOfRows;
    /** 페이지 번호 */
    private int pageNo;
    /** 지역코드 */
    private String lawdCd;
    /** 계약월 */
    private String dealYmd;
}
