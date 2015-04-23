
  package gen;
  public class Q_Gen110 {
  		@com.google.inject.Inject
  		public Q_Gen110(Q_Gen111 q_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  