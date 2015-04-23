
  package gen;
  public class P_Gen199 {
  		@com.google.inject.Inject
  		public P_Gen199(P_Gen200 p_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  