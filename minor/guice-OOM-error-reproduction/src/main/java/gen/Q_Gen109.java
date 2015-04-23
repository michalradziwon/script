
  package gen;
  public class Q_Gen109 {
  		@com.google.inject.Inject
  		public Q_Gen109(Q_Gen110 q_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  