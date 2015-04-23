
  package gen;
  public class O_Gen96 {
  		@com.google.inject.Inject
  		public O_Gen96(O_Gen97 o_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  