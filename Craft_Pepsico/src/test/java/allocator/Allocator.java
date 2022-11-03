package allocator;

import com.sun.scenario.Settings;

import java.util.Properties;

public class Allocator
{
    /*
        Class to manage batch execution of test scripts within the framework
     */
    private FrameworkParameters frameworkParameters = FrameworkParameters.getInstance();
    private Properties properties;
    private Properties mobileproperties;
    private ResultSummaryManager resultSummaryManager = ResultSummaryManager.getInstance();

    private static ExtentHtmlReporter htmlReporter;
    private static ExtentReports extentReport;
    private static ExtentTest extentTest;
    private static KlovReporter klovReporter = new KlovReporter;

    /*
        The entry point of test batch execution <br>
        Exists with a value of 0 if the test passes and 1 if the test fails
        @param args
        command line arguments to the Allocator (Not Applicable)
     */
    public static void main(String[] args)
    {
        Allocator allocator = new Allocator();
        allocator.driveBatchExecution();
    }

    private void driveBatchExecution()
    {
        resultSummaryManager.setRelativePath();
        properties = Settings.getInstance();
        System.out.println("properties::"+properties);
        mobileproperties = Settings.getMobilePropertiesInstance();
        String runConfiguration;

    }









}
