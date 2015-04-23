
  package gen;
  public class I_Gen106 {
  		@com.google.inject.Inject
  		public I_Gen106(I_Gen107 i_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  