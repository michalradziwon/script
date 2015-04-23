
  package gen;
  public class D_Gen126 {
  		@com.google.inject.Inject
  		public D_Gen126(D_Gen127 d_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  