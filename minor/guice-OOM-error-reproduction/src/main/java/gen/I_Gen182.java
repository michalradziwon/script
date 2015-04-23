
  package gen;
  public class I_Gen182 {
  		@com.google.inject.Inject
  		public I_Gen182(I_Gen183 i_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  