
public class Main2 {
    public static void main(String[] args) {
        PhoneDirectory pd = new PhoneDirectory();

        pd.add("Иванов", "123-456");
        pd.add("Петров", "789-012");
        pd.add("Иванов", "345-678");
        pd.add("Сидоров", "901-234");

        System.out.println("Иванов: " + pd.get("Иванов"));
        System.out.println("Петров: " + pd.get("Петров"));
        System.out.println("Смирнов: " + pd.get("Смирнов"));
    }
}