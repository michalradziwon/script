
  package gen;
  public class O_Gen126 {
  		@com.google.inject.Inject
  		public O_Gen126(O_Gen127 o_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  