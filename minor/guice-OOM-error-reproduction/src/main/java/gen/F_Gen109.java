
  package gen;
  public class F_Gen109 {
  		@com.google.inject.Inject
  		public F_Gen109(F_Gen110 f_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  