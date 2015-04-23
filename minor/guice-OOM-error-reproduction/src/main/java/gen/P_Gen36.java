
  package gen;
  public class P_Gen36 {
  		@com.google.inject.Inject
  		public P_Gen36(P_Gen37 p_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  