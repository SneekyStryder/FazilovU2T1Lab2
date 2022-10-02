public class ChatBotRunner {
    public static void main(String[] args)
    {
        ChatBot stryder = new ChatBot("Stryder", 17);

        double meters = stryder.convertFeetToMeters(50);
        int sum = stryder.addNumbers(2, 23, 32);
        String goodbye = stryder.goodbye();

        stryder.greeting("Imran");
        stryder.weather();
        stryder.favoriteNumber(21);
        System.out.println("50 feet converted to meters is " + meters);
        System.out.println("2 + 23 + 32 is equal to " + sum);
        System.out.println(goodbye);
        stryder.tellJoke();
        System.out.println("Your age is " + stryder.userAge(2006));
    }
}
