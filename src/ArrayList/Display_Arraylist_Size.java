package ArrayList;

import java.util.*;

public class Display_Arraylist_Size {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

//        Print the list
        System.out.println("The Arraylist: " + list);



//      the size of arraylist
        System.out.println("Size of Arraylist: " + list.size());



//        Check if the list is empty or not. |  list.isEmpty()  |

//        if(list.isEmpty())
//        {
//            System.out.println("List is empty.");
//        }else{
//            System.out.println("List has elements.");
//        }




//        Getting elements of specified index |  list.get(index)  |

//        System.out.print("Enter index to find the element: ");
//        int idx =sc.nextInt();
//        try {
//            System.out.print("Element at location " + idx + " is: " + list.get(idx));
//        }
//        catch(IndexOutOfBoundsException e){
//            System.out.println("Invalid index.");
//        }



//        Insert elements into specified index. |  list.add(Index,Value)  |

//        System.out.println("Enter Index to add the element in list:");
//        int idx2 =sc.nextInt();
//
//        if(idx2 >= 0 && idx2 <=list.size()){
//
//            System.out.print("Enter value to add: ");
//            int val = sc.nextInt();
//            list.add(idx2,val);
//            System.out.println(list);
//        }else{
//            System.out.println("Index is not valid.");
//        }



//        To remove all the elements of the list. |  list.clear()  |
//        list.clear();



//      Remove an element from the list from specified index.  |  list.remove(index of element)  |

//        list.remove(1);
//        list.remove(3);
//        System.out.println(list);



//        to check if list contains specific element or not. | list.contains(value of element) |

//        System.out.println(list);
//        System.out.println(list.contains(400));
//        System.out.println(list.contains(50));



//        To find the index of specified element.    |  indexOf( index of element) |

//        System.out.print("Enter element to find its index:");
//        int input = sc.nextInt();
//        int index = list.indexOf(input);
//        System.out.println("Index Of " + input + " is: " + index +".");



//        To replace the existing value     |  set( index,value)  |

//        System.out.println("Enter element to replace:");
//        int ele = sc.nextInt();
//
//        if(list.contains(ele)){
//            System.out.println("Enter new element:");
//            int newele = sc.nextInt();
//            int idx3 = list.indexOf(ele);
//
//            list.set(idx3,newele);
//            System.out.println(list);



//          for each loop in collection.
        for(int ele : list){
            System.out.println(ele);

        }

        }
    }

