package runnerFile;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
       // features = {"src/test/resources/features/MtFirstFeatureFile.feature"},
        //features ={"C:/Users/itvd2/IdeaProjects/IntellJ_MyMaven1/src/test/java/features/MtFirstFeatureFile.feature"},
        features ={"src/test/java/features/MtFirstFeatureFile.feature"},
        glue= "stepDefination",
        dryRun = true
)
public class runnerfileTest {
}
