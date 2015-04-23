
  package gen;
  public class O_Gen108 {
  		@com.google.inject.Inject
  		public O_Gen108(O_Gen109 o_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  