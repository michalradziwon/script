
  package gen;
  public class I_Gen65 {
  		@com.google.inject.Inject
  		public I_Gen65(I_Gen66 i_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  