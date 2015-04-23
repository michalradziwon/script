
  package gen;
  public class I_Gen126 {
  		@com.google.inject.Inject
  		public I_Gen126(I_Gen127 i_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  