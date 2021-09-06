import com.amane.service.ser1;
import com.amane.service.ser1Imp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class serImp {
    @Test
    public void Test(){
        ser1 ser1 = new ser1Imp();
        ser1.dosome();
        System.out.println(2);
    }
    @Test
    public void Test01(){
        String config = "bins.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(config);
        ser1Imp ser1Imp = (ser1Imp) applicationContext.getBean("ser1");
        ser1Imp.dosome();
        System.out.println(applicationContext.getBeanDefinitionCount());
        System.out.println(applicationContext.getBeanDefinitionNames());
    }
}
