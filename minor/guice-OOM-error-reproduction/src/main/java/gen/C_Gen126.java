
  package gen;
  public class C_Gen126 {
  		@com.google.inject.Inject
  		public C_Gen126(C_Gen127 c_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  