
  package gen;
  public class P_Gen71 {
  		@com.google.inject.Inject
  		public P_Gen71(P_Gen72 p_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  