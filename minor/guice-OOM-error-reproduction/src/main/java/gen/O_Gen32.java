
  package gen;
  public class O_Gen32 {
  		@com.google.inject.Inject
  		public O_Gen32(O_Gen33 o_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  