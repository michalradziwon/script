
  package gen;
  public class I_Gen39 {
  		@com.google.inject.Inject
  		public I_Gen39(I_Gen40 i_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  