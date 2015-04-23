
  package gen;
  public class I_Gen131 {
  		@com.google.inject.Inject
  		public I_Gen131(I_Gen132 i_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  