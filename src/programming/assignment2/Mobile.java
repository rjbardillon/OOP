/*
Bardillon, Romeo Jr, M.
BSIT 2-2
Mobile.java
 */
package programming.assignment2;

public class Mobile {
    String phoneName, companyName;
    float phoneSize;
    Mobile(){

    }

    public void createNewCellphone(String phoneName, String companyName, float phoneSize){
        this.phoneName = phoneName;
        this.companyName = companyName;
        this.phoneSize = phoneSize;
    }

    public void displayNewCellphone(){
        System.out.printf("Phone Name = %s %nCompany Name = %s %nSize = %.1f %n%n", phoneName, companyName, phoneSize);
    }

    public static void main(String[] args){
        //First Object made with initialization through referencing.
        Mobile iPhone1 = new Mobile();
        iPhone1.phoneName = "iPhone 12 Pro Max";
        iPhone1.companyName = "Apple";
        iPhone1.phoneSize = 6.7f;
        iPhone1.displayNewCellphone();

        //Second Object made with initialization through referencing.
        Mobile iPhone2 = new Mobile();
        iPhone2.phoneName = "iPhone 8 Plus";
        iPhone2.companyName = "Apple";
        iPhone2.phoneSize = 5.5f;
        iPhone2.displayNewCellphone();

        //Third Object made with initialization through method.
        Mobile samsung = new Mobile();
        samsung.createNewCellphone("Galaxy S20", "Samsung", 6.2f);
        samsung.displayNewCellphone();

        //Fourth Object made with initialization through method.
        Mobile asus = new Mobile();
        asus.createNewCellphone("ZenFone 5Z","Asus", 6.2f);
        asus.displayNewCellphone();
    }
}
