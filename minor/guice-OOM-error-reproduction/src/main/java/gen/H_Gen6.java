
  package gen;
  public class H_Gen6 {
  		@com.google.inject.Inject
  		public H_Gen6(H_Gen7 h_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  