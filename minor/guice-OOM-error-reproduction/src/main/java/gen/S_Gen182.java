
  package gen;
  public class S_Gen182 {
  		@com.google.inject.Inject
  		public S_Gen182(S_Gen183 s_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  