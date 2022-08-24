package com.example.publicDataSample.sample;

import com.example.publicDataSample.vo.Stock.StockInfo;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

@Getter
@Setter
@Slf4j
@Controller
public class SampleController {

    @ResponseBody
    @GetMapping("/getPublicDataSample")
    public String publicDataSample() throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://openapi.molit.go.kr/OpenAPI_ToolInstallPackage/service/rest/RTMSOBJSvc/getRTMSDataSvcAptTradeDev"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=" + "3FOJGm5UntqvCnmXphAeKmHuhCe6nAsyJEokJF2MiExhi1Z3TgtPhT7SgilVkDldOJPFN4F1l9a%2F%2F4hEe1kBKg%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("LAWD_CD","UTF-8") + "=" + URLEncoder.encode("11110", "UTF-8")); /*지역코드*/
        urlBuilder.append("&" + URLEncoder.encode("DEAL_YMD","UTF-8") + "=" + URLEncoder.encode("201512", "UTF-8")); /*계약월*/

        URL url = new URL(urlBuilder.toString());

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/xml");

        log.info(">>>>> Response code: " + conn.getResponseCode());

        BufferedReader rd;

        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }

        StringBuilder sb = new StringBuilder();

        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }

        rd.close();
        conn.disconnect();

        // xml -> 자바 객체
        JSONObject jsonObject = XML.toJSONObject(sb.toString());

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = objectMapper.readValue(jsonObject.toString(), Map.class);

//        System.out.println(sb.toString());

        return map.toString();
//        return jsonObject.toString();
//        return sb.toString();
//        return new Gson().toJson(sb);
//        return new GsonBuilder().create().toJson(sb);
    }


    /**
     * 주식시세
     * @return
     * @throws IOException
     */
    @ResponseBody
    @GetMapping("/getStockPriceInfo")
    public StockInfo getStockPriceInfo() throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1160100/service/GetStockSecuritiesInfoService/getStockPriceInfo"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=" + "3FOJGm5UntqvCnmXphAeKmHuhCe6nAsyJEokJF2MiExhi1Z3TgtPhT7SgilVkDldOJPFN4F1l9a//4hEe1kBKg=="); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("resultType","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
        urlBuilder.append("&" + URLEncoder.encode("basDt","UTF-8") + "=" + URLEncoder.encode("20220819", "UTF-8")); /*지역코드*/
//        urlBuilder.append("&" + URLEncoder.encode("DEAL_YMD","UTF-8") + "=" + URLEncoder.encode("201512", "UTF-8")); /*계약월*/

        URL url = new URL(urlBuilder.toString());

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
//        conn.setRequestProperty("Content-type", "application/xml");

        log.info(">>>>> Response code: " + conn.getResponseCode());

        BufferedReader rd;

        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }

        StringBuilder sb = new StringBuilder();

        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }

        rd.close();
        conn.disconnect();

        log.info(">>>>> sb.toString(): " + sb.toString());
//        log.info(">>>>> Gson().toJson(sb): " + new Gson().toJson(sb));

        // xml -> 자바 객체
//        JSONObject jsonObject = XML.toJSONObject(sb.toString());
//        log.info(">>>>> Gson().toJson(jsonObject): " + new Gson().toJson(jsonObject));

//        ObjectMapper objectMapper = new ObjectMapper();
//        StockInfo stockInfo = objectMapper.readValue(jsonObject.toString(), StockInfo.class);
//        StockPriceInfo stockPriceInfo = objectMapper.readValue(jsonObject.toString(), StockPriceInfo.class);

//        log.info(">>>>> Gson().toJson(stockInfo): " + new Gson().toJson(stockInfo));
//        log.info(">>>>> Gson().toJson(stockPriceInfo): " + new Gson().toJson(stockPriceInfo));

//        log.info(">>>>> Gson().toJson(sb): " + new Gson().toJson(sb));

        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode jsonNode = objectMapper.readTree(sb.toString());

        StockInfo stockInfo = objectMapper.readValue(jsonNode.get("response").toString(), StockInfo.class);

//        String stockInfoJsonStr = "";
        log.info(">>>>> Gson().toJson(stockInfo): " + new Gson().toJson(stockInfo));




//        System.out.println(sb.toString());

//        return sb.toString();
        return stockInfo;
    }


    @GetMapping("/mapSample")
    public String mapSample() {
        log.info(">>>>> mapSample <<<<<<");
        return "mapSample";
    }

}
