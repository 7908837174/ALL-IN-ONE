public class StackLinklist {
    class stack{
        static ArrayList<Integer> list= new ArrayList<>(); 
        public void boolean isEmpty(){
            return list.size() == 0;
        }

        public static void pop(){
            if(isEmpty()){
                System.out.println("Empty stack");
                return;
            }
            int top = list.get(list.size() -1);
            list.remove(lest.size() -1);
        return top;
        }
    }
}
