
  package gen;
  public class P_Gen68 {
  		@com.google.inject.Inject
  		public P_Gen68(P_Gen69 p_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  