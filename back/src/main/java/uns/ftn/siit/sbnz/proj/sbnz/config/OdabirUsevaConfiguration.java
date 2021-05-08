package uns.ftn.siit.sbnz.proj.sbnz.config;


import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("uns.ftn.siit.sbnz.proj.sbnz.service")
public class OdabirUsevaConfiguration {
    private static final String drlFile = "odabir-useva.drl";

    @Bean
    public KieContainer kieContainer() {
        KieServices kieServices = KieServices.Factory.get();

//        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
//        kieFileSystem.write(ResourceFactory.newClassPathResource(drlFile));
//        KieBuilder kieBuilder = kieServices.newKieBuilder(kieFileSystem);
//        kieBuilder.buildAll();
//        KieModule kieModule = kieBuilder.getKieModule();

//        return kieServices.newKieContainer(kieModule.getReleaseId());
        return kieServices.getKieClasspathContainer();
    }

}
