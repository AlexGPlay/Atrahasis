package org.blynder.core.browser.chromium.handler;

public interface InitializedObservable {

	public void addObserver(InitializedObserver observer);
	public void notifyObservers();
	
}
