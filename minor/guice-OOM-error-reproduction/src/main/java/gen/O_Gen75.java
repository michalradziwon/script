
  package gen;
  public class O_Gen75 {
  		@com.google.inject.Inject
  		public O_Gen75(O_Gen76 o_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  