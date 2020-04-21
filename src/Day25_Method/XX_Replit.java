package Day25_Method;

public class XX_Replit {
    public static void main(String[] args) {
        validateTask(true, 3, 1);
        validateTask(false,7,6);
        validateTask(true, 7,6);
    }

    public static boolean validateTask(boolean notEmpty, int taskId, int currentId) {

        notEmpty = notEmpty==true && (taskId <= 0 || taskId > 0) && taskId > 1; // there a number an bigger than one

       if(((notEmpty) && ((taskId - 1) == currentId))) {
           System.out.println("validateTask("+notEmpty+","+taskId+","+currentId+")");
           System.out.println("true");
           return true;
       }
        else { System.out.println("validateTask("+notEmpty+","+taskId+","+currentId+")");
                       System.out.println("False");
                }return false;}}
