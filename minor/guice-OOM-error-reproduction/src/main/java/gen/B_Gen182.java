
  package gen;
  public class B_Gen182 {
  		@com.google.inject.Inject
  		public B_Gen182(B_Gen183 b_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  