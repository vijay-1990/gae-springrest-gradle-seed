package ut.com.service.hello;
import com.google.gson.Gson;
import com.service.hello.GreetingController;
import com.service.hello.Greeting;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UtGreetingController{
	private static final Logger logger = LoggerFactory.getLogger(UtGreetingController.class);
	private static GreetingController controller;
	private final Gson gson = new Gson();
	@BeforeClass
	public static void initialiseObjects(){
		logger.info("###Inside UtGreetingController Init###");
	}
	
	@Test
	public void testWithParameter(){
		controller = new GreetingController();
		String result = controller.greeting("Homosapien");
		Greeting object = gson.fromJson(result, Greeting.class);
		Assert.assertEquals(object.getId(),1);
		Assert.assertEquals(object.getContent(),"Hello, Homosapien!");
		controller = null;
	}
	
	@Test
	public void testWitoutParameter(){
		controller = new GreetingController();
		String result = controller.greeting(null);
		Greeting object = gson.fromJson(result, Greeting.class);
		Assert.assertEquals(object.getId(),1);	
		//logger.info(object.getContent());
		Assert.assertEquals(object.getContent(),"Hello, World!");
		controller = null;
	}
	
	@AfterClass
	public static void garbageObjects(){
		logger.info("###Inside UtGreetingController Destroy###");
	}
}
