
  package gen;
  public class I_Gen76 {
  		@com.google.inject.Inject
  		public I_Gen76(I_Gen77 i_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  