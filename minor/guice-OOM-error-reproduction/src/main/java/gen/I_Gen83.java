
  package gen;
  public class I_Gen83 {
  		@com.google.inject.Inject
  		public I_Gen83(I_Gen84 i_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  