
  package gen;
  public class O_Gen80 {
  		@com.google.inject.Inject
  		public O_Gen80(O_Gen81 o_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  