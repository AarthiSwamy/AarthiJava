
public class Main {


	public static void main(String[] args) {
		Movers movers = new Movers();
		movers.getmiles(3);
		movers.makeDecision();
		movers.getfeedBack();
		Accepted accepted = new Accepted();
		accepted.makeDecision();
	}

}


/**
Movers company

Order In take/Accept or Deny
Incoming Request should be within 5miles

Determining Size 
Number of objects less than 5 = 1 person
Number of objects 5 and above less than 10 = 2 person
10 and above = 4 person

Charging - Week day 100$, Weekend 50$

Proceed order/not (customer acceptance recieved)

Dispatch workers on move day

Recieve Feedback

Record and Close file **/
