public class Solution {
    public static void main(String[] args) {
        int ironManTicket = 25;
        int thorTicket = 14;
        int ticketCount = 45;
        int winTicket = (int) (Math.random() * ticketCount);
        if (winTicket == ironManTicket) {
            System.out.println("Железный человек выйграл! У него был билет №" + ironManTicket);
        } else if (winTicket == thorTicket) {
            System.out.println("Тор победитель, у него был билет №" + thorTicket);
        } else {
            System.out.println("К сожалению, парни, сегодня не ваш день");
        }
    }
}
