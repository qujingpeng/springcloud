/**
 * Project Name:eureka-consumer
 * File Name:EurekaConsumerApplication.java
 * Package Name:com.springcloud.consumer
 * Date:2017年7月26日下午10:20:32
 * author 屈志刚  email:598700560
 *
*/

package com.springcloud.consumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName:EurekaConsumerApplication <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月26日 下午10:20:32 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaConsumerApplication {
	
	@Bean
	public RestTemplate initIestTemplate(){
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		
		new SpringApplicationBuilder(EurekaConsumerApplication.class).web(true).run(args);
	}

}

