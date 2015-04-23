
  package gen;
  public class O_Gen120 {
  		@com.google.inject.Inject
  		public O_Gen120(O_Gen121 o_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  