import java.util.*;

// Hope Foreman
// Due: 1 Nov 2020

public class Main {
    public static void main(String[] args) {
// Declare an ArrayList of Strings. Add eight names to the collection.
        List<String> names = new ArrayList<String>();
        String[] convertToArray = new String[names.size()];
        names.add("Noah");
        names.add("Merlin");
        names.add("Hope");
        names.add("Zoey");
        names.add("Todd");
        names.add("Jessica");
        names.add("Kat");
        names.add("Tess");
// Output the Strings onto the console using the enhanced for loop.
        for (String name : names) {
            System.out.println(name);

        }
// Sort the ArrayList using the method Collections.sort, output the sorted List
        Collections.sort(names);
        System.out.println("\nSorted: \n");

        for (String name : names) {
            System.out.println(name);
        }
// Shuffle the list, and output the shuffled list.
        Collections.shuffle(names);
        System.out.println("\nShuffled: \n");

        for (String name : names) {
            System.out.println(name);
        }
// Search for a name in the list that exists; output the location where it was found.
// Search for a name that is not in the list. What location is reported?
        System.out.print("\nType in a name that's in the list: \n");
        Scanner scanner = new Scanner(System.in);
        String checkName = scanner.nextLine();

        if (names.contains(checkName)) {
            System.out.println("The index in the list of " + checkName + " is: " + names.indexOf(checkName));
             System.out.println("");
        } else {
            System.out.print("Not in the list. ");
            return;
        }

// Convert the list to an array using toArray. Output the elements of the array.
        System.out.println("The list converted to an array: ");
        convertToArray = names.toArray(convertToArray);
        System.out.println(Arrays.toString(convertToArray) + "\n");

        System.out.println("The list converted to an array back into a list: ");
        List backInList = Arrays.asList(convertToArray);
        List people = backInList;
        for(int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }
}
