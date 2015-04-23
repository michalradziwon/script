
  package gen;
  public class O_Gen109 {
  		@com.google.inject.Inject
  		public O_Gen109(O_Gen110 o_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  