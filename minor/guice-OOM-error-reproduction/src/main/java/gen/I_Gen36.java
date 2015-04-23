
  package gen;
  public class I_Gen36 {
  		@com.google.inject.Inject
  		public I_Gen36(I_Gen37 i_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  