
  package gen;
  public class I_Gen138 {
  		@com.google.inject.Inject
  		public I_Gen138(I_Gen139 i_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  