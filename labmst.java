import java.util.*;

public class labmst {
    String movie = "";
    boolean rented;
    Double rate;

    void set_name(String s) {
        this.movie = s;
        this.rate = 0.00;
        this.rented = false;
    }

    String get_name() {
        return this.movie;

    }

    boolean getrent() {
        return this.rented;
    }

    Double getrate() {
        return this.rate;
    }

}

class Main9836 extends labmst {
    public static void main(String args[]) {
        labmst v[] = new labmst[100];
        int a = 1, b, k = 0;
        Scanner sn = new Scanner(System.in);
        String movie = "";
        while (a == 1) {
            System.out.println("1 to add     :");
            System.out.println("2 to rent    :");
            System.out.println("3 to rate    :");
            System.out.println("4 to display :");
            b = sn.nextInt();
            switch (b) {
                case 1: {
                    v[k] = new labmst();  // new object 
                    System.out.print("Enter movie u want to add:");
                    movie = sn.next();
                    v[k].set_name(movie);
                    k++;
                    break;

                }
                case 2: {
                    System.out.print("Enter movie u want to rent:");
                    movie = sn.next();
                    boolean found = false;
                    for (int i = 0; i < k; i++) {
                        if (movie.compareTo(v[i].get_name()) == 0) // movie found
                        {
                            found = true;
                            if (v[i].rented == false)
                                v[i].rented = true;
                            else
                                System.out.print("Vedio is already rented :");
                            break;
                        }

                    }
                    if (found == false)
                        System.out.print("movie you are searching do not exist :");
                    break;

                }
                case 3: {
                    System.out.print("Enter movie u want to rate:");
                    movie = sn.next();
                    boolean found = false;
                    for (int i = 0; i < k; i++) {
                        if (movie.compareTo(v[i].get_name()) == 0) // movie found
                        {
                            found = true;
                            if (v[i].rented == true) {
                                System.out.print("rate the movie:");
                                v[i].rate = sn.nextDouble();
                                v[i].rented=false;
                            }
                            break;
                        }

                    }
                    if (found == false)
                        System.out.print("movie you are searching do not exist :");
                    break;

                }
                case 4: {
                    for (int i = 0; i < k; i++) {
                        System.out.println("movie          rented              rating ");
                        System.out.println(
                                v[i].get_name() + "           " + v[i].getrate() + "                " + v[i].getrent());
                    }

                }
            }
        }
    }
}
