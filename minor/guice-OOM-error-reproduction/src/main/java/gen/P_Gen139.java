
  package gen;
  public class P_Gen139 {
  		@com.google.inject.Inject
  		public P_Gen139(P_Gen140 p_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  