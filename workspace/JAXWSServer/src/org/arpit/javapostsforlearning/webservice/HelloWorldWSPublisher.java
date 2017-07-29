package org.arpit.javapostsforlearning.webservice;
import javax.xml.ws.Endpoint;
 
public class HelloWorldWSPublisher {
 public static void main(String[] args) {
  Endpoint.publish("http://localhost:4262/WS/HelloWorld",new HelloWorldImpl());
 }
}