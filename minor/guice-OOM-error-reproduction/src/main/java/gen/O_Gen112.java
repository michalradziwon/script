
  package gen;
  public class O_Gen112 {
  		@com.google.inject.Inject
  		public O_Gen112(O_Gen113 o_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  