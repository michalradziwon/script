
  package gen;
  public class S_Gen6 {
  		@com.google.inject.Inject
  		public S_Gen6(S_Gen7 s_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  