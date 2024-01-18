package generator;

import java.util.*;

public class generator {

 static String[] FirstName = { "Maxim", "Dorin", "Daniil", "David", "Cristi", "Adrian", "Vlada", "Camelia",
   "Cristina",
   "Marin", "Alexandru", "Bianca", "Nicolae", "Iulia", "Victoria", "David", "Dumitru", "Radu", "Georgeta", "Stas",
   "Artiom", "Robert", "Anastasia" };

 static String[] LastName = { "Andronic", "Bota", "Popa", "Josan", "Lupu", "Roibu", "Carp", "Chilaru", "Costin",
   "Curnic",
   "Erina", "Gheruha", "Grama", "Grigoriev", "Iacovenco", "Ispas", "Istrati", "Palade", "Petcu", "Pinzari",
   "Railean", "Spanu", "Sahov", "Ursu" };

 static String[] Discipline = { "Matematica", "Limba Romana", "Limba Engleza", "Limba Franceza", "Limba Rusa",
   "Informatica",
   "Biologia", "Istoria", "Geografia", "Procesarea Imaginilor" };

 public static void main(String[] args) {
  for (int i = 0; i < 10000000; i++) {
   String firstName = getRandomValue(FirstName);
   String lastName = getRandomValue(LastName);
   String discipline = getRandomValue(Discipline);
   String dateOfBirth = generateRandomDateOfBirth();
   String telNumber = generateRandomPhoneNumber();

   System.out.println("(" + (i + 1) + ", " +
     firstName + ", " +
     lastName + ", " +
     discipline + ", " +
     dateOfBirth + ", " +
     telNumber);
  }
 }

 private static String getRandomValue(String[] array) {
  Random random = new Random();
  int index = random.nextInt(array.length);
  return array[index];
 }

 private static String generateRandomDateOfBirth() {
  Random random = new Random();
  int day = random.nextInt(28) + 1;
  int month = random.nextInt(12) + 1;
  int year = random.nextInt(10) + 2000; // Assuming birth year between 2000 and 2009
  return String.format("%02d-%02d-%04d", day, month, year);
 }

 private static String generateRandomPhoneNumber() {
  int[] ExchangeCode = { 67, 79, 78 };

  Random random = new Random();
  int index = random.nextInt(ExchangeCode.length);
  int areaCode = 373;
  int exchangeCode = ExchangeCode[index];
  int lineNumber = random.nextInt(900000) + 100000;
  return String.format("(%03d) %3d%04d", areaCode, exchangeCode, lineNumber);
 }
}