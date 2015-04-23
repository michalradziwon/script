
  package gen;
  public class O_Gen161 {
  		@com.google.inject.Inject
  		public O_Gen161(O_Gen162 o_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  