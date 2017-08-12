package rideshare.framework.proxy;

import rideshare.framework.database.mysql.TestConnection;

public class RealSubjectFactoryImpl<RealSubject> implements RealSubjectFactory<RealSubject> {

	@Override
	public RealSubject getRealSubject() {
		
		RealSubject s = (RealSubject) new RealSubjectImpl();
		return s;
	}

}
