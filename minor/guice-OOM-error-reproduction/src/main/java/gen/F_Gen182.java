
  package gen;
  public class F_Gen182 {
  		@com.google.inject.Inject
  		public F_Gen182(F_Gen183 f_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  