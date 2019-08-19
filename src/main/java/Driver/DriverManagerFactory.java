package Driver;

public class DriverManagerFactory {

    public static DriverManager getDriver(DriverType type) {
        DriverManager driverManager;

        switch(type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FireFoxManager();
                break;
            default:
                driverManager = null;
        }

        return driverManager;
    }
}
