
  package gen;
  public class O_Gen83 {
  		@com.google.inject.Inject
  		public O_Gen83(O_Gen84 o_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  