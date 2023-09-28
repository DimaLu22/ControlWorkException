package HW3;

public class Excepts {

    static class DataException extends Exception{
        public DataException() {
        }
        public void dataException(String i) {
            System.out.println("Exception: DataNotCorrectFormat");
            System.out.printf("It`s not correct format: %s", i);
            System.out.println();
        }
    }

    static class DateException extends Exception {
        public DateException() {
        }
        public void dataException(String i) {
            System.out.println("Exception: DateNotCorrectFormat");
            System.out.printf("It`s not correct date format: %s", i);
            System.out.println();
        }
    }

    static class SexException extends Exception {
        public SexException() {
        }

        public void sexException(String i) {
            System.out.println("Exception: SexNotCorrectData");
            System.out.printf("It`s not correct data: %s", i);
            System.out.println();
        }
    }
}
