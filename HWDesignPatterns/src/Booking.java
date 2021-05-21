public class HWAdapter {

    interface HotelBooking {
        void book(String room);
    }
    interface MotelBooking {
        void book(String room);
    }
    interface ApartmentBooking {
        void book(String apartment);
    }
    interface VillaBooking {
        void book(String villa);
    }
    interface GuestHouse {
        void book(String house);
    }

    static class SingleRoom implements HotelBooking {

        @Override
        public void book(String room) {
            System.out.println("Booking" + room + "in the hotel");
        }
    }
    class DoubleRoom implements HotelBooking {

        @Override
        public void book(String room) {
            System.out.println("Booking" + room + "in the hotel");
        }
    }
    class BookingAdapter implements HotelBooking {

        private HotelBooking hotelBooking;
        private MotelBooking motelBooking;
        private ApartmentBooking apartmentbooking;
        private GuestHouse guestHouse;

        public BookingAdapter(HotelBooking hotelBooking) {
            this.hotelBooking = hotelBooking;
        }

        public BookingAdapter(MotelBooking motelBooking) {
            this.motelBooking = motelBooking;
        }

        @Override
        public void book(String room) {
            if (hotelBooking != null) {
                hotelBooking.book(room);
            } else {
                System.out.println("there is no room available!");
            }
        }
    }
    public class AdapterPattern {
        public static void main(String[] args) {
            HotelBooking hotelBooking = new HotelBooking() {
                @Override
                public void book(String room) {

                }
            };
            hotelBooking.book("Single room");

            HotelBooking specialBooking;

            specialBooking = new BookingAdapter((new SingleRoom());
            specialBooking.book("Single room");


                }
            }
}




