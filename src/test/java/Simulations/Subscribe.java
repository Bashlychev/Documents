package voteGD.com;
import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class Subscribe extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://mc.yandex.ru")
      .inferHtmlResources()
      .acceptHeader("*/*")
      .acceptEncodingHeader("gzip, deflate, br")
      .acceptLanguageHeader("ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
      .userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/127.0.0.0 Safari/537.36");
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("origin", "https://votegd.com");
    headers_0.put("pragma", "no-cache");
    headers_0.put("priority", "u=4, i");
    headers_0.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_0.put("sec-ch-ua-mobile", "?0");
    headers_0.put("sec-ch-ua-platform", "Linux");
    headers_0.put("sec-fetch-dest", "empty");
    headers_0.put("sec-fetch-mode", "no-cors");
    headers_0.put("sec-fetch-site", "cross-site");
    
    Map<CharSequence, String> headers_3 = new HashMap<>();
    headers_3.put("pragma", "no-cache");
    headers_3.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_3.put("sec-ch-ua-mobile", "?0");
    headers_3.put("sec-ch-ua-platform", "Linux");
    headers_3.put("sec-fetch-dest", "script");
    headers_3.put("sec-fetch-mode", "no-cors");
    headers_3.put("sec-fetch-site", "cross-site");
    
    Map<CharSequence, String> headers_4 = new HashMap<>();
    headers_4.put("origin", "https://votegd.com");
    headers_4.put("pragma", "no-cache");
    headers_4.put("priority", "u=1, i");
    headers_4.put("sec-ch-ua", "Not)A;Brand\";v=\"99\", \"Google Chrome\";v=\"127\", \"Chromium\";v=\"127");
    headers_4.put("sec-ch-ua-mobile", "?0");
    headers_4.put("sec-ch-ua-platform", "Linux");
    headers_4.put("sec-fetch-dest", "empty");
    headers_4.put("sec-fetch-mode", "no-cors");
    headers_4.put("sec-fetch-site", "cross-site");
    
    String uri1 = "https://templatermonster.createsend.com/t/j/s/zjjikd";
    
    String uri2 = "https://www.google-analytics.com/g/collect";

    ScenarioBuilder scn = scenario("Subscribe")
      .exec(
        http("request_0")
          .post("/watch/78422502/1?page-url=https%3A%2F%2Fvotegd.com%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1723899123_58e78d7ca2be2a8694c7f5f17ba5b5dd5e39da98389dbfc435f03b6c3898ab5b&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A1%3Als%3A1611288404515%3Ahid%3A283034204%3Az%3A300%3Ai%3A20240817175244%3Aet%3A1723899165%3Ac%3A1%3Arn%3A826626279%3Arqn%3A49%3Au%3A1723808625578809752%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1723899123048%3Agi%3AR0ExLjEuMzM0MzkwMzc0LjE3MjM4MDg2MjU%3D%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723899165&t=gdpr(14)mc(p-1)clc(4-884-553)rqnt(3)aw(1)rcm(1)cdl(na)eco(21037568)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22__ym%22%3A%7B%22fi%22%3A%22a(1)b(PAFAAA%C2%843A)c(YWudgAH%2FOUrcSBPjw2F2eD8Xslr7WdkXhwYmUEzch1s%3D)%22%2C%22ite%22%3A1%7D%7D")
          .headers(headers_0)
          .resources(
            http("request_1")
              .post("/watch/78422502/1?page-url=form%3A%2F%2Fvotegd.com%2F%3Fp%3DFAAA%25C2%25843A&page-ref=https%3A%2F%2Fvotegd.com%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1723899123_58e78d7ca2be2a8694c7f5f17ba5b5dd5e39da98389dbfc435f03b6c3898ab5b&browser-info=ar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A3%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A1%3Als%3A1611288404515%3Ahid%3A283034204%3Az%3A300%3Ai%3A20240817175244%3Aet%3A1723899165%3Ac%3A1%3Arn%3A606670524%3Arqn%3A50%3Au%3A1723808625578809752%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1723899123048%3Agi%3AR0ExLjEuMzM0MzkwMzc0LjE3MjM4MDg2MjU%3D%3Aadb%3A2%3App%3A3629563401%3Arqnl%3A1%3Ast%3A1723899165%3At%3AVote%D0%93%D0%94%20%D1%82%D0%B2%D0%BE%D0%B9%20%D1%81%D0%B0%D0%B9%D1%82%20%D0%BE%20%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%BE%D0%B9%20%D1%82%D1%83%D1%81%D0%BE%D0%B2%D0%BA%D0%B5%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B&t=gdpr(14)mc(p-2)clc(5-924-553)rqnt(4)aw(1)rcm(1)cdl(na)eco(21037568)dss(2)fid(320)ti(0)&force-urlencoded=1&site-info=%7B%22__ym%22%3A%7B%22ite%22%3A1%7D%7D")
              .headers(headers_0),
            http("request_2")
              .post("/watch/78422502/1?page-url=https%3A%2F%2Fvotegd.com%2F&charset=utf-8&uah=chu%0A%22Not)A%3BBrand%22%3Bv%3D%2299%22%2C%22Google%20Chrome%22%3Bv%3D%22127%22%2C%22Chromium%22%3Bv%3D%22127%22%0Acha%0Ax86%0Achb%0A64%0Achf%0A127.0.6533.119%0Achl%0A%22Not)A%3BBrand%22%3Bv%3D%2299.0.0.0%22%2C%22Google%20Chrome%22%3Bv%3D%22127.0.6533.119%22%2C%22Chromium%22%3Bv%3D%22127.0.6533.119%22%0Achm%0A%3F0%0Achp%0ALinux%0Achv%0A6.5.0&hittoken=1723899123_58e78d7ca2be2a8694c7f5f17ba5b5dd5e39da98389dbfc435f03b6c3898ab5b&browser-info=pa%3A1%3Aar%3A1%3Avf%3Acstsejpczyib8nf716ce02r1en%3Afu%3A1%3Aen%3Autf-8%3Ala%3Aru-RU%3Av%3A1410%3Acn%3A1%3Adp%3A1%3Als%3A1611288404515%3Ahid%3A283034204%3Az%3A300%3Ai%3A20240817175244%3Aet%3A1723899165%3Ac%3A1%3Arn%3A1065001835%3Arqn%3A51%3Au%3A1723808625578809752%3Aw%3A1905x927%3As%3A1920x1080x24%3Ask%3A1%3Awv%3A2%3Aco%3A0%3Acpf%3A1%3Antf%3A1%3Aeu%3A0%3Ans%3A1723899123048%3Agi%3AR0ExLjEuMzM0MzkwMzc0LjE3MjM4MDg2MjU%3D%3Aadb%3A2%3Arqnl%3A1%3Ast%3A1723899165&t=gdpr(14)mc(p-2)clc(5-924-553)rqnt(5)aw(1)rcm(1)cdl(na)eco(21037568)dss(2)ti(0)&force-urlencoded=1&site-info=%7B%22__ym%22%3A%7B%22fi%22%3A%22a(1)b(PAFAAA%C2%843A)c(YWudgAH%2FOUrcSBPjw2F2eD8Xslr7WdkXhwYmUEzch1s%3D)e(1)%22%2C%22ite%22%3A1%7D%7D")
              .headers(headers_0),
            http("request_3")
              .get(uri1 + "/?callback=jQuery32109497347423600881_1723899123864&cm-zjjikd-zjjikd=Sobaka%40mail.ru&_=1723899123865")
              .headers(headers_3),
            http("request_4")
              .post(uri2 + "?v=2&tid=G-126E14W1P6&gtm=45je48e0v9113022429za200&_p=1723899123220&gcd=13l3l3l3l1&npa=0&dma=0&tag_exp=0&cid=334390374.1723808625&ul=ru-ru&sr=1920x1080&uaa=x86&uab=64&uafvl=Not)A%253BBrand%3B99.0.0.0%7CGoogle%2520Chrome%3B127.0.6533.119%7CChromium%3B127.0.6533.119&uamb=0&uam=&uap=Linux&uapv=6.5.0&uaw=0&are=1&frm=0&pscdl=noapi&_eu=AEE&_s=3&sid=1723899024&sct=5&seg=1&dl=https%3A%2F%2Fvotegd.com%2F&dr=https%3A%2F%2Fvotegd.com%2Fmessage%2F&dt=Vote%D0%93%D0%94%20%D1%82%D0%B2%D0%BE%D0%B9%20%D1%81%D0%B0%D0%B9%D1%82%20%D0%BE%20%D0%BF%D0%BE%D0%BB%D0%B8%D1%82%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%BE%D0%B9%20%D1%82%D1%83%D1%81%D0%BE%D0%B2%D0%BA%D0%B5%20%D0%9C%D0%BE%D1%81%D0%BA%D0%B2%D1%8B&en=form_start&ep.form_id=&ep.form_name=&ep.form_destination=https%3A%2F%2Ftemplatermonster.createsend.com%2Ft%2Fj%2Fs%2Fzjjikd%2F&epn.form_length=2&ep.first_field_id=campaign-email&ep.first_field_name=cm-zjjikd-zjjikd&ep.first_field_type=email&epn.first_field_position=1&_et=23949&tfd=42995")
              .headers(headers_4)
          )
      );

	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
