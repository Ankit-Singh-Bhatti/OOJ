class strconstructor{
    public static void main(String[] args) {
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str1 = new String(charArray);
        String str2 = new String(charArray, 2, 3); // Starts from index 2, with a length of 3
        System.out.println("String created using char array: " + str1);
        System.out.println("Substring created using char array: " + str2);

    }
}
