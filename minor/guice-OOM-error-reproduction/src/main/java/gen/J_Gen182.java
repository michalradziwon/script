
  package gen;
  public class J_Gen182 {
  		@com.google.inject.Inject
  		public J_Gen182(J_Gen183 j_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  