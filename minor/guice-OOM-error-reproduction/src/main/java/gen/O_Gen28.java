
  package gen;
  public class O_Gen28 {
  		@com.google.inject.Inject
  		public O_Gen28(O_Gen29 o_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  