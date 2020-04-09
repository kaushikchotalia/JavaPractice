package General;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PersonComputeAge {
    protected String   sName;
    protected Date birthdate;

    // Set/get name of a person

    public void setName( String sName ) {
        this.sName = sName;
    }

    public String getName() {
        return sName;
    }

    // ==============================================================
    // Compute age of a person ...
    // ==============================================================

    public int getAge() {

        // Calendar objects for "today" and "date of birth"...

        Calendar today    = Calendar.getInstance();
        Calendar birthday = new GregorianCalendar();
        birthday.setTime( birthdate );

        // Compute basic difference in years ....

        int yearDiff = today.get( Calendar.YEAR ) - birthday.get( Calendar.YEAR );

        // Birthday still needs to occur this year...

        if ( today.get(Calendar.MONTH) < birthday.get(Calendar.MONTH) )
            yearDiff = yearDiff - 1;
        else if (today.get(Calendar.MONTH) == birthday.get(Calendar.MONTH) &&
                today.get(Calendar.DATE)   < birthday.get(Calendar.DATE) ) {
            yearDiff = yearDiff - 1;
        }

        return yearDiff;
    }

    public void setBirthDate(Date aBirthDate) {
        this.birthdate = aBirthDate;

    }

    public void setBirthDate(int iYear, int iMonth, int iDay ) {
        Calendar cal = Calendar.getInstance();
        cal.set( iYear, iMonth, iDay );
        this.birthdate = cal.getTime();


    }

    public Date getBirthDate() {
        return birthdate;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Person Test");
        // String a = input.nextLine();
        PersonComputeAge p = new PersonComputeAge();
        p.setName("Disha");
        p.setBirthDate(1994, 11-1, 14);
        //p.setBirthDate(1994, Calendar.NOVEMBER, 14);
        System.out.println("person Name:" + p.getName());
        System.out.println("person bdate:" + p.getBirthDate());
        System.out.println("person Age:" + p.getAge());

    }

}



