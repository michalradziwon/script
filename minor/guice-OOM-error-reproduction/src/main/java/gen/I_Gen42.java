
  package gen;
  public class I_Gen42 {
  		@com.google.inject.Inject
  		public I_Gen42(I_Gen43 i_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  