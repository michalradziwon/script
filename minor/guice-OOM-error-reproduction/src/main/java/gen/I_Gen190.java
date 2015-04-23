
  package gen;
  public class I_Gen190 {
  		@com.google.inject.Inject
  		public I_Gen190(I_Gen191 i_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  