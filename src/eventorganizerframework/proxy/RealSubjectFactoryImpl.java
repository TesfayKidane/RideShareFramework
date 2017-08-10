package eventorganizerframework.proxy;

import eventorganizerframework.database.TestConnection;

public class RealSubjectFactoryImpl<RealSubject> implements RealSubjectFactory<RealSubject> {

	@Override
	public RealSubject getRealSubject() {
		
		RealSubject s = (RealSubject) new RealSubjectImpl();
		return s;
	}

}
