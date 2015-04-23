
  package gen;
  public class Q_Gen75 {
  		@com.google.inject.Inject
  		public Q_Gen75(Q_Gen76 q_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  