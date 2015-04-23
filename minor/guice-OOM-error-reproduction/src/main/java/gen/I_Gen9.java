
  package gen;
  public class I_Gen9 {
  		@com.google.inject.Inject
  		public I_Gen9(I_Gen10 i_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  