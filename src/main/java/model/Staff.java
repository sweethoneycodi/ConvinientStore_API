package model;


import enums.Role;

public class Staff extends Person {
   private String id;
   private Role role;

   public Staff(String name, String phoneNumber, String email, String id, Role role) {
      super(name, phoneNumber, email);
      this.id = id;
      this.role = role;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public Role getRole() {
      return role;
   }

   public void setRole(Role role) {
      this.role = role;
   }

//   @Override
//   public void dispenseReceipt(Customer customer) {
//      double totalPrice = 0;
//      System.out.println("\n\t\t ***** RECEIPT ***** \n");
//      System.out.println("Name:   " + customer.getName());
//      System.out.println("Contact:   " + customer.getPhoneNumber());
//      System.out.println("\n          Products Purchased                         \n");
//      for (int i = 0; i < customer.getCart().size(); i++) {
//         Product product = customer.getCart().get(i);
//         totalPrice += product.getPrice() * product.getQuantity();
//         System.out.println(i + 1 + "." + "  " + product.getName() + " ".repeat(15 - product.getName().length())
//                 + "       " + product.getQuantity() + "        "+ product.getPrice());
//      }
//      System.out.println("\n---------------------------------------");
//      System.out.println("Total \t\t\t\t\t\t \t # " + totalPrice);
//      System.out.println("---------------------------------------");
//   }
//
//
//
//
//   @Override
//   public String hireCashier(Applicant applicant) {
//   if (applicant.getRole() == Role.CASHIER && applicant.getQualification() == Qualification.MSC) {
//      System.out.println("You are eligible for the role");
//      return "You are eligible for the role";
//   } else
//      throw new RuntimeException("not eligible");
//   }
//
//   @Override
//   public void addToProductList(Store store) {
//
//
//      String path ="/Users/macbookpro/Downloads/PRODUCT.csv";
//      String line = "";
//      try{
//         BufferedReader br = new BufferedReader(new FileReader(path));
//
//         while ((line = br.readLine()) != null){
//            String[] value = line.split(",");
//            Product product = new Product(value[0],value[1],Integer.parseInt(value[2]),Double.parseDouble(value[3]));
//            store.getProductList().add(product);
//         }
//      }catch (FileNotFoundException e){
//         e.printStackTrace();
//      }catch (IOException e) {
//         e.printStackTrace();
//      }
//
//   }




}
