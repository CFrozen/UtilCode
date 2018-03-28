
	public class SingletonClass {
		private static SingletonClass instance = null ;
		public static SingletonClass getInstance(){
			if (instance == null){
				synchronized(SingletonClass.class){
					if (instance == null){
						instance = new SingletonClass();
					}
				}
			}
			return instance;
		}
		private SingletonClass(){
			
		}

	}///////////////////////双重锁单例模式//////////////////////////////
/*	public class Single {
		private static Single instance1 = null ;
		public static Single getInstance(){
			if (instance1 == null){
				instance1 = new Single();
			}
		
			return instance1;
		}
		private Single(){
		}
		public static void main(String[] args){
			Single instance1 = Single.getInstance();
		}

	}*/
	//////////////////////////////懒汉模式



