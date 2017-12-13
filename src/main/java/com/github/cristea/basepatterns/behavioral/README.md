#### Behavioral Patterns
* [Command](#Command)
* [Mediator](#Mediator)
* [Memento](#Memento)
* [Observer](#Observer)
* [Strategy](#Strategy)


##### <a id="Command"></a>Command
* Story

Issue requests to objects without knowing anything about the operation being requested or the receiver of the request.

When your car needs service you visit Car Service Center. On reception you explain a problem and you leave a car.
The person at reception encapsulates the problem in to order for Car Technician. The order is queued internaly.
Car Technician will receive a request and fix a problem.

* Implementation

UML: 

![alt text](https://github.com/cristeav49/IPP/blob/master/src/main/java/com/github/cristea/basepatterns/behavioral/command/pattern/diagram_command.png "UML Command")
![alt text](https://github.com/cristeav49/IPP/blob/master/src/main/java/com/github/cristea/basepatterns/behavioral/command/diagram_command.png "UML Command")

Source Code:

Clone repo:
```
$  git clone https://github.com/cristeav49/IPP.git .
```

Move to command folder:

```
$  cd /src/main/java/com/github/cristea/basepatterns/behavioral/command
```



##### <a id="Mediator"></a>Mediator
* Story

Defines an object that controls how a set of objects interact.

Radio Taxi is an example of the Mediator pattern.
Taxi drivers communicate with the Mediator(Radio Taxi Call Center), rather than with each other. 

When customer needs a taxi, he calls Radio Taxi Call Center. 
All taxis have a GPS unit which tells where the taxi is present right now, also there is a central information system which tells which taxi is available to serve the customer. 
The call center will contact the available taxi nearest to customer’s location and send them to serve the customer.

* Image

![alt text](https://github.com/cristeav49/IPP/blob/master/images/mediator.jpg "Call Center Taxis Libres")  

* Implementation

UML: 

![alt text](https://github.com/cristeav49/IPP/blob/master/src/main/java/com/github/cristea/basepatterns/behavioral/mediator/pattern/diagram_mediator.png "UML Mediator")
![alt text](https://github.com/cristeav49/IPP/blob/master/src/main/java/com/github/cristea/basepatterns/behavioral/mediator/diagram_mediator.png "UML Mediator")

Source Code:

Clone repo:
```
$  git clone https://github.com/cristeav49/IPP.git .
```

Move to mediator folder:

```
$  cd /src/main/java/com/github/cristea/basepatterns/behavioral/mediator
```

##### <a id="Memento"></a>Memento
* Story

Helps to restore an object’s state to it previous state.

Transactions are operations on the database that occur in an atomic, consistent, durable, and isolated fashion. 
A transaction can contain multiple operations on the database; each operation can succeed or fail, however a transaction guarantees that if all operations succeed, 
the transaction would commit and would be final. 
And if any operation fails, then the transaction would fail and all operations would rollback and leave the database as if nothing has happened.

This mechanism of rolling back uses the memento design pattern. 

* Image

![alt text](https://github.com/cristeav49/IPP/blob/master/images/memento.jpg "States of transaction")  
###### States of transaction 

* Implementation

UML: 

![alt text](https://github.com/cristeav49/IPP/blob/master/src/main/java/com/github/cristea/basepatterns/behavioral/memento/pattern/diagram_memento.png "UML Memento")
![alt text](https://github.com/cristeav49/IPP/blob/master/src/main/java/com/github/cristea/basepatterns/behavioral/memento/diagram_memento.png "UML Memento")

Source Code:

Clone repo:
```
$  git clone https://github.com/cristeav49/IPP.git .
```

Move to memento folder:

```
$  cd /src/main/java/com/github/cristea/basepatterns/behavioral/memento
```

##### <a id="Observer"></a>Observer
* Story

Keep me updated.

Newslettter subscription demonstrate Observer pattern.
A newsletter is a regularly distributed publication that is generally about one main topic of interest to its subscribers. 
Subscribers can subscribe or unsubscribe to the newsletters.

* Image

![alt text](https://github.com/cristeav49/IPP/blob/master/images/observer.jpg "Newsletter")  

* Implementation

UML: 

![alt text](https://github.com/cristeav49/IPP/blob/master/src/main/java/com/github/cristea/basepatterns/behavioral/observer/pattern/diagram_observer.png "UML Observer")
![alt text](https://github.com/cristeav49/IPP/blob/master/src/main/java/com/github/cristea/basepatterns/behavioral/observer/diagram_observer.png "UML Observer")

Source Code:

Clone repo:
```
$  git clone https://github.com/cristeav49/IPP.git .
```

Move to observer folder:

```
$  cd /src/main/java/com/github/cristea/basepatterns/behavioral/observer
```


##### <a id="Strategy"></a>Strategy
* Story

Select an algorithm at runtime.

Payment options in a Shopping Cart is an example of Strategy.
User can choose various payment options like Master Card, Amex or PayPal.
Any of these payment options will pay items in Shopping Cart, and they can be used interchangeably. 
The user must choose the Strategy based on his possibilities, preferences.

* Image

![alt text](https://github.com/cristeav49/IPP/blob/master/images/strategy.jpg "Credit Card")  

* Implementation

UML: 

![alt text](https://github.com/cristeav49/IPP/blob/master/src/main/java/com/github/cristea/basepatterns/behavioral/strategy/pattern/diagram_strategy.png "UML Strategy")
![alt text](https://github.com/cristeav49/IPP/blob/master/src/main/java/com/github/cristea/basepatterns/behavioral/strategy/diagram_strategy.png "UML Strategy")

Source Code:

Clone repo:
```
$  git clone https://github.com/cristeav49/IPP.git .
```

Move to state folder:

```
$  cd /src/main/java/com/github/cristea/basepatterns/behavioral/strategy
```

