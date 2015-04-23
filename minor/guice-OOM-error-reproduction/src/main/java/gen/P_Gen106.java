
  package gen;
  public class P_Gen106 {
  		@com.google.inject.Inject
  		public P_Gen106(P_Gen107 p_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  