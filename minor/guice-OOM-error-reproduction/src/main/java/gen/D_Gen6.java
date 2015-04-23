
  package gen;
  public class D_Gen6 {
  		@com.google.inject.Inject
  		public D_Gen6(D_Gen7 d_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  