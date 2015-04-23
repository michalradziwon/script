
  package gen;
  public class J_Gen126 {
  		@com.google.inject.Inject
  		public J_Gen126(J_Gen127 j_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  