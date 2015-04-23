
  package gen;
  public class B_Gen6 {
  		@com.google.inject.Inject
  		public B_Gen6(B_Gen7 b_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  