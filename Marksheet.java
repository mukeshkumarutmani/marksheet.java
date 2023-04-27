import java.util.Scanner;

class Marksheet {
    public static void main(String[] args) {
        int total_students = 2;
        Scanner obj = new Scanner(System.in);
        int rollno[] = { total_students };
        String name[] = new String[total_students];
        int s1[] = new int[total_students];
        int s2[] = new int[total_students];
        int s3[] = new int[total_students];
        int s4[] = new int[total_students];
        int s5[] = new int[total_students];
        int s6[] = new int[total_students];
        double per[] = new double[total_students];
        char grade[] = new char[total_students];
        for (int i = 0; i <total_students; i++) {
            System.out.println("Enter Student " + (i + 1) + " Result ");
            System.out.print("Roll num: ");
            rollno[i] = obj.nextInt();
            obj.nextLine();
            System.out.print("Name: ");
            name[i] = obj.nextLine();
            System.out.print("Programming:               ");
            s1[i] = obj.nextInt();
            System.out.print("Discrete Structure:        ");
            s2[i] = obj.nextInt();
            System.out.print("Probability:               ");
            s3[i] = obj.nextInt();
            System.out.print("ProjectAndMange:           ");
            s4[i] = obj.nextInt();
            System.out.print("Communication:             ");
            s5[i] = obj.nextInt();
            System.out.print("Digital and logic design:  ");
            s6[i] = obj.nextInt();

            per[i] = (((s1[i] + s2[i] + s3[i] + s4[i] + s5[i] + s6[i]) / 600) * 100);
            if (per[i] < 40) {
                grade[i] = 'D';
            } else if (per[i] < 60) {
                grade[i] = 'C';
            } else if (per[i] < 70) {
                grade[i] = 'B';
            } else if (per[i] < 80) {
                grade[i] = 'A';
            } else {
                grade[i] = 'A' + '+';
            }
        }
        System.out.println();
        for(int i=0; i<total_students; i++ ){
            System.out.println(rollno[i]+"\t"+name+"\t"+per+"\t"+grade);


        }

    }
}