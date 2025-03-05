import java.lang.*;
import java.util.ArrayList;
import java.util.List;
// import java.util.ArrayList;
import java.util.Scanner;

public class First_Follow {
    public static boolean is_present(List<Character> first , char s){
        for(int i=0;i<first.size();i++){
            if(first.get(i) == s){
                return true;
            }
        }
        return false;
    }
    public static List<Character> first(char s,List<String> gr,char[] t,char[] nt,int te,int no_t){
        int ind=0;
        int  i=0;
        for(i=0;i<no_t;i++){
            if(gr.get(i).charAt(0)== s){
                ind=i;
                break;
            }
        }
        // int k=0;
        int flag=0;
        // List<char> first =new ArrayList<>();
        List<Character> first = new ArrayList<>();
        List<Character> temp = new ArrayList<>();
        // char[] follow = new char[t+1];
        
        for(i=3;i<gr.get(ind).length();i++){
            if(flag !=1 && is_terminal(t, gr.get(ind).charAt(i))){
                // first.add() =gr.get(ind).charAt(i);
                // System.out.println("Added into the first : "+ gr.get(ind).charAt(i));
                first.add(gr.get(ind).charAt(i));
                flag=1;

            }
            else if( flag !=1 && is_non_terminal(nt, gr.get(ind).charAt(i))){
                // System.out.println(gr.get(ind).charAt(i) +" Recursively called : for the " + s);
                temp = first( gr.get(ind).charAt(i), gr, t, nt, te, no_t);
                for(int j=0;j< temp.size();j++){
                    if(!is_present(first ,temp.get(j))){

                    
                    first.add(temp.get(j));
                    }
                 
            }
               
                
            }
            else if(gr.get(ind).charAt(i) == '|'){
                flag = 0;

            }
        }
        // System.out.println("First is : ");
       

        // List<Character> temp = new ArrayList<>();
       
    
        return first;
    }
    public static List<Character> follow(char s,List<String> gr,char[] t,char[] nt,int te,int no_t){
        List<Character> follow = new ArrayList<>();
        List<Character> temp= new ArrayList<>();
        int flag=0;
        for(int i=0;i<no_t;i++){
            for(int j=3;j<gr.get(i).length() ; j++){

                if(s == gr.get(i).charAt(j)){
                    if(gr.get(i).charAt(j+1) == '|'){
                        temp = follow(gr.get(i).charAt(0),gr,t,nt,te, no_t);
                        flag=1;
                        for(int k=0;k< temp.size();k++){
                            if(!is_present(follow ,temp.get(k))){
        
                            
                            follow.add(temp.get(k));
                            }
                         
                    }

                    }
                    else if(is_terminal(t,gr.get(i).charAt(j+1))){
                        follow.add(gr.get(i).charAt(j+1));
                        flag=1;
                    }
                    else if(is_non_terminal(nt,gr.get(i).charAt(j+1))){
                        temp = first(gr.get(i).charAt(j+1),gr,t,nt,te,no_t);
                        flag=1;
                        for(int k=0;k< temp.size();k++){
                            if(!is_present(follow ,temp.get(k))){
        
                            
                            follow.add(temp.get(k));
                            }
                         
                    }
                    }
                    
                }
            

        }
    }
    if(flag==0){
        follow.add('$');
    }
        return follow;
    }
    public static boolean is_terminal(char[] x,char t){
        for(int i=0;i<x.length;i++){
            if(x[i] == t){
                return true;
            }
        }

        return false;

    }
    public static boolean is_non_terminal(char[] x,char t){
        for(int i=0;i<x.length;i++){
            if(x[i] == t){
                return true;
            }
        }

        return false;

    }
    public static void main(String []args){
        
        System.out.println("Welcome in my java program : ");
        Scanner sc=new Scanner(System.in);
        List<String> gr= new ArrayList<>();
        String line;
        System.out.println("Enter the number of lines in the grammer : ");

        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the grammer line by line ");
        for(int i=0;i<n;i++){
            line = sc.nextLine();
            gr.add(line);
        }
        for(int i=0;i<n;i++){
            System.out.println(gr.get(i));
        }
        int t,nt;
        System.out.println("Enter the number of non-terminals in the grammer :  ");
        nt=sc.nextInt();
        System.out.println("Enter the number of terminals in the grammer :  ");
        t=sc.nextInt();
        char[] terminal=new char[t];
        char[] non_terminal=new char[nt];
        System.out.println("Enter the terminals one by one : ");
        int i=0;
        for(i=0;i<t;i++){
            terminal[i]=sc.next().charAt(0);

        }
        System.out.println("Enter the non-terminals one by one : ");
        // int i=0;
        for(i=0;i<nt;i++){
            non_terminal[i]=sc.next().charAt(0);

        }
        System.out.println("The given grammer is :  ");
        for (String str: gr) {
            System.out.println(str);
            
        }
        System.out.println("The non terminals are : ");
        for(i=0;i<nt;i++){
            System.out.println(non_terminal[i]);
        }
        System.out.println("The terminals are : ");
        for(i=0;i<t;i++){
            System.out.println(terminal[i]);
        }
        System.out.println("Enter the non terminal whose first and follow you want to calculate : ");
        char s=sc.next().charAt(0);
        for(i=0;i<nt;i++){
            if(gr.get(i).charAt(0)== s){
                break;
            }
        }
        
        List<Character> first = new ArrayList<>();
        List<Character> follow = new ArrayList<>();

        first = first(s,gr,terminal,non_terminal,t,nt);
        System.out.println("The First is : ");
        for(i=0;i< first.size();i++){
            System.out.printf("%c  ",first.get(i));

        
        }
        System.out.printf("\nThe follow is : \n");
        follow=follow(s,gr,terminal,non_terminal,t,nt);
        for(i=0;i< follow.size();i++){
            // System.out.println(follow.get(i));
            System.out.printf("%c  ",follow.get(i));

        }
    
        }
}
