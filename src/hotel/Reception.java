package hotel;

import java.util.List;

public class Reception {
	Hotel universal = new Hotel();

	public void checkIn(Customer customer) { // pagamento Template method, prezzo

		// usa il builder
		// come attaccare una stanza al tizio,senza colla
		universal.customersList.add(customer);

		// strategy person o family
	}

	public void checkOut(Customer customer) {
		// if(customersList.contains(customer))
		universal.customersList.remove(customer);
		// throw exception
	}

	public List<Customer> getCustomersList() {
		return universal.customersList;
	}
}
