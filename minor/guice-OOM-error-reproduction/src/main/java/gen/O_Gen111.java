
  package gen;
  public class O_Gen111 {
  		@com.google.inject.Inject
  		public O_Gen111(O_Gen112 o_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  