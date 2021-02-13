import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (!command.equals("exit")){
            command = scanner.next();
            if (command.equals("push")) {
                command = scanner.nextLine();
                int n = Integer.parseInt(command);
                push(n, list);
            }
            if (command.equals("pop")){
                pop(list);
            }
            if (command.equals("back")){
                back(list);
            }
            if (command.equals("size")){
                size(list);
            }
            if (command.equals("clear")){
                clear(list);
            }
            if (command.equals("exit")){
                System.out.print(" bye");
            }
        }
    }

    public static void push(int n, ArrayList<Integer> list){
        list.add(n);
        System.out.print(" ok");
    }

    public static void pop(ArrayList<Integer> list){
        int n = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        System.out.print(" " + n);
    }

    public static void back(ArrayList<Integer> list){
        if (!list.equals(null)){
            int n = list.get(list.size());
            System.out.print(" " + n);
        }
    }

    public static void size(ArrayList<Integer> list){
        System.out.print(" "+list.size());
    }

    public static void clear(ArrayList<Integer> list){
        list = null;
    }

}