package Zajecia0302.MyList;

public class MyList {
    private int couter = 0;
    private Element head;
    private Element tail;

    public int getCouter() {
        return couter;
    }

    public Element getHead() {
        return head;
    }

    public Element getTail() {
        return tail;
    }

    public Element findForward(int value) {

        Element currentElement = head;
        boolean found = false;
        if (currentElement.getData() == value)
            return currentElement;

        while (currentElement.getNext() != null) {
            currentElement = currentElement.getNext();
            if (currentElement.getData() == value)
                return currentElement;
        }
        return null;
    }

    public Element findBackwards(int value) {
        Element currentElement = tail;
        if (currentElement.getData() == value)
            return currentElement;

        while (currentElement.getPrev() != null) {
            currentElement = currentElement.getPrev();
            if (currentElement.getData() == value)
                return currentElement;
        }
        return null;
    }

    private void setFirstElement(Element newElement) {
        head = newElement;
        tail = newElement;
        newElement.setNext(null);
        newElement.setPrev(null);
        couter++;
    }
    // lista kroków **

    public void addAtBeginning(int value) {
        Element newElement = new Element();
        newElement.setData(value);

        if (couter > 0) {
            newElement.setNext(head);
            newElement.setPrev(null);
            head = newElement;
            Element nextOfNewElement = newElement.getNext();
            nextOfNewElement.setPrev(newElement);
            couter++;
        } else {
            setFirstElement(newElement);
        }
    }

    public void addAtEnd(int value) {
        Element newElement = new Element();
        newElement.setData(value);

        if (couter > 0) {
            newElement.setNext(null);
            newElement.setPrev(tail);
            tail = newElement;
            Element prevOfNewElement = newElement.getPrev();
            prevOfNewElement.setNext(newElement);
            couter++;

        } else {
            setFirstElement(newElement);
        }
    }
    //dodaj element za elementem

    public void addEllementAfterElement(int newvalue, int valueInsertAfter)
            throws Exception {
        Element elementAfter = findForward(valueInsertAfter);

        if (elementAfter == null) {
            throw new Exception("Nie ma wartości");
        }
        if (elementAfter == tail) {
            addAtEnd(newvalue);
        } else {
            Element newElement = new Element();
            newElement.setData(newvalue);
            newElement.setNext(elementAfter.getNext());
            newElement.setPrev(elementAfter);

            elementAfter.setNext(newElement);
            Element oldAfterElement = newElement.getNext();
            oldAfterElement.setPrev(newElement);
            couter++;
            // równoważne newElement.getnext().setPrev(newElement);
        }
    }

    public void addEllementBeforeElement(int newvalue, int valueInsertAfter)
            throws Exception {
        Element elementBefore = findForward(valueInsertAfter);

        if (elementBefore == null) {
            throw new Exception("Nie ma wartości");
        }
        if (elementBefore == head) {
            addAtEnd(newvalue);
        }
        else {

            Element newElement = new Element();
            newElement.setData(newvalue);
            newElement.setNext(elementBefore);
            newElement.setPrev(elementBefore.getPrev());

            elementBefore.setPrev(newElement);
            Element oldBeforeElement = newElement.getPrev();
            oldBeforeElement.setNext(newElement);
            couter++;
            // równoważne newElement.get.Prev().set.Next(newElement);
        }
    }
    public void deleteElement (int  value) throws Exception {
        Element elementToDelete = findForward(value);

        if (elementToDelete==null){
            throw new Exception("Nie ma takiego elementu");


        }
        if (elementToDelete!= head && elementToDelete != tail){
            Element elementBeforeElementoDelete = elementToDelete.getPrev();
            elementBeforeElementoDelete.setNext(elementToDelete.getNext());

            Element elementAfterElementToDeletem=elementToDelete.getNext();
            elementAfterElementToDeletem.setPrev(elementToDelete.getPrev());
        }

        if (elementToDelete == head){
            head = head.getNext();
            head.setPrev(null);
        }
        if (elementToDelete == tail){
            tail= tail.getPrev();
            tail.setNext(null);
        }

        couter--;
    }

    // DEBUG
    public void printAll() {
        Element currentElement = head;

        while (true) {
            System.out.println(currentElement.getData() + " ");
            if (currentElement.getNext() != null)
                currentElement = currentElement.getNext();
            else
                break;
        }
    }

}