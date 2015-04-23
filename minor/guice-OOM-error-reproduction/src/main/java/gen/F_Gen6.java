
  package gen;
  public class F_Gen6 {
  		@com.google.inject.Inject
  		public F_Gen6(F_Gen7 f_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  