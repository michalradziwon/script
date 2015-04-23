
  package gen;
  public class L_Gen126 {
  		@com.google.inject.Inject
  		public L_Gen126(L_Gen127 l_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  