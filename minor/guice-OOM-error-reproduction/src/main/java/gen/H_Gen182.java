
  package gen;
  public class H_Gen182 {
  		@com.google.inject.Inject
  		public H_Gen182(H_Gen183 h_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  