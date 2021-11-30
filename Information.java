public class Information {
    //About program
    public static void Infromation(){
        System.out.println("\t About");
        System.out.println("\n\tAuthors\n");
        System.out.println("Diego Sanchez, dayan.ddsr@gmail.com");
        System.out.println("Christian Antonio, cris.guerr96@gmail.com");
        System.out.println("Lucia, javier.gandara04@gmail.com");
        System.out.println("Gustavo Javier, javier.gandara04@gmail.com");

        System.out.println("\nRepository: https://github.com/DDiegoSanchez/SIMPLEX\n");
        System.out.println("Last modification 29/11/2021\n");
    }

    //Instructions for use
    public static void userManual(){
        System.out.println("\n\t USER MANUAL");
        System.out.println("\nUser manual to be able to program to solve the simplex algorithm");
        System.out.println("\n\t1 option ''Enter mathematical model''\n");
        System.out.println("\nIn this option we can only enter the equations \nof the mathematical model.\n");
        System.out.println("\nWe will have to indicate the number of variables \nthat we will use, then it will ask us to enter the \nnumerical value with the variables that it will indicate to us.\n");
        System.out.println("\n\t2 option ''Create matrix''\n");
        System.out.println("\nIn this option it will ask us the number of variables \nand the number of restrictions, then we will \nenter the values of the matrix manually, the data of our matrix \nwill have to be entered by row.\n");
        System.out.println("\nThe last row will always be occupied by our objective function\n");
        System.out.println("\nThen our matrix will be printed with the data that we \nenter, it will also indicate what our input \ncolumn will be.\n");
    }
}
