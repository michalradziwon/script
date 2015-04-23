
  package gen;
  public class I_Gen108 {
  		@com.google.inject.Inject
  		public I_Gen108(I_Gen109 i_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  