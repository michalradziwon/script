
  package gen;
  public class Q_Gen131 {
  		@com.google.inject.Inject
  		public Q_Gen131(Q_Gen132 q_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  