
  package gen;
  public class Z_Gen6 {
  		@com.google.inject.Inject
  		public Z_Gen6(Z_Gen7 z_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  