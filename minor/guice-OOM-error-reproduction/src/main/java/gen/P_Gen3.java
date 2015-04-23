
  package gen;
  public class P_Gen3 {
  		@com.google.inject.Inject
  		public P_Gen3(P_Gen4 p_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  