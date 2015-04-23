
  package gen;
  public class P_Gen126 {
  		@com.google.inject.Inject
  		public P_Gen126(P_Gen127 p_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  