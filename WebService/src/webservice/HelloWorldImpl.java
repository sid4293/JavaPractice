package webservice;

import javax.jws.WebService;  
//Service Implementation  
@WebService(endpointInterface = "webservice.HelloWorld")  
public class HelloWorldImpl implements HelloWorld{  
  @Override  
  public String getHelloWorldAsString(String name) {  
      return "Hi " + name;  
  }  
}