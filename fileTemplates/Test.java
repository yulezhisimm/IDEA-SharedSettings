#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
import org.junit.Test;
#parse("File Header.java")
public class ${NAME}Test {
    @Test
    public void test() {
        ${NAME} ${object} = new ${NAME}();
        
    }
}

