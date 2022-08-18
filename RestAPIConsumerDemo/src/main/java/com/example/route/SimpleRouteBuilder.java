package com.example.route;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class SimpleRouteBuilder extends RouteBuilder {
	
	
	@Override
	public void configure() throws Exception {
		
		System.out.println("Simple RouteBuilder class");
		
		from("timer://test-api-rest?period=1000")
		.log("Rest API calling")
		.setHeader(Exchange.HTTP_METHOD, simple("GET"))
		.to("http://localhost:9090/employee?id=1")
		.process(new Processor() {
			
			@Override
			public void process(Exchange exchange) throws Exception {
				
				String output =  exchange.getIn().getBody(String.class);
				System.out.println("Output ="+ output);
				
				
			}
		});
		
	
	}

}
