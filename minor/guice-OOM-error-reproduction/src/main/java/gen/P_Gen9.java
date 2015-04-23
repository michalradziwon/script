
  package gen;
  public class P_Gen9 {
  		@com.google.inject.Inject
  		public P_Gen9(P_Gen10 p_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  