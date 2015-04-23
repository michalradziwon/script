
  package gen;
  public class O_Gen62 {
  		@com.google.inject.Inject
  		public O_Gen62(O_Gen63 o_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  