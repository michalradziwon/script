
  package gen;
  public class I_Gen199 {
  		@com.google.inject.Inject
  		public I_Gen199(I_Gen200 i_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  