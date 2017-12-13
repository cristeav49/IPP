
#### Creational Patterns
* [Singleton](#Singleton)
* [Prototype](#Prototype)
* [Builder](#Builder)
* [Factory Method](#FactoryMethod)
* [Abstract Factory](#AbstractFactory)



##### <a id="Singleton"></a>Singleton
* Story

Singleton ensures that only one(single) object can be created from the class.

Men's 100 meters world record holder is a singleton.
There can be at most one active "Men's 100 meters world record holder" at any given time. 
Regardless of who that person is the title, "Men's 100 meters world record holder" is a global point of access that identifies the fastes person in the world.

* Image

![alt text](https://github.com/cristeav49/IPP/blob/master/Patterns/images/singleton.jpg "Usain Bolt, Men's 100 meters world record holder")  

* Implementation


UML: 

![alt text](https://github.com/cristeav49/IPP/blob/master/Patterns/src/main/java/com/github/cristea/basepatterns/creational/singleton/pattern/diagram_singleton.png "UML Singleton")
![alt text](https://github.com/cristeav49/IPP/blob/master/Patterns/src/main/java/com/github/cristea/basepatterns/creational/singleton/diagram_singleton.png "UML Singleton")

Source Code:

Clone repo:
```
$  git clone https://github.com/cristeav49/IPP.git .
```

Move to singleton folder:

```
$  cd /src/main/java/com/github/cristea/basepatterns/creational/singleton
```

##### <a id="Prototype"></a>Prototype
* Story

Clone itself.

Sheep Dolly is the first mammal to be cloned, so Dolly is a duplicate.

* Image

![alt text](https://github.com/cristeav49/IPP/blob/master/Patterns/images/prototype.jpg "Sheep Dolly")  

* Implementation

UML: 

![alt text](https://github.com/cristeav49/IPP/blob/master/Patterns/src/main/java/com/github/cristea/basepatterns/creational/prototype/pattern/diagram_prototype.png "UML Prototype")
![alt text](https://github.com/cristeav49/IPP/blob/master/Patterns/src/main/java/com/github/cristea/basepatterns/creational/prototype/diagram_prototype.png "UML Prototype")

Source Code:

Clone repo:
```
$  git clone https://github.com/cristeav49/IPP.git .
```

Move to prototype folder:

```
$  cd /src/main/java/com/github/cristea/basepatterns/creational/prototype
```

##### <a id="Builder"></a>Builder
* Story

Separates the construction of a complex object from its representation so that the same construction process can create different representations.

This pattern is used by PC shops to contruct PC's.
PC is combination of various parts like CPU, motherboard, memory, storage, power supply, video card, etc.
To build a PC same construction process is used even for each part we have different variation.
Whether a customer picks a classical hard disk or SSD for storage, the construction process is the same. 

* Image

![alt text](https://github.com/cristeav49/IPP/blob/master/Patterns/images/builder.jpg "The Antec P180, a popular computer case, suitable for use as a silent PC")  

* Implementation

UML: 

![alt text](https://github.com/cristeav49/IPP/blob/master/Patterns/src/main/java/com/github/cristea/basepatterns/creational/builder/pattern/diagram_builder.png "UML Prototype")
![alt text](https://github.com/cristeav49/IPP/blob/master/Patterns/src/main/java/com/github/cristea/basepatterns/creational/builder/diagram_builder.png "UML Prototype")

Source Code:

Clone repo:
```
$  git clone https://github.com/cristeav49/IPP.git .
```

Move to builder folder:

```
$  cd /src/main/java/com/github/cristea/basepatterns/creational/builder
```


##### <a id="FactoryMethod"></a>Factory Method
* Story

Defines an interface for creating objects, but lets subclasses decides which class to instantiate.
Plasticine is used for children's play. Plasticine is injected into predefined molds. The class of end product(ball, toy, sculpture, cake) is determined by the mold.

* Image

![alt text](https://github.com/cristeav49/IPP/blob/master/Patterns/images/factorymethod.jpg "Cake molds, Han people, metal - Museum of Vietnamese History - Ho Chi Minh City")  

* Implementation

UML: 

![alt text](https://github.com/cristeav49/IPP/blob/master/Patterns/src/main/java/com/github/cristea/basepatterns/creational/factorymethod/pattern/diagram_factory_method.png "UML Factory Method")
![alt text](https://github.com/cristeav49/IPP/blob/master/Patterns/src/main/java/com/github/cristea/basepatterns/creational/factorymethod/diagram_factory_method.png "UML Factory Method")

Source Code:

Clone repo:
```
$  git clone https://github.com/cristeav49/IPP.git .
```

Move to factorymethod folder:

```
$  cd /src/main/java/com/github/cristea/basepatterns/creational/factorymethod
```

##### <a id="AbstractFactory"></a>Abstract Factory
* Story

Provides an interface for creating families of related objects, without specifying concrete classes. 

This pattern is found in the cards stamping equipment used in the 
manufacture in order to produce playing cards. 
Cards stamping machine is an Abstract Factory which produces a cards. 
The same machine is used to stamp French, Italian or German cards. 

* Image

![alt text](https://github.com/cristeav49/IPP/blob/master/Patterns/images/abstractfactory.jpg "Poker Cards Back")  




* Implementation

UML: 

![alt text](https://github.com/cristeav49/IPP/blob/master/Patterns/src/main/java/com/github/cristea/basepatterns/creational/abstractfactory/pattern/diagram_abstract_factory.png "UML Abstract Factory")
![alt text](https://github.com/cristeav49/IPP/blob/master/Patterns/src/main/java/com/github/cristea/basepatterns/creational/abstractfactory/diagram_abstract_factory.png "UML Abstract Factory")

Source Code:

Clone repo:
```
$  git clone https://github.com/cristeav49/IPP.git .
```

Move to abstractfactory folder:

```
$  cd /src/main/java/com/github/cristea/basepatterns/creational/abstractfactory
```

