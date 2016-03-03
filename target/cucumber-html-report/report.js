$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("main/resources/com/panasonic/payment/payment.feature");
formatter.feature({
  "id": "payment-methods-on-panasonic",
  "description": "\r\nIn order to buy product\r\nAs a Guest Customer\r\nI want to use my various credit cards",
  "name": "Payment methods on Panasonic",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "payment-methods-on-panasonic;buying-product-with-credit-card",
  "description": "",
  "name": "Buying product with Credit Card",
  "keyword": "Scenario",
  "line": 7,
  "type": "scenario"
});
formatter.step({
  "name": "I go to \"QA-URL\" on \"Mozilla\"",
  "keyword": "Given ",
  "line": 9
});
formatter.step({
  "name": "I enter in \"HomePage_searchField\" as \"DMC-G7HK\"",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "I click on \"HomePage_searchButton\"",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "\"ProductPage_productID\" displayed on page should be \"DMC-G7HK\"",
  "keyword": "Then ",
  "line": 12
});
formatter.match({
  "arguments": [
    {
      "val": "QA-URL",
      "offset": 9
    },
    {
      "val": "Mozilla",
      "offset": 21
    }
  ],
  "location": "PaymentTest.I_go_to_panasonic(String,String)"
});
formatter.result({
  "duration": 20534423916,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HomePage_searchField",
      "offset": 12
    },
    {
      "val": "DMC-G7HK",
      "offset": 38
    }
  ],
  "location": "PaymentTest.I_enter_in(String,String)"
});
formatter.result({
  "duration": 209506074,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HomePage_searchButton",
      "offset": 12
    }
  ],
  "location": "PaymentTest.I_click_on(String)"
});
formatter.result({
  "duration": 9397723760,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ProductPage_productID",
      "offset": 1
    },
    {
      "val": "DMC-G7HK",
      "offset": 53
    }
  ],
  "location": "PaymentTest.Productid_displayed_on_page_should_be(String,String)"
});
formatter.result({
  "duration": 757431350,
  "status": "passed"
});
});