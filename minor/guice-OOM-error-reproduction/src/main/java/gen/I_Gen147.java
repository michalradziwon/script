
  package gen;
  public class I_Gen147 {
  		@com.google.inject.Inject
  		public I_Gen147(I_Gen148 i_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  