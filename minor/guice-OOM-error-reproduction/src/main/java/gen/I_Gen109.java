
  package gen;
  public class I_Gen109 {
  		@com.google.inject.Inject
  		public I_Gen109(I_Gen110 i_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  