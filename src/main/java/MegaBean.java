import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MegaBean {
    @Autowired
    private TestBean testBeaninside;

    public TestBean getTestBeaninside() {
        return testBeaninside;
    }

    public void setTestBeaninside(TestBean testBeaninside) {
        this.testBeaninside = testBeaninside;
    }
}
