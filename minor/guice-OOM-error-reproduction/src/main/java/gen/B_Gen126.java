
  package gen;
  public class B_Gen126 {
  		@com.google.inject.Inject
  		public B_Gen126(B_Gen127 b_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  