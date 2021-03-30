package driver;

public class DriverManagerFactory {
    public static DriverManager getDriverManager(DriverType type) {
        DriverManager driverManager;
        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FireFoxManager();
                break;
            // more browsers here

            default:
                driverManager = new IEDriverManager();
                break;
        }
        return driverManager;
    }
}
