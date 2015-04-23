
  package gen;
  public class O_Gen196 {
  		@com.google.inject.Inject
  		public O_Gen196(O_Gen197 o_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  