package com.example.publicDataSample.vo.Stock;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class StockInfo {
    private Header header;

    private StockPriceInfo body;
}
