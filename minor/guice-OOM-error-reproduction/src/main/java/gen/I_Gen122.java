
  package gen;
  public class I_Gen122 {
  		@com.google.inject.Inject
  		public I_Gen122(I_Gen123 i_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  