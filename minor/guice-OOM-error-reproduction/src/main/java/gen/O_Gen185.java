
  package gen;
  public class O_Gen185 {
  		@com.google.inject.Inject
  		public O_Gen185(O_Gen186 o_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  