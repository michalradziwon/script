
  package gen;
  public class P_Gen37 {
  		@com.google.inject.Inject
  		public P_Gen37(P_Gen38 p_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  