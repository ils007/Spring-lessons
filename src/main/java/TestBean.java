import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestBean {
    @Autowired
    private MegaBean megaBeaninside;

    public MegaBean getMegaBeaninside() {
        return megaBeaninside;
    }

    public void setMegaBeaninside(MegaBean megaBeaninside) {
        this.megaBeaninside = megaBeaninside;
    }
}
