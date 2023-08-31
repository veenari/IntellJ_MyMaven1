package runnerFile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/MtFirstFeatureFile.feature"},
        glue= "stepDefination",
        dryRun = true
)
public class runnerfile {
}
