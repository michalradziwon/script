
  package gen;
  public class Q_Gen187 {
  		@com.google.inject.Inject
  		public Q_Gen187(Q_Gen188 q_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + q_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  