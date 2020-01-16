package com.bridgelabz.programs.designPattern.observedDesignPattern;

public class ObserverPatternTest {

	public static void main(String[] args) {
		MyTopic topic = new MyTopic();
		Observer observer1 = new MyTopicSubscriber("object1");
		Observer observer2 = new MyTopicSubscriber("object2");
		Observer observer3 = new MyTopicSubscriber("object3");
		
		topic.registor(observer1);
		topic.registor(observer2);
		topic.registor(observer3);
		
		observer1.setSubject(topic);
		observer2.setSubject(topic);
		observer3.setSubject(topic);
		
		observer1.update();
		topic.postMessage("new update are coming soon...");
	}

}
