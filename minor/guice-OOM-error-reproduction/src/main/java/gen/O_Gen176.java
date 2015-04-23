
  package gen;
  public class O_Gen176 {
  		@com.google.inject.Inject
  		public O_Gen176(O_Gen177 o_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  