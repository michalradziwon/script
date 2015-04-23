
  package gen;
  public class O_Gen144 {
  		@com.google.inject.Inject
  		public O_Gen144(O_Gen145 o_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  