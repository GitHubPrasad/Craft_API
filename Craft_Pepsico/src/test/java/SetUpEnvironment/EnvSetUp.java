package SetUpEnvironment;

public class EnvSetUp
{
    public Properties property = Settings.getInstance();

    public EnvSetUp()
    {
        if(System.getProerty("env").equalsIgnoreCase("qa"))
        {
            property.setProperty("GetProductsUrl","https://api-na.qa.mypepsico.com/it/och/b2bproductsvc/V1/api/products");
        }
        else if (System.getProperty("env").equalsIgnoreCase("dev"))
        {
            property.setProperty("GetProductsUrl","https://api-na.dev.mypepsico.com/it/och/b2bproductsvc/V1/api/products");
        }

        System.out.println(property.getProperty("GetProductsUrl"));
    }
}
