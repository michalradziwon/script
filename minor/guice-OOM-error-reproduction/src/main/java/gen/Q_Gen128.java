
  package gen;
  public class Q_Gen128 {
  		@com.google.inject.Inject
  		public Q_Gen128(Q_Gen129 q_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  