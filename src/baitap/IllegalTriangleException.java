package baitap;

public class IllegalTriangleException extends Exception{
    // khai bao thuoc tinh
    String mess;

    // Tao Constructor
    public IllegalTriangleException(String message) {
        super(message);
        this.mess = message;
    }
}
