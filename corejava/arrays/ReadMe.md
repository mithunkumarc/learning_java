
1. array can be returned as value from method.

        public Customer[] getCustomers() {
            Customer[] customers = {new Customer(), new Customer(), new Customer(), new Customer()};
            return customers;
          }

2. array can be declared as parameter while declaring method.

        public void premiumCustomers(Customer[] customers) {

          }

3. array can be sent as arugument to method.

        // using variable arguments to receive array
        public void premiumCustomers(Customer...customers) {

          }

          Customer[] pCustomers = {new Customer(), new Customer()};
          someInstance.premiumCustomers(pCustomers);

use index for loop or enhanced for loop to read array.
