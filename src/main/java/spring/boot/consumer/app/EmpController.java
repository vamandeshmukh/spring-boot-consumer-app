package spring.boot.consumer.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	@Autowired
	EmpService empService;

	@GetMapping("/getEmployee/{eid}")
	private Employee getEmployee(@PathVariable("eid") int eid) {
		return empService.getOneEmployee(eid);
	}

}
