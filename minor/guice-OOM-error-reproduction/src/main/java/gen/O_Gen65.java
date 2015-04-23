
  package gen;
  public class O_Gen65 {
  		@com.google.inject.Inject
  		public O_Gen65(O_Gen66 o_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  