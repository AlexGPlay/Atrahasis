package atrahasis.testClasses;

import org.blynder.core.annotations.Controller;
import org.blynder.core.annotations.Path;
import org.blynder.core.network.Response;

@Controller
public class ControllerTestFxml {

	@Path("/test")
	public Response testPath1() {
		return new Response().response("test.fxml");
	}
	
}
