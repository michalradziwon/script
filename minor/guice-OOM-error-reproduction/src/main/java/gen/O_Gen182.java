
  package gen;
  public class O_Gen182 {
  		@com.google.inject.Inject
  		public O_Gen182(O_Gen183 o_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  