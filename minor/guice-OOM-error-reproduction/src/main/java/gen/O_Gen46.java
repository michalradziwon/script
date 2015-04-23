
  package gen;
  public class O_Gen46 {
  		@com.google.inject.Inject
  		public O_Gen46(O_Gen47 o_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  