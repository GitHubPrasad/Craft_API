package BusinessComponents;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverablekeyException;
import java.security.cert.CertificateException;
import java.util.Arraylist;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import com.cognizant.craft.Driverscript;
import com.cognizant.craft.ReusableLibrary;
import com.cognizant.craft.ScriptHelper;
import com.cognizant.framework.Settings;
import com.cognizant.framework.Status;
import com.couchbase.client.core.deps.com.fasterxml.jackson.databind.DeserializationFeature;
import com.couchbase.client.core.deps.com.fasterxml.jackson.databind.0bjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import POJOClasses.OrderStore;
import providerTestData.TestDataMap;

//Class for storing general purpose business components

public class PO1APIAutomation extends ReusableLibrary
{
    //Constructor to initialize the component library
    //@param scriptHelper
    //The {@Link ScriptHelper} object passed from the {@Link DriverScript}
}

public PO1APIAutomation(ScriptHelper scriptHelper)
{
    super(scriptHelper);
}

    CouchbaseConnection cb = new CouchbaseConnection(scriptHelper);
    // Couchbaseconnection cb = new Couchbaseconnection (scriptHelper);
    public Properties property = Settings.getInstance();
    public static Map<string, String> po1OrderMAP = TestDataMap.p010rderMap();
    public static String sourceOrderId;
    
    String orderIntakeUrl = property.getProperty(System.getProperty("env").toUpperCase() + "." + "OrderIntake");
    String getorderstore = property.getProperty (System.getProperty("env").toUppercase() + "." + "GetOrderstore");
                    

    public String generateAccessToken_P01() throws keyManagementException, NoSuchAlgorithmException,
        UnrecoverablekeyException, KeystoreException, CertificateException, I0Exception, InterruptedException
    {
        String TokenURL = property.getProperty("TokenUrl");
        String ClientId = property.getProperty("P01_ClientId");
        String Clientsecret = property.getProperty("P01_ClientSecret");
        String GrantType = property.getProperty("GrantType");
        String Scope = property.getProperty("P01_Scope");

        Response response = RestAssured
                .gíven()
                .relaxedHTTPSValidation()
                .formParam("client_id", ClientId)
                .formParam("client_secret", ClientSecret)
                .formParam("grant_type", GrantType)
                .formParam("scope", Scope)
                post(TokenURL);
        System.out.println(response.jsonpath().prettify());
        String Accesstoken -response.jsonPath().get("access_token");
        report.updateTestLog("Access token Should be generated", "Access token is generated successfully", Status.PASS);
        return Accesstoken;
    }


/*** OrderpostandResponse Validation *****/
 public void orderIntakePostRequest_P01() throws keyManagementException, NoSuchAlgorithmException
 UnrecoverablekeyException, KeyStoreException, CertificateException, I0Exception, InterruptedException
 {
     System.out.println("*****************");
     String accesstoken = generateAccessToken_P01();
     System.out.println("*********");
     String body = dataTable.getData("General_Data", "Body");
     sourceOrderId = po10rderMAP.get (dataTable.getData("General_Data", "SourceOrderId"));
     String sourceSystemId = dataTable.getData("General_Data", "SourceSystemId");
     String status_code = dataTable.getData("General_Data", "Status_code");
     String responseStatuscode = dataTable.getData("General_Data", "Response_StatusCode");
     String newBody = body.replace ("265138580", sourceOrderId).replace ("625", sourcesystemId);
     System.out.println(newBody);
     report.updateTestLog("Microservices Endpoint Url", ""+ orderIntakeUrl + "", Status.DONE);
     report.updateTestLog("SourceOrderId in Request", "" + sourceOrderId + "", Status.DONE);
     report.updateTestLog("SourceSystemId in Request", "" + sourceSystemId + "", Status.DONE);
 report.updateTestLog("Request Posted in RestAssured", "Request Posted Successfully", Status.PASS);
 Response response = RestAssured.gíven().relaxedHTTPSValidation().when().contentType ("application/json")
 accept ("application/json").auth().oauth2 (accesstoken).body (newBody).post (orderIntakeUrl);
 System.out.println("Response body: " + response.body().asString());
 report.updateTestLog ("Response received", "Response received Successfully:" + response.body().asString()
 Status.PASS);
 report.updatetestLog("Json Response Validation", "***** Response Validation starts*****", Status.DONE);
 int Statuscode = response.statusCode ();
 System.out.println("Statuscode:" + Statuscode);
 if (Statuscode = Integer.parseInt(status_code)) f
 report.updateTestLog(" Status code ", "StatusCode:" + Statuscode + "", Status.PASS);
 Helse
 report.updateTestLog("Status code ", "StatusCode:" + Statuscode + "", Status.FAIL);
 Long time = response.getTimeIn(TimeUnit.MILLISECONDS);
 report.updateTestLog ("Response Time :", "" + time + "ms", Status.DONE);
 System.out.println("time > " + time);
 String responseSourceId = response.jsonPath ().get ("orders [0].sourceOrderId");
 System.out.println("responseSourceId:" + responseSourceId);
 String responseStatusCode = response.jsonPath().get("orders[0].statuscode");

 System.out.println("responseStatusCode:" + responseStatusCode);
 if (responseSourceId.equals ( sourceOrderId))
 report.updateTestLog("SourceOrderId validation", "SourceOrderId:" + responseSourceId
 if (responseStatusCode.equals (responsestatuscode) )
 report.updateTestLog(" Response Code Received:" + responseStatusCode +
 "Response code validation passed", Status.PASS);
 Status.PASS);
 Jelse
 report.updateTestLog(" Response Code Received
 responseStatusCode
 X
 Status.FAIL);
 1 else f
 report.updateTestLog("SourceOrderId validation"
 "Expected result:" + sourceOrderId +
 Actual result :
 responseSourceId
 Status.FAIL);
 }


 public void validateUsingGETOrderstore_P010rders (String getorderId)
 throws KeyManagementException, UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException,
 CertificateException, I0Exception, InterruptedException t
 String GetorderstoreUpdatedUrl = getOrderStore.concat (getorderId);
 String Status_code = "200";
 String orderstatusCode = dataTable.getData("General_Data", "0rderStatus");
 String orderSubStatus = dataTable.getData("General_Data", "OrderSubStatus");
 String orderProcessingstatus = dataTable.getData("General_Data", "OrderProcessingstatus");
 String orderProcessingstatusReason = dataTable.getData("General_Data", "OrderProcessingstatusReason");

 System.out.println("*****************");
 report.updatetestLog("*********Order Store GET Request**********", "****kk********************", Status.DONE);
 String Accesstoken = generateAccessToken_P01();
 System.out.println("*****************");
 report.updateTestLog("GET Order Store Endpoint Url :", "" + GetOrderstoreUpdatedUrl + "", Status.DONE);
 report.updatetestLog("GET Order Store sent using RestAssured", "GET Request sent Successfully", Status.PASS);
 Response response = RestAssured.given().relaxedHTTPSValidation().when().auth().oauth2 (Accesstoken)
 get (GetorderStoreUpdatedUrL);
 System.out.println("Response body: " + response.body().asString());
 ObjectMapper objectMapper = new ObjectMapper();
 objectMapper.configure (DeserializationFeature.FAIL_ON_ UNKNOWN_ PROPERTIES, false);
 OrderStore orderStore[] = objectMapper.readValue (response.body ().asString(), Orderstore[].class);
 report.updateTestLog("Response received"
 "GET Order Store response received Successfully: " + response.body().prettyPrint().tostring()
 Status.PASS);
 report.updateTestLog("Json Response Validation", "*****0rder Store Response Validation starts*****
 Status.DONE);
 int Statuscode = response.statusCode ();
 System.out.println("Statuscode: " + Statuscode);
 if (Statuscode = Integer.parseInt(status_code)) 1
 report.updateTestLog(" Status code ", "StatusCode: " + Statuscode + "", Status.PASS);
 ) else f
 report.updateTestlog("Status code ", "StatusCode:" + Statuscode + "", Status.FAIL);

 try f
 if (orderStatusCode.equalsIgnoreCase ("SPLIT"))[
 for (OrderStore orderStoreitr : orderstore) [
 if(orderStoreitr getStatusCode ().equalsIgnoreCase("SPLIT"))
 if (! (orderStoreitr.getUpdatedDateTime ().equals (null)))
 report.updateTestLog("Order updatedDateTime
 orderStoreitr.getUpdatedDateTime O
 Actual Updated Time
 :
 getupdatedDateTime()
 I
 +
 D PO1APIAutomation.java X D Addresses.java
 D Items.java
 D ExtendeditemAttribute..
 D DiscountDetails.java
 D TestDataM
 Status.PASS);
 ]else (
 report.updateTestLog("Order updatedDateTime
 Actual Updated Time : " + orderStoreitr.
 Status.FAIL);
 if (orderStoreitr.getStatusCode ().equals IgnoreCase (orderStatusCode)) (
 report.updateTestLog("Validation OrderStatusCode :
 + orderstatusCode,
 Expected OrderStatusCode
 Actual OrderStatusCode : " + orderStoreitr.getstatusCode() + ""
 Status.PASS);
 else
 report.updateTestLog("Validation OrderStatusCode
 Expected OrderStatusCode: " + orderStatusCode
 ordenStoreitr getstatusCode() +
 Actual OrderstatusCode
 +
 Status.FAIL);

 if (orderStoreitr.getOrderProcessingStatus().equalsIgnoreCase (orderProcessingstatus))
 report.updateTestLog("Validation OrderProcessingstatus
 Expected Processingstatus : " + orderProcessingStatus,
 orderStoreitr getOrderProcessingstatus()
 Actual Processingstatus
 +
 else f
 report.updateTestLog("Validation OrderProcessingStatus
 Expected Processingstatus : " + orderProcessingStatus,
 orderStoreitr getOrderProcessingstatus() +
 Actual ProcessingStatus
 Status.PASS);
 Status.FAIL);
 if (orderStoreitr.getOrderProcessingStatusReason ().equalsIgnoreCase (orderProcessingStatusReason))
 report.updateTestLog( "Validation OrderProcessingstatusReason
 "Expected OrderProcessingStatusReason : " + orderProcessingstatusReason,
 "Actual OrderProcessingStatusReason : " + orderStoreitr.getOrderProcessingstatusReason(),
 Status.PASS);
 J else f
 report.updateTestLog("Validation OrderProcessingStatusReason
 "Expected OrderProcessingstatusReason : " + orderProcessingstatusReason,
 "Actual OrderProcessingstatusReason : " + orderStoreitr.getOrderProcessingstatusReason()
 Status.FAIL);

 (orderStoreitr.getorderSubstatus().equalsIgnoreCase (orderSubStatus)) /
 report.updateTestLog("Validation OrderSubstatus : ", "Expected OrderSubStatus : " + orderSubStatus
 "Actual OrderSubStatus : " + orderStoreitr.getOrderSubStatus(), Status.PASS);
 else
 report.updateTestLog("Validation OrdersubStatus : ", "Expected OrderSubstatus : " + ordersubStatus
 +
 "Actual Ordersubstatus : " + orderstoreitr.getorderSubstatus(), Status.FAIL);
 validateChildorder_Split(orderstoreitr.getchildorders());
 else 1
 continue;
 H
 else 1
 for (OrderStore orderStoreitr : orderStore) [
 if (! (orderStoreitr.getUpdatedDateTime ().equals (null)))
 report.updateTestLog("Order updatedDateTime
 Actual Updated Time : " + orderStoreitr.getUpdatedDateTime()
 Status.PASS);
 Helse t
 report.updateTestLog( "Order updatedDateTime:
 Actual Updated Time : " + orderstoreitr.getUpdatedDateTime() +""
 Status.FAIL);

 (orderStoreitr.getStatusCode ().equalsIgnoreCase (orderStatusCode)) f
 report.updateTestlog("Validation OrderstatusCode
 Expected OrderstatusCode : " + orderstatusCode
 orderStoreitr getStatusCode O
 Actual OrderStatusCode
 +
 Status.PASS);
 else
 report.updateTestLog( "Validation OrderstatusCode:
 Expected OrderStatusCode : " + orderStatusCode
 Actual OrderStatusCode : " + orderStoreitr.getStatusCode() + ""
 Status.FAIL);
 h
 if (orderStoreitr.getOrderProcessingStatus ().equalsIgnoreCase (orderProcessingstatus))
 report.updateTestLog("Validation OrderProcessingstatus : "
 Expected Processingstatus : " + orderProcessingstatus
 Actual Processingstatus : " + orderStoreitr.getOrderProcessingstatus() + ""
 Status.PASS);
 else 1
 report.updateTestLog ( "Validation OrderProcessingstatus
 Expected Processingstatus : " + orderProcessingstatus,
 Actual Processingstatus
 orderStoreitr.getOrderProcessingStatus()
 +
 T
 Status.FAIL);
 if (orderStoreitr.getOrderProcessingstatusReason ().equalsIgnoreCase (orderProcessingStatusReason) ) (
 report.updatetestLog( "Validation OrderProcessingstatusReason
 "Expected OrderProcessingstatusReason : " + orderProcessingstatusReason,
 "Actual OrderProcessingstatusReason : " + orderStoreitr.getOrderProcessingstatusReason ()
 Status.PASS);

 else
 report.updateTestLog("Validation OrderProcessingstatusReason
 "Expected OrderProcessingstatusReason : " + orderProcessingstatusReason,
 "Actual OrderProcessingstatusReason : " + orderStoreitr.getOrderProcessingstatusReason(),
 Status.FAIL);
 orderSubstatus,
 +
 1Services_APl
 D PO1APIAutomation.java X D Addresses.java
 D Items.java
 D ExtendedltemAttribute...
 D DiscountDetails.java
 D TestDataMap.ja
 if (orderStoreitr.getOrderSubStatus().equalsIgnoreCase (orderSubStatus))
 report.updateTestLog("Validation OrderSubstatus : ", "Expected OrderSubStatus
 "Actual OrderSubStatus : " + orderStoreitr.getorderSubStatus(), Status.PASS);
 else
 + orderSubStatus,
 "Expected OrderSubStatus
 report.updateTestlog("VaLidation OrderSubStatus
 "Actual OrderSubStatus : " + orderStoreitr.getOrderSubStatus(), Status.FAIL);
 +
 catch (Exception e) (
 report.updateTestLog ( "MicroServices validation failed (exception)"
 Status.DONE);
 rvices
 "Exception occurred
 8 ANHO 4
 C
 "+e.toString()
 finally {
 report.updateTestLog("MicroServices validation", "*****MicroServices validation completed successfully*****", Status.DONE);
 }




