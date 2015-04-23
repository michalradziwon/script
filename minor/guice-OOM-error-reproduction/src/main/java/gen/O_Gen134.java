
  package gen;
  public class O_Gen134 {
  		@com.google.inject.Inject
  		public O_Gen134(O_Gen135 o_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  