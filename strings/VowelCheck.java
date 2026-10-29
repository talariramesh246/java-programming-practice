// Vowel check in the given string 
class VowelCheck{
    public static void main(String[]args)
    {
        String name = "Ramesh";
        boolean check=name.toLowerCase().matches(".*[aeiou].*");
        System.out.println(check);
    }
}
