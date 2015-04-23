
  package gen;
  public class P_Gen35 {
  		@com.google.inject.Inject
  		public P_Gen35(P_Gen36 p_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  