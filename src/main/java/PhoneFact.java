public class PhoneFact implements PhoneLists {


   public static Object makePhone(Phones phones) {
       if (phones == Phones.IPhone) {
           return new IPhone();
       }
       if (phones == Phones.Samsung) {
           return new Samsung();
       }
       if (phones == Phones.Huawei) {
           return new Huawei();
       }
       return null;
   }

}
