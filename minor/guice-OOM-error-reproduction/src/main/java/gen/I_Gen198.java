
  package gen;
  public class I_Gen198 {
  		@com.google.inject.Inject
  		public I_Gen198(I_Gen199 i_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  