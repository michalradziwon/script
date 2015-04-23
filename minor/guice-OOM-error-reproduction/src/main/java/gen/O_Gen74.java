
  package gen;
  public class O_Gen74 {
  		@com.google.inject.Inject
  		public O_Gen74(O_Gen75 o_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  