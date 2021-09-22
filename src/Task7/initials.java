package Task7;

public class initials {

    public static void main(String[] args) {
        System.out.println(toInitials("Liam Mia Black"));
    }

    public static String toInitials (String name) {

        if (name == null || name.length() == 0) {
            return null;
        }

        String[] words = name.split("\\s+");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            char initial = words[i].charAt(0);
            result += initial + "." + " ";
        }
        return result.toUpperCase().trim();
    }
}
