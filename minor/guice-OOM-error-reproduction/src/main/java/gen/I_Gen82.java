
  package gen;
  public class I_Gen82 {
  		@com.google.inject.Inject
  		public I_Gen82(I_Gen83 i_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  