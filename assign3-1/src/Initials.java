public class Initials {

    public static void main(String[] args){
        String name="Nahla Tarek";
        for(int i=0;i<name.length();i++)
        {
            if(Character.isUpperCase(name.charAt(i))) {

                System.out.print(name.charAt(i)+".");
            }
        }


    }
}
