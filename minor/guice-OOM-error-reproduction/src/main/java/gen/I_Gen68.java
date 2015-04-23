
  package gen;
  public class I_Gen68 {
  		@com.google.inject.Inject
  		public I_Gen68(I_Gen69 i_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  