
  package gen;
  public class I_Gen185 {
  		@com.google.inject.Inject
  		public I_Gen185(I_Gen186 i_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  