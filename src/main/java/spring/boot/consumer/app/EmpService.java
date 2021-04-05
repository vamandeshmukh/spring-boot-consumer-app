package spring.boot.consumer.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

	private static final Logger log = LoggerFactory.getLogger(EmpService.class);
	private static final RestTemplateBuilder rtb = new RestTemplateBuilder();
	private static final RestTemplate restTemplate = rtb.build();
	private static final String uri = "http://localhost:8090/employee/";

	public Employee getOneEmployee(int eid) {
		Employee emp = restTemplate.getForObject(uri + "getEmployee/" + eid, Employee.class);
		log.info(emp.toString());
		return emp;
	}

}