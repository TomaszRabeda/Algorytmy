package Zajecia0302.MyList;

public class MyListDemo {
    public static void main(String[] args) {
        MyList lista = new MyList();
        lista.addAtBeginning(9);
        lista.addAtBeginning(8);
        lista.addAtBeginning(7);
        lista.addAtBeginning(6);
        lista.addAtBeginning(5);
        System.out.println();
        lista.addAtEnd(110);
        lista.addAtEnd(109);
        lista.addAtEnd(108);
        lista.addAtEnd(107);
        lista.addAtEnd(106);

        try {
            lista.addEllementAfterElement(1000, 106);
            lista.addEllementAfterElement(1100, 5);
        }
        catch (Exception e){
            e.getMessage();
        }
        lista.printAll();
        System.out.println("----------------");

        try {
            lista.deleteElement(1100);
            lista.deleteElement(1000);
            lista.deleteElement(5);
        }
        catch (Exception e){
            e.getMessage();
        }
        lista.printAll();
    }
}
