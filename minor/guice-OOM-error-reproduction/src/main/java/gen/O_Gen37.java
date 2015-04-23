
  package gen;
  public class O_Gen37 {
  		@com.google.inject.Inject
  		public O_Gen37(O_Gen38 o_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  