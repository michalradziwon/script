
  package gen;
  public class P_Gen140 {
  		@com.google.inject.Inject
  		public P_Gen140(P_Gen141 p_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  