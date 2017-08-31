package configurationproperties.ls;

import configurationproperties.ls.demo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTests {

	@Autowired
	private User user;

	@Test
	public void contextLoads() {
		System.out.println(user);
		System.out.println(user.getName());
		//User{name='ls', address='biguiyuan'}
		/**
		 * 读取到了properties中的数据.
		 */
	}

}
