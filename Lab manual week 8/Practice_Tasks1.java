

/*

Using interfaces, you can specify similar behaviors for possibly disparate classes. Governments
and companies worldwide are becoming increasingly concerned with carbon footprints (annual
releases of carbon dioxide into the atmosphere) from buildings burning various types of fuels for
heat, vehicles burning fuels for power, and the like.
Many scientists blame these greenhouse gases for the phenomenon called global warming.
Create three small classes unrelated by inheritance—classes Building, Car and Bicycle.
Draw a UML diagram and give each class some unique appropriate attributes and behaviors that
it does not have in common with other classes.
Write an interface releaseCarbonFootprint with a getCarbonFootprint() method. Have each of
your classes implement that interface, so that its getCarbonFootprint() method calculates an
appropriate carbon footprint for that class (surf the web and find out how to calculate different
carbon footprints).
For Building: (Add Carbon footprints in the result of Natural Gas and Electricity consumption)
Due to Natural Gas Consumption : 
Value of therms of natural gas the building consumes, multiply by a emission factor of 11.7
Due to Electricity Consumption:
Carbon foot print (in kg)= [consumption of energy] x emission factor =
Latest emission factor for electricity consumption is 0.82
For Car:
For Diesel: Fuel Consumption per Km in Litre x 2640 g/l / 100
For Petrol: Fuel Consumption per Km in Litre x 2392 g/l / 100
For LPG: Fuel Consumption per Km in Litre x 1665 g/l / 100 (per km)
For High Calorific CNG: Fuel Consumption per Km in Kg x 2252/100
For Low Calorific CNG:Fuel Consumption per Km in Kg x 2666/ 100
On average 271g of CO2 is released per KM
Bicycles do not require fuel in the same sense of cars and buses, so the ride does not release any
more carbon emissions. Food intake, and the energy which it produces to help a cyclist propel
their bike, is the final piece of a bike commute carbon footprint.
Cyclists on the average diet will add 16 g of CO2 per km ridden.
Write an application that creates objects of each of the three classes, places references to those
objects in ArrayList, then iterates through the ArrayList, polymorphically invoking each object’s
getCarbonFootprint() method. For each object, print some identifying information and the
object’s carbon footprint

*/



