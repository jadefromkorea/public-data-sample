package com.example.publicDataSample.vo.Stock;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockPriceInfo {
    /** 한 페이지 결과 수 */
    private String numOfRows;

    /** 현재 조회된 데이터의 페이지 번호 */
    private String pageNum;

    private StockItemVo stockItem;

    /** 전체 데이터의 총 수 */
    private String totalCount;
}
