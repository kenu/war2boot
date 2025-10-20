package egovframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({
    "classpath:egovframework/spring/com/context-aspect.xml",
    "classpath:egovframework/spring/com/context-common.xml",
    "classpath:egovframework/spring/com/context-crypto.xml",
    "classpath:egovframework/spring/com/context-datasource.xml",
    "classpath:egovframework/spring/com/context-egovuserdetailshelper.xml",
    "classpath:egovframework/spring/com/context-idgen.xml",
    "classpath:egovframework/spring/com/context-mapper.xml",
    "classpath:egovframework/spring/com/context-properties.xml",
    "classpath:egovframework/spring/com/context-transaction.xml",
    "classpath:egovframework/spring/com/context-validator.xml",
    "classpath:egovframework/spring/com/context-whitelist.xml",
    "classpath:egovframework/spring/com/egov-com-servlet.xml"
})
public class War2bootApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(War2bootApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(War2bootApplication.class);
    }
}
