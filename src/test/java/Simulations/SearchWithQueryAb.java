package voteGD.com;
import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class SearchWithQueryAb extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://votegd.com")
      .inferHtmlResources()
    ;
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7");
    headers_0.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_0.put("accept-language", "ru-RU,ru;q=0.9");
    headers_0.put("priority", "u=0, i");
    headers_0.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_0.put("sec-ch-ua-mobile", "?0");
    headers_0.put("sec-ch-ua-platform", "Linux");
    headers_0.put("sec-fetch-dest", "document");
    headers_0.put("sec-fetch-mode", "navigate");
    headers_0.put("sec-fetch-site", "same-origin");
    headers_0.put("sec-fetch-user", "?1");
    headers_0.put("upgrade-insecure-requests", "1");
    headers_0.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_1 = new HashMap<>();
    headers_1.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    headers_1.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_1.put("sec-ch-ua-mobile", "?0");
    headers_1.put("sec-ch-ua-platform", "Linux");
    
    Map<CharSequence, String> headers_7 = new HashMap<>();
    headers_7.put("accept", "*/*");
    headers_7.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_7.put("accept-language", "ru-RU,ru;q=0.9");
    headers_7.put("origin", "https://votegd.com");
    headers_7.put("priority", "u=1, i");
    headers_7.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_7.put("sec-ch-ua-mobile", "?0");
    headers_7.put("sec-ch-ua-platform", "Linux");
    headers_7.put("sec-fetch-dest", "empty");
    headers_7.put("sec-fetch-mode", "cors");
    headers_7.put("sec-fetch-site", "cross-site");
    headers_7.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_8 = new HashMap<>();
    headers_8.put("accept", "*/*");
    headers_8.put("accept-encoding", "gzip, deflate, br, zstd");
    headers_8.put("accept-language", "ru-RU,ru;q=0.9");
    headers_8.put("origin", "https://votegd.com");
    headers_8.put("priority", "u=1, i");
    headers_8.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_8.put("sec-ch-ua-mobile", "?0");
    headers_8.put("sec-ch-ua-platform", "Linux");
    headers_8.put("sec-fetch-dest", "empty");
    headers_8.put("sec-fetch-mode", "no-cors");
    headers_8.put("sec-fetch-site", "cross-site");
    headers_8.put("user-agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_9 = new HashMap<>();
    headers_9.put("Upgrade-Insecure-Requests", "1");
    headers_9.put("User-Agent", "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    headers_9.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_9.put("sec-ch-ua-mobile", "?0");
    headers_9.put("sec-ch-ua-platform", "Linux");
    
    String uri2 = "https://fonts.gstatic.com/s/montserrat/v26";
    
    String uri3 = "https://www.google-analytics.com/g/collect";
    
    String uri4 = "https://mc.yandex.ru";

    ScenarioBuilder scn = scenario("SearchWithQueryAb")
      .exec(
        http("request_0")
          .get("/people/search/?query=%D0%90%D0%B1")
          .headers(headers_0)
          .check(bodyBytes().is(RawFileBody("searchwithqueryab/0000_response.html")))
          .resources(
            http("request_1")
              .get(uri4 + "/metrika/tag.js")
              .headers(headers_1)
              .check(bodyBytes().is(RawFileBody("searchwithqueryab/0001_response.js"))),
            http("request_2")
              .get(uri2 + "/JTUSjIg1_i6t8kCHKm459W1hyzbi.woff2"),
            http("request_3")
              .get(uri2 + "/JTUSjIg1_i6t8kCHKm459Wlhyw.woff2"),
            http("request_4")
              .get("/layout/fonts/fontawesome-webfont.woff2?v=4.7.0"),
            http("request_5")
              .get("/layout/fonts/Linearicons.ttf"),
            http("request_6")
              .get("/img/sab.jpg")
              .headers(headers_1)
              .check(bodyBytes().is(RawFileBody("searchwithqueryab/0006_response.jpeg"))),
            http("request_7")
              .get(uri4 + "/watch/78422502?wmode=7&page-url=https%3A%2F%2Fvotegd.com%2Fpeople%2Fsearch%2F%3Fquery%3D%25D0%2590%25D0%25B1&page-ref=https%3A%2F%2Fvotegd.com%2Fpeople%2Fsearch%2F%3Fquery%3D%25D0%2590&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&browser-info=pv%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A0%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A0%3Als%3A1675303360769%3Ahid%3A858452232%3Az%3A300%3Ai%3A20240817151615%3Aet%3A1723889775%3Ac%3A1%3Arn%3A1014954056%3Arqn%3A195%3Au%3A1723885632123336677%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Ads%3A0%2C0%2C225%2C3%2C1%2C0%2C%2C%2C%2C%2C%2C%2C%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Ans%3A1723889774856%3Agi%3AR0ExLjEuMTczNjQ1OTI0OS4xNzIzODg1NjMy%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723889775%3At%3A%D0%90%D0%B1%20%7C%20%D0%9F%D0%BE%D0%B8%D1%81%D0%BA%20%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D0%BA%D0%BE%D0%B2%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5&t=gdpr(14)clc(0-0-0)rqnt(1)aw(1)rcm(0)cdl(na)eco(21037568)ti(1)")
              .headers(headers_7),
            http("request_8")
              .post(uri3 + "?v=2&tid=G-126E14W1P6&gtm=45je48e0v9113022429za200&_p=1723889775097&gcd=13l3l3l3l1&npa=0&dma=0&tag_exp=0&cid=1736459249.1723885632&ul=ru-ru&sr=1920x1080&uaa=x86&uab=64&uafvl=Not)A%253BBrand%3B99.0.0.0%7CGoogle%2520Chrome%3B127.0.6533.119%7CChromium%3B127.0.6533.119&uamb=0&uam=&uap=Linux&uapv=6.5.0&uaw=0&are=1&frm=0&pscdl=noapi&_s=1&sid=1723885632&sct=1&seg=1&dl=https%3A%2F%2Fvotegd.com%2Fpeople%2Fsearch%2F%3Fquery%3D%25D0%2590%25D0%25B1&dr=https%3A%2F%2Fvotegd.com%2Fpeople%2Fsearch%2F%3Fquery%3D%25D0%2590&dt=%D0%90%D0%B1%20%7C%20%D0%9F%D0%BE%D0%B8%D1%81%D0%BA%20%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D0%BA%D0%BE%D0%B2%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5&en=page_view&_ee=1&tfd=325")
              .headers(headers_8),
            http("request_9")
              .get(uri4 + "/metrika/metrika_match.html")
              .headers(headers_9)
          )
      )
      .pause(3)
      .exec(
        http("request_10")
          .post(uri3 + "?v=2&tid=G-126E14W1P6&gtm=45je48e0v9113022429za200&_p=1723889775097&gcd=13l3l3l3l1&npa=0&dma=0&tag_exp=0&cid=1736459249.1723885632&ul=ru-ru&sr=1920x1080&uaa=x86&uab=64&uafvl=Not)A%253BBrand%3B99.0.0.0%7CGoogle%2520Chrome%3B127.0.6533.119%7CChromium%3B127.0.6533.119&uamb=0&uam=&uap=Linux&uapv=6.5.0&uaw=0&are=1&frm=0&pscdl=noapi&_eu=AEA&_s=2&sid=1723885632&sct=1&seg=1&dl=https%3A%2F%2Fvotegd.com%2Fpeople%2Fsearch%2F%3Fquery%3D%25D0%2590%25D0%25B1&dr=https%3A%2F%2Fvotegd.com%2Fpeople%2Fsearch%2F%3Fquery%3D%25D0%2590&dt=%D0%90%D0%B1%20%7C%20%D0%9F%D0%BE%D0%B8%D1%81%D0%BA%20%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D0%BA%D0%BE%D0%B2%20%D0%B2%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D0%B5&en=view_search_results&ep.search_term=%D0%90%D0%B1&_et=1&tfd=5326")
          .headers(headers_8)
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
