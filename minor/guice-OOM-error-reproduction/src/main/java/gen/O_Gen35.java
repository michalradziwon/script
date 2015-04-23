
  package gen;
  public class O_Gen35 {
  		@com.google.inject.Inject
  		public O_Gen35(O_Gen36 o_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  