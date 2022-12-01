package exersize9;

public class Main {
    public static void main(String[] args) {
        Phone phone1=new Phone(1,12,"blue","Iphone ",12300);
        Phone phone2=new Phone(2,14,"gold","Iphone ",12000);
        Phone phone3=new Phone(3,15,"red","Iphone ",11300);
        Phone phone4=new Phone(4,13,"grey","Iphone ",13300);
        Phone phone5=new Phone(5,18,"black","Iphone ",17300);

        Phone[] phones=new Phone[5];
        phones[0]=phone1;
        phones[1]=phone2;
        phones[2]=phone3;
        phones[3]=phone4;
        phones[4]=phone5;

        Main main=new Main();
        for (Phone phone : main.printprice(phones)) {
            System.out.println(phone);
        }

    }
    public Phone[] printprice(Phone[] phones) {
        Phone tawp;
        for (int i = 0; i < phones.length ; i++) {
            for (int j = i; j < phones.length ; j++) {
                if(phones[i].getPrice()<phones[j].getPrice()){
                    tawp=phones[i];
                    phones[i]=phones[j];
                    phones[j]=tawp;
                }
            }
        }
        return phones;
    }
}
