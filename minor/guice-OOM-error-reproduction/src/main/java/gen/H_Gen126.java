
  package gen;
  public class H_Gen126 {
  		@com.google.inject.Inject
  		public H_Gen126(H_Gen127 h_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  