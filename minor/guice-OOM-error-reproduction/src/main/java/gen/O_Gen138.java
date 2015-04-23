
  package gen;
  public class O_Gen138 {
  		@com.google.inject.Inject
  		public O_Gen138(O_Gen139 o_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  