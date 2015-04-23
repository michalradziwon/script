
  package gen;
  public class O_Gen16 {
  		@com.google.inject.Inject
  		public O_Gen16(O_Gen17 o_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  