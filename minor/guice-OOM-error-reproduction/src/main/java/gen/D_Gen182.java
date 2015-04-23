
  package gen;
  public class D_Gen182 {
  		@com.google.inject.Inject
  		public D_Gen182(D_Gen183 d_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  