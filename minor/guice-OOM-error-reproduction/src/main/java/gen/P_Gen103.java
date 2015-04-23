
  package gen;
  public class P_Gen103 {
  		@com.google.inject.Inject
  		public P_Gen103(P_Gen104 p_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  