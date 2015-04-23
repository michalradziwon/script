
  package gen;
  public class I_Gen46 {
  		@com.google.inject.Inject
  		public I_Gen46(I_Gen47 i_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  