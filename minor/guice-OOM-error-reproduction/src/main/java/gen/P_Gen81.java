
  package gen;
  public class P_Gen81 {
  		@com.google.inject.Inject
  		public P_Gen81(P_Gen82 p_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  