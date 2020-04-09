package General;

public class MethodPractice {
    public static class Family{
        String FatherName, MotherName, SonName, DaughterName;
        int FatherSalary, MotherSalary, SonFee, DaughterFee;
        int TotalSalary;
        int Grocery = 500;
        int TotalFees;
        int TotalExpense;
        int TotalSaving;

        public void displayNames(String fName, String mName, String sName, String dName)
        {
            FatherName = fName;
            MotherName = mName;
            SonName = sName;
            DaughterName = sName;
            //System.out.println(FatherName);

        }

        public int getTotalSalary(int fSalary, int mSalary)
        {
            FatherSalary = fSalary;
            MotherSalary = mSalary;
            TotalSalary = FatherSalary + MotherSalary;
            return TotalSalary;
        }
        public int getTotalFees(int sFees, int dFees)
        {
            SonFee = sFees;
            DaughterFee = dFees;
            TotalFees = SonFee + DaughterFee;
            return TotalFees;
        }
        public int getSavings()
        {
            TotalExpense = Grocery + TotalFees;
            TotalSaving = TotalSalary - TotalExpense;
            return TotalSaving;
        }
        public void savingCheck()
        {
            if(TotalSaving>1000)
            {
                System.out.println("Congratulation!! " +FatherName +"you saved this much " +TotalSaving);
            }
            else
            {
                System.out.println("Dear" +FatherName+ "!! Please try to save for next month");
            }
        }
    }

    public static void main(String[] args) {
        Family obj = new Family();
        obj.displayNames("Mr. Father ","Mother","Son","Daughter");
        obj.getTotalFees(600,800);
        obj.getTotalSalary(5000,3000);
        obj.getSavings();
        obj.savingCheck();

    }
}
