
  package gen;
  public class S_Gen126 {
  		@com.google.inject.Inject
  		public S_Gen126(S_Gen127 s_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  