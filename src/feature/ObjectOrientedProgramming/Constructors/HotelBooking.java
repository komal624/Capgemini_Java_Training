package feature.ObjectOrientedProgramming.Constructors;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() {
        this("Guest", "Standard", 1);
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking h) {
        this.guestName = h.guestName;
        this.roomType = h.roomType;
        this.nights = h.nights;
    }

    void display() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("----------------------");
    }

    // Makes this class runnable
    public static void main(String[] args) {
        // Default
        HotelBooking h1 = new HotelBooking();
        h1.display();

        // Parameterized
        HotelBooking h2 = new HotelBooking("Komal", "Deluxe", 3);
        h2.display();

        // Copy
        HotelBooking h3 = new HotelBooking(h2);
        h3.display();
    }
}
