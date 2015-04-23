
  package gen;
  public class I_Gen12 {
  		@com.google.inject.Inject
  		public I_Gen12(I_Gen13 i_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  