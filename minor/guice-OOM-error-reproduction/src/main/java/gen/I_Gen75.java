
  package gen;
  public class I_Gen75 {
  		@com.google.inject.Inject
  		public I_Gen75(I_Gen76 i_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  