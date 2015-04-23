
  package gen;
  public class I_Gen1 {
  		@com.google.inject.Inject
  		public I_Gen1(I_Gen2 i_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  