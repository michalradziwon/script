
  package gen;
  public class O_Gen6 {
  		@com.google.inject.Inject
  		public O_Gen6(O_Gen7 o_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  