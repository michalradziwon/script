
  package gen;
  public class I_Gen37 {
  		@com.google.inject.Inject
  		public I_Gen37(I_Gen38 i_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  