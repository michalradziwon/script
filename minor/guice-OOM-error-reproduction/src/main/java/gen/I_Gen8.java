
  package gen;
  public class I_Gen8 {
  		@com.google.inject.Inject
  		public I_Gen8(I_Gen9 i_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  