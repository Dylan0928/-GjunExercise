public class VacationScaleTest {

    public static void main(String[] args) {
        VacationScale vacation = new VacationScale();
        vacation.yearOfService=1;
        vacation.displayVacationDays();
        vacation.yearOfService=5;
        vacation.displayVacationDays();
        vacation.yearOfService=10;
        vacation.displayVacationDays();        
    }
    
}
