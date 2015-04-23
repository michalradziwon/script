
  package gen;
  public class P_Gen125 {
  		@com.google.inject.Inject
  		public P_Gen125(P_Gen126 p_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  