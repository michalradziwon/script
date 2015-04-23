
  package gen;
  public class I_Gen27 {
  		@com.google.inject.Inject
  		public I_Gen27(I_Gen28 i_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  