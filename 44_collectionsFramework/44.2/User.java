class User {
    String name;
    int age;

    public boolean equals(Object obj) {
        if (this == obj) {
            System.out.println("1");
            return true; 
        } 

        boolean b = obj instanceof User;
        if (b) {
            User u = (User)obj;
            if (this.age == u.age && this.name.equals(u.name)) {
                System.out.println("2");
                return true; 
            }
            else {
                System.out.println("3");
                return false; 
            }
        }
        else {
            System.out.println("4");
            return false; 
        }
    }
}
