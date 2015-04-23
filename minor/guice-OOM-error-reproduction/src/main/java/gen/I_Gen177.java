
  package gen;
  public class I_Gen177 {
  		@com.google.inject.Inject
  		public I_Gen177(I_Gen178 i_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  