
  package gen;
  public class O_Gen76 {
  		@com.google.inject.Inject
  		public O_Gen76(O_Gen77 o_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  