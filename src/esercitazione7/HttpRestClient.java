package esercitazione7;
import java.io.IOException;
/*
public class HttpRestClient {

    public final static void main(String[] args) throws Exception{
        CloseableHttpClient httpClient = HttpClients.createDefault();

        try{
            getCustomers(httpClient);
            getCustomerWithID(httpClient, 10);

            String newCustomer = "<CUSTOMER><ID>2341</ID><FIRSTNAME>Prova Todida</FIRSTNAME>" +
                    "<LASTNAME>RetiDiCalcolatori</LASTNAME>" +
                    "<STREET>DIMES,UNICAL</STREET>" +
                    "<CITY>Cosenza</CITY>" +
                    "</CUSTOMER>";

            postCustomer(httpClient, newCustomer);
            deleteCustomerWithID(httpClient, 2341);
        }finally{
            httpClient.close();
        }
    }//main

    private static void getCustomers(CloseableHttpClient httpClient) throws IOException {
        HttpGet httpGet = new HttpGet("http://www.thomas-bayer.com/sqlrest/CUSTOMER/");
        System.out.println("Executing request " + httpGet.getRequestLine());

        CloseableHttpResponse response = httpClient.execute(httpGet);
        StatusLine statusLine = response.getStatusLine();
        String responseBody = EntityUtils.toString(response.getEntity());

        System.out.println("-------------------------------------------");
        System.out.println(statusLine.getProtocolVersion() + " " +
                statusLine.getStatusCode() + " " +
                statusLine.getReasonPhrase());
        System.out.println(responseBody);
    }//getCustomers

    private static void getCustomerWithID(CloseableHttpClient httpClient, long id) throws IOException{
        HttpGet httpGet = new HttpGet("http://www.thomas-bayer.com/sqlrest/CUSTOMER/" + id);
        System.out.println("Executing request " + httpGet.getRequestLine());

        CloseableHttpResponse response = httpClient.execute(httpGet);
        StatusLine statusLine = response.getStatusLine();
        String responseBody = EntityUtils.toString(response.getEntity());

        System.out.println("-------------------------------------------");
        System.out.println(statusLine.getProtocolVersion() + " " +
                statusLine.getStatusCode() + " " +
                statusLine.getReasonPhrase());
        System.out.println(responseBody);
    }//getCustomerWithID

    private static void postCustomer(CloseableHttpClient httpClient, String customerXML) throws IOException{
        HttpPost httpPost = new HttpPost("http://www.thomas-bayer.com/squlrest/CUSTOMER/");
        httpPost.setEntity(new StringEntity(customerXML, "utf-8"));
        System.out.println("Executing request " + httpPost.getRequestLine());

        CloseableHttpResponse response = httpClient.execute(httpPost);
        StatusLine statusLine = response.getStatusLine();
        String responseBody = EntityUtils.toString(response.getEntity());

        System.out.println("-----------------------------------------");
        System.out.println(statusLine.getProtocolVersion() + " " +
                statusLine.getStatusCode() + " " +
                statusLine.getReasonPhrase());
        System.out.println(responseBody);
    }//postCustomer

    private static void deleteCustomerWithID(CloseableHttpClient httpClient, long id) throws IOException{
        HttpDelete httpDelete = new HttpDelete("http://www.thomas-bayer.com/sqlrest/CUSTOMER/" + id);
        System.out.println("Executing request " + httpDelete.getRequestLine());
        CloseableHttpResponse response = httpClient.execute(httpDelete);
        StatusLine statusLine = response.getStatusLine();

        System.out.println("------------------------------------------");
        System.out.println(statusLine);
    }//deleteCustomerWithID

    private static void putCustomer(CloseableHttpClient httpClient, String customerXML) throws IOException{
        HttpPut httpPut = new HttpPut("http://www.thomas-bayer.com/sqlrest/CUSTOMER/");
        httpPut.setEntity(new StringEntity(customerXML, "utf-8"));
        System.out.println("Executing request " + httpPut.getRequestLine());

        CloseableHttpResponse response = httpClient.execute(httpPut);
        StatusLine statusLine = response.getStatusLine();
        String responseBody = EntityUtils.toString(response.getEntity());

        System.out.println("-------------------------------------------");
        System.out.println(statusLine);
        System.out.println(responseBody);
    }//putCustomer

}//HttpRestClient
*/
