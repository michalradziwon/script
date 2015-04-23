
  package gen;
  public class R_Gen6 {
  		@com.google.inject.Inject
  		public R_Gen6(R_Gen7 r_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  