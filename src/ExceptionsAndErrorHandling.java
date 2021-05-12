public class ExceptionsAndErrorHandling {
    public static void main(String[] args) throws Exception {
        //   throw new Exception("This has broken down! Exception!"); //Throwing a generic exception: will break our application!
        //A bunch of nice code down here - unreachable past a thrown exception!
        //    System.out.println("Will we see this? :( Probably not, right - top to bottom, this exception is above us down here, what do you think?"); //Unreachable code after the exception!

        //So: We see that we can throw an exception and that we immediately break our application with that exception -
        //The question arises: How do we actually program an unhappy path that follows an exception being thrown?
        //try {//code that might break} catch (Exception someKindOfException){ //code for Java to do after break}


        try {
            System.out.println("Let's see...");
            int result = 1 / 0;
            System.out.println("With reckless abandon and little thought to what they had done, the Marco cohort undid all of math.");
            System.out.println("result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("User attempted to divide by Zero.");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        } catch (Exception e) {
            //Expand down the line - moving towards less specificity with each Catch block{}
        }

        //An example of an array:

//        int[] numbers = {1, 2, 3};
//        int x;
//        try {
//            x = numbers[100];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception caught!");
//            x = 0;
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("This will always run. [For example: 'I have completed the operation message'] "); //finally area is usually used for some kind of clean up or completion message - what do I mean by clean up? Finally. . close the DB connection for example.
//        }

        //Real life scenario: I'd say something you will be doing at the latest during the ContactsManager
//        try {
//            //to connect to the database to get all of the user information
//            //OHHHH YEAH! IT WORKED: load in all the users, load in all of the posts/movies/coffees/whatever is going on in your application
//            //proceed as normal. . .
//        } catch (SomethingWrongWithDbConnection connectionFailed){
//            //if connection to DB failed: what's our gameplan? ?
//            //printTheStackTrace for the db connection failing
//            //sout a message to myself: check DB connection - connection failed
//        }



    }

}