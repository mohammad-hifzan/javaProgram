import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
    
class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, parser);
        // throw new UnsupportedOperationException("Please implement the AppointmentScheduler.schedule() method");
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime currentTime = LocalDateTime.now();
        return appointmentDate.isBefore(currentTime);
        // throw new UnsupportedOperationException("Please implement the AppointmentScheduler.hasPassed() method");
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        if (hour >= 12 && hour < 18) {
            return true;
        } else {
            return false;   
        }
        // throw new UnsupportedOperationException("Please implement the AppointmentScheduler.isAfternoonAppointment() method");
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter printer =  DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a.");
        String formattedDate = printer.format(appointmentDate);
        return "You have an appointment on " + formattedDate;
        // throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getDescription() method");
    }

    public LocalDate getAnniversaryDate() {
        LocalDateTime currentTime = LocalDateTime.now();
        int year = currentTime.getYear();
        return LocalDate.of(year, 9, 15);
        // throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getAnniversaryDate() method");
    }
}
