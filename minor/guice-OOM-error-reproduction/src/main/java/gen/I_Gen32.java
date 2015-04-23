
  package gen;
  public class I_Gen32 {
  		@com.google.inject.Inject
  		public I_Gen32(I_Gen33 i_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  