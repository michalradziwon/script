
  package gen;
  public class O_Gen81 {
  		@com.google.inject.Inject
  		public O_Gen81(O_Gen82 o_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  