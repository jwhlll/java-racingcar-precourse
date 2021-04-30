import service.RacingCarService;

public class RacingCarApplication {
    public static void main(String[] args) {
        RacingCarService racingCarService = new RacingCarService();
        racingCarService.start();
    }
}
