
  package gen;
  public class O_Gen187 {
  		@com.google.inject.Inject
  		public O_Gen187(O_Gen188 o_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  