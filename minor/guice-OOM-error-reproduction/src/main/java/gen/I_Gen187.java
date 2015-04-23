
  package gen;
  public class I_Gen187 {
  		@com.google.inject.Inject
  		public I_Gen187(I_Gen188 i_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  