class Spec {
    public static void main(String[] args) {
        String statement = "Manojsai @gmail.com#@new"; 
        int specialCharCount = 0;

        for (int i = 0; i < statement.length(); i++) {
            char ch = statement.charAt(i);

            if (!(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9')) {
                specialCharCount++;
            }
        }

              System.out.println("Number of special Characters: " + specialCharCount);
    }
}