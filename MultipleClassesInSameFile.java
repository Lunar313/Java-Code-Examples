public class MultipleClassesInSameFile {
    public static void main(String[]args){
        System.out.println(GenerateMessage.generateMessage());
        System.out.println(AnotherMessage.generateAnotherMessage());
        
    }
}
class GenerateMessage{
    static String generateMessage(){
        return "Hier ist eine Nachricht!";
    }
}
class AnotherMessage{
    static String generateAnotherMessage(){
        return "Hier ist eine weitere Nachricht!";
    }
}