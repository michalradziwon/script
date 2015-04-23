
  package gen;
  public class I_Gen64 {
  		@com.google.inject.Inject
  		public I_Gen64(I_Gen65 i_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  