import java.util.concurrent.CompletableFuture;

class MainUtil{
    public static String getMailInfo(){
        return "Your email content";
    }

    public static boolean sendEmail(){
        System.out.println("Send email: completed");
        return true;
    }

    public static  void logging (){
        System.out.println("Log: Send mail at  "+ System.currentTimeMillis());
    }
}
public class CompleteFuture6ThenAcceptAndThenRun {
    public static void main(String[] args) {
        CompletableFuture.supplyAsync(()->{
            return MainUtil.getMailInfo();
        }).thenAccept(content->{
            System.out.println("Mail content: "+ content);
        });

        System.out.println("\n");

        CompletableFuture.supplyAsync(()->{
            return MainUtil.sendEmail();
        }).thenRun(()->{
            MainUtil.logging();
        });
    }




}
