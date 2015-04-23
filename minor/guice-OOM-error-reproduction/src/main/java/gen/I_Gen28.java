
  package gen;
  public class I_Gen28 {
  		@com.google.inject.Inject
  		public I_Gen28(I_Gen29 i_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  