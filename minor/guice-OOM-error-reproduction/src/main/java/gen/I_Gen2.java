
  package gen;
  public class I_Gen2 {
  		@com.google.inject.Inject
  		public I_Gen2(I_Gen3 i_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  