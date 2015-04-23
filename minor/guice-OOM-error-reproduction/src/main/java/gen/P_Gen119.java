
  package gen;
  public class P_Gen119 {
  		@com.google.inject.Inject
  		public P_Gen119(P_Gen120 p_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  