import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Iterator;

// Lab 2 - Lists, Stacks, and Queues
// Your Name: 
// Notes: Follow the steps in the comments and use examples from the book to complete the lab.

class Main {
    public static void main(String[] args) {
        Lab2 lab = new Lab2();
        // Uncomment each method call as you work on it.
        lab.linkedList();
        lab.queue();
        lab.stack();
    }
}

class Lab2 {
    public void linkedList() {
        // Step 1: Create a LinkedList of programming languages
        LinkedList<String> progLanguages = new LinkedList<>();

        // Step 2: Add a few popular programming languages
        progLanguages.add("Java");
        progLanguages.add("Python");
        progLanguages.add("JavaScript");
        progLanguages.add("C++");

        // Step 3: Remove C++ (Sorry, C++ fans!)
        progLanguages.remove("C++");

        // Step 4: Add HTML at index 2
        progLanguages.add(2, "HTML");

        // Step 5: Use an iterator to print each language
        System.out.println("Programming Languages List:");
        Iterator<String> iterator = progLanguages.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(); // Just to keep output clean
    }

    public void queue() {
        // Step 6: Create a queue to store first names
        Queue<String> q = new LinkedList<>();

        // Step 7: Add some names to the queue
        q.add("Alice");
        q.add("Bob");
        q.add("Charlie");
        q.add("David");
        q.add("Emma");

        // Step 8: Print the queue
        System.out.println("Elements of queue: " + q);

        // Step 9: Remove the first person in the queue
        String removedElement = q.poll();
        System.out.println("Removed element: " + removedElement);

        // Step 10: Peek at the new head of the queue
        System.out.println("Head of queue: " + q.peek());

        // Step 11: Print all remaining elements in the queue
        System.out.println("Remaining elements in queue:");
        for (String element : q) {
            System.out.println(element);
        }
        System.out.println(); // Keep things tidy
    }

    public void stack() {
        // Step 12: Create a stack to hold book titles
        Stack<String> bookStack = new Stack<>();

        // Step 13: Push some well-known programming books onto the stack
        bookStack.push("Clean Code");
        bookStack.push("Design Patterns");
        bookStack.push("Pragmatic Programmer");

        // Step 14: Pop the top book and display it
        System.out.println("Popped book: " + bookStack.pop());

        // Step 15: Peek at the current top book
        System.out.println("Top book: " + bookStack.peek());

        // Step 16: Push another book onto the stack
        bookStack.push("Web DB Technologies");

        // Step 17: Peek again to confirm the new top book
        System.out.println("Top book after push: " + bookStack.peek());

        // Step 18: Search for "Design Patterns" in the stack
        int position = bookStack.search("Design Patterns");
        if (position != -1) {
            System.out.println("\"Design Patterns\" found at position: " + position);
        } else {
            System.out.println("\"Design Patterns\" is not in the stack.");
        }

        // Step 19: Check if the stack is empty
        System.out.println("Is the stack empty? " + bookStack.empty());

        // Step 20: Print all books currently in the stack
        System.out.println("Books currently in the stack:");
        for (String book : bookStack) {
            System.out.println(book);
        }
        System.out.println(); // Keep formatting nice
    }
}