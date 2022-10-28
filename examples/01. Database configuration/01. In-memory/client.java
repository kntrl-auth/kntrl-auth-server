import app.kntrl.client.Kntrl;
import app.kntrl.client.generated.model.HealthRes;

class Example0101 {
    public static void main(String[] args) {
        HealthRes serverHealth = new Kntrl().serverHealth(null);
        System.out.println("User database health: " + serverHealth.getDb().getUser().getStatus().name());
        System.out.println("Session database health: " + serverHealth.getDb().getSession().getStatus().name());
        System.out.println("Rate-limiter database health: " + serverHealth.getDb().getRateLimiter().getStatus().name());
    }
}
