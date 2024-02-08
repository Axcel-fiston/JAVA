public class Main {
    public static void main(String[] args) {
   int i =1;
   while (i<=5){
       LPAStudent st = new LPAStudent("61781 " +i,
               switch (i) {
                   case 1 -> "Axcel";
                   case 2 -> "Fiston";
                   case 3 -> "Audi";
                   case 4 -> " Olly";
                   case 5 -> "Dark";
                   default -> "Anonymous";
               }, "12/11/2001" , "JavaMasterClass");

       i++;

       System.out.println(st);

               }

   Student PojoStudent = new Student("58565542", "Ann" , "50/11/1222" , "JavaMasterClass");
   LPAStudent recordStudent = new LPAStudent("253353" , "Bill" , " 01/02/2022" , "Java MasterClass");

   System.out.println(PojoStudent);
   System.out.println(recordStudent);

   PojoStudent.setClassList(PojoStudent.getClassList() + " , Java OCP Exam 829");
//   recordStudent.setClassList( recordStudent.classList() + " ,  Java OCP Exam 829 ");

   System.out.println(PojoStudent.getName() + " is taking " + PojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
   }
}