package com.hieunt2008110113.tuan06;

public class CTMinhHoa {
 public static void main(String[] args) {

    So so1, so2;
    
    so1 = new So(5);

    so2 = new So(10);


    }
    static void swap(So a, So b){
        So temp;
        temp = a;
        a.number = b.number;

        b.number = temp.number;
        
    }
    
}
