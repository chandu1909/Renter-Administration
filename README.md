# Renter-Administration

This microservice is soloey responsible for all the operations and features provided to the RENTER such as adding new items to the inventory, updating the prices, giving the reviews to the customers,
and updating the availability of the items in case , deleting the existing items from the inventory, out of the town notificatlion which makes all the items unavailable between the dates,
notes. 

*This services uses Postgresql for the persistance 
* This service might use Messaging queue in order to update the inventory database.
* All APIs related to renter administration will be built here.

# Terminology
Renter : Person who rents out the items.
Rentee : Person who takes the tools for rent. 


#Unavailable Script
As of now, the plan is to run two scripts everynight to make tools unavailable if the system date matches with the starting unavailable date and change availability status.
At the same time find all the tools which are ending their unavailability period on the system date and change their status to avialable. THIS MIGHT CHANGE IN FUTURE.