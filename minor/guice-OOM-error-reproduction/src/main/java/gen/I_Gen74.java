
  package gen;
  public class I_Gen74 {
  		@com.google.inject.Inject
  		public I_Gen74(I_Gen75 i_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  