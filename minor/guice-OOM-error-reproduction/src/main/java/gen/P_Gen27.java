
  package gen;
  public class P_Gen27 {
  		@com.google.inject.Inject
  		public P_Gen27(P_Gen28 p_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  