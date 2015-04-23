
  package gen;
  public class P_Gen64 {
  		@com.google.inject.Inject
  		public P_Gen64(P_Gen65 p_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  