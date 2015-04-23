
  package gen;
  public class Q_Gen103 {
  		@com.google.inject.Inject
  		public Q_Gen103(Q_Gen104 q_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  